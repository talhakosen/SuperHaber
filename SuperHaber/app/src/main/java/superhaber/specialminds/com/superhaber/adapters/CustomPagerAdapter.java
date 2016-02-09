package superhaber.specialminds.com.superhaber.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

import superhaber.specialminds.com.superhaber.activities.MainSliderFragment;
import superhaber.specialminds.com.superhaber.models.MainPageSliderObject;


public class CustomPagerAdapter extends FragmentPagerAdapter {
    List<MainPageSliderObject> items;

    public CustomPagerAdapter(FragmentManager fm, List<MainPageSliderObject> items) {
        super(fm);
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }


    @Override
    public Fragment getItem(int position) {
        return MainSliderFragment.newInstance(items.get(position));
    }
}
