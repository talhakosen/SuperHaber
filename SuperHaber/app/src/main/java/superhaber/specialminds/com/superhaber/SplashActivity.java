package superhaber.specialminds.com.superhaber;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.TypeFactory;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.List;

import hugo.weaving.DebugLog;
import superhaber.specialminds.com.superhaber.core.ApplicationMain;
import superhaber.specialminds.com.superhaber.core.Constants;
import superhaber.specialminds.com.superhaber.models.CategoryPageSliderObject;
import superhaber.specialminds.com.superhaber.requests.GetMainSliderRequest;


public class SplashActivity extends ActionBarActivity {
    public List<CategoryPageSliderObject> categoryList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        final ObjectMapper objectMapper = new ObjectMapper();

        GetMainSliderRequest getMainSliderRequest = new GetMainSliderRequest(Request.Method.GET, Constants.URL_MAIN_SLIDER,null, new Response.Listener<JSONObject>() {
            @DebugLog
            @Override
            public void onResponse(JSONObject response) {
                if (response == null)
                    return;

                try {
                    JSONArray array = response.getJSONArray("item");
                    TypeFactory typeFactory = objectMapper.getTypeFactory();
                    CollectionType collectionType = typeFactory.constructCollectionType(List.class, CategoryPageSliderObject.class);
                    categoryList = objectMapper.readValue(array.toString(), collectionType);
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


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_splash, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
