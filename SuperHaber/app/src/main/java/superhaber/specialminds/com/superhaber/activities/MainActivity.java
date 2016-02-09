package superhaber.specialminds.com.superhaber.activities;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.TypeFactory;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import de.greenrobot.event.EventBus;
import hugo.weaving.DebugLog;
import superhaber.specialminds.com.superhaber.R;
import superhaber.specialminds.com.superhaber.adapters.CustomPagerAdapter;
import superhaber.specialminds.com.superhaber.core.ApplicationMain;
import superhaber.specialminds.com.superhaber.core.Constants;
import superhaber.specialminds.com.superhaber.models.AnnounceObject;
import superhaber.specialminds.com.superhaber.models.MainPageSliderObject;
import superhaber.specialminds.com.superhaber.models.FlashObject;
import superhaber.specialminds.com.superhaber.requests.GetMainFlashRequest;
import superhaber.specialminds.com.superhaber.requests.GetMainSliderRequest;
import superhaber.specialminds.com.superhaber.utils.AndroidUtils;
import superhaber.specialminds.com.superhaber.utils.viewpagerindicator.CirclePageIndicator;

public class MainActivity extends ActionBarActivity implements NavigationDrawerFragment.NavigationDrawerCallbacks {

    private NavigationDrawerFragment mNavigationDrawerFragment;
    private LinearLayout viewPagerContainer;
    private CharSequence mTitle;
    private Toolbar toolbar;
    private ViewPager pager;
    private CirclePageIndicator indicator;
    public List<MainPageSliderObject> categoryList;
    public ArrayList<FlashObject> flashObjectList;
    CustomPagerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        pager = (ViewPager) findViewById(R.id.pager);
        indicator = (CirclePageIndicator) findViewById(R.id.indicator);
        viewPagerContainer = (LinearLayout) findViewById(R.id.viewPagerContainer);

        mNavigationDrawerFragment = (NavigationDrawerFragment) getSupportFragmentManager().findFragmentById(R.id.navigation_drawer);
        mTitle = getTitle();

        if (toolbar != null) {
            toolbar.setTitle("Navigation Drawer");
            setSupportActionBar(toolbar);
        }

        getMainSliderItems();
        getMainFlashItems();
        // Set up the drawer.
        mNavigationDrawerFragment.setUp(R.id.navigation_drawer, (DrawerLayout) findViewById(R.id.drawerLayout));

        resizeViewPagerContainer();

        EventBus.getDefault().post(new AnnounceObject(R.drawable.ic_drawer, "SON 24 SAAT", "MANŞETTEKİ HABERLER", "AnnounceFragment1"));
        EventBus.getDefault().post(new AnnounceObject(R.drawable.ic_drawer,"DAKİKA DAKİKA","GÜNCEL HABERLER","AnnounceFragment2"));
    }

    private void resizeViewPagerContainer() {
        int height =  AndroidUtils.getScreenHeight(this);
        Log.v("Dimensions", height + " " + (height / 4) * 3);

        height = AndroidUtils.dpToPixels(this, height);
        Log.v("Dimensions", height + " " + (height / 4) * 3);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, (height/5)*3);
        viewPagerContainer.setLayoutParams(params);
    }

    @Override
    public void onNavigationDrawerItemSelected(int position) {

    }

    public void onSectionAttached(int number) {
        switch (number) {
            case 1:
                mTitle = getString(R.string.title_section1);
                break;
            case 2:
                mTitle = getString(R.string.title_section2);
                break;
            case 3:
                mTitle = getString(R.string.title_section3);
                break;
        }
    }

    public void restoreActionBar() {
        ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.setTitle(mTitle);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if (!mNavigationDrawerFragment.isDrawerOpen()) {
            getMenuInflater().inflate(R.menu.main, menu);
            restoreActionBar();
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void getMainSliderItems() {
        GetMainSliderRequest getMainSliderRequest = new GetMainSliderRequest(Request.Method.GET, Constants.URL_MAIN_SLIDER,null, new Response.Listener<JSONObject>() {
            @DebugLog
            @Override
            public void onResponse(JSONObject response) {
                if (response == null)
                    return;

                try {
                    JSONArray array = response.getJSONArray("item");
                    TypeFactory typeFactory = ApplicationMain.getInstance().getObjectMapper().getTypeFactory();
                    CollectionType collectionType = typeFactory.constructCollectionType(List.class, MainPageSliderObject.class);
                    categoryList = ApplicationMain.getInstance().getObjectMapper().readValue(array.toString(), collectionType);

                    mAdapter = new CustomPagerAdapter(getSupportFragmentManager(),categoryList);
                    pager.setAdapter(mAdapter);
                    indicator = (CirclePageIndicator)findViewById(R.id.indicator);
                    indicator.setViewPager(pager);

                } catch (JSONException e) {
                    e.printStackTrace();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });


        ApplicationMain.getInstance().getRequestQueue().add(getMainSliderRequest);

    }

    public void getMainFlashItems() {
        GetMainFlashRequest getMainSliderRequest = new GetMainFlashRequest(Request.Method.GET, String.format(Constants.URL_CATEGORY_SLIDER,1),null, new Response.Listener<JSONObject>() {
            @DebugLog
            @Override
            public void onResponse(JSONObject response) {
                if (response == null)
                    return;

                try {
                    JSONArray array = response.getJSONArray("item");
                    TypeFactory typeFactory = ApplicationMain.getInstance().getObjectMapper().getTypeFactory();
                    CollectionType collectionType = typeFactory.constructCollectionType(List.class, FlashObject.class);
                    flashObjectList = ApplicationMain.getInstance().getObjectMapper().readValue(array.toString(), collectionType);
                    findFragment(flashObjectList);
                } catch (JSONException e) {
                    e.printStackTrace();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });


        ApplicationMain.getInstance().getRequestQueue().add(getMainSliderRequest);

    }

    public void findFragment(ArrayList<FlashObject> flashObjectList){
        getSupportFragmentManager().beginTransaction().add(R.id.flashContainer,MainFlashFragment.newInstance(flashObjectList),"").commit();
    }
}
