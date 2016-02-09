package superhaber.specialminds.com.superhaber.activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import butterknife.ButterKnife;
import butterknife.InjectView;
import superhaber.specialminds.com.superhaber.R;
import superhaber.specialminds.com.superhaber.models.FlashObject;
import superhaber.specialminds.com.superhaber.view.CardView;
import superhaber.specialminds.com.superhaber.view.CardView2x;

public final class MainFlashFragment extends Fragment {
    private static final String KEY_CONTENT = "TestFragment:Content";
    private ArrayList<FlashObject> flashObjects;

    @InjectView(R.id.cardview1)
    CardView2x cardview1;

    @InjectView(R.id.cardview2)
    CardView cardview2;

    @InjectView(R.id.cardview3)
    CardView cardview3;


    public static MainFlashFragment newInstance(ArrayList<FlashObject> flashObjects) {
        MainFlashFragment fragment = new MainFlashFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(KEY_CONTENT, flashObjects);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        flashObjects=new ArrayList<>();

        if ((savedInstanceState != null) && savedInstanceState.containsKey(KEY_CONTENT)) {
            flashObjects = savedInstanceState.getParcelableArrayList(KEY_CONTENT);
        } else {
            flashObjects = getArguments().getParcelableArrayList(KEY_CONTENT);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_flash_fragment, container, false);
        ButterKnife.inject(this, view);

        cardview1.setObject(flashObjects.get(0));
        cardview2.setObject(flashObjects.get(1));
        cardview3.setObject(flashObjects.get(2));

        return view;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putParcelableArrayList(KEY_CONTENT, flashObjects);
    }
}
