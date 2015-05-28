package superhaber.specialminds.com.superhaber.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

import superhaber.specialminds.com.superhaber.activities.MainSliderFragment;
import superhaber.specialminds.com.superhaber.models.CategoryPageSliderObject;


public class CustomPagerAdapter extends FragmentPagerAdapter {
    List<CategoryPageSliderObject> items;

    public CustomPagerAdapter(FragmentManager fm, List<CategoryPageSliderObject> items) {
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
