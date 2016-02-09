package superhaber.specialminds.com.superhaber.activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.InjectView;
import de.greenrobot.event.EventBus;
import superhaber.specialminds.com.superhaber.R;
import superhaber.specialminds.com.superhaber.models.AnnounceObject;

public final class AnnounceFragment extends Fragment {
    private static final String KEY_CONTENT = "AnnounceFragment:Content";
    private AnnounceObject announceObject;

    @InjectView(R.id.announce_icon)
    ImageView announce_icon;

    @InjectView(R.id.announce_title_one)
    TextView announce_title_one;

    @InjectView(R.id.announce_title_two)
    TextView announce_title_two;

    @InjectView(R.id.announce_title_seperator)
    TextView announce_title_seperator;


    public static AnnounceFragment newInstance(AnnounceObject announceObject) {
        AnnounceFragment fragment = new AnnounceFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable(KEY_CONTENT, announceObject);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EventBus.getDefault().register(this);


        if ((savedInstanceState != null) && savedInstanceState.containsKey(KEY_CONTENT)) {
            announceObject = savedInstanceState.getParcelable(KEY_CONTENT);
        } else if (getArguments() !=null && getArguments().getParcelable(KEY_CONTENT) != null) {
            announceObject = getArguments().getParcelable(KEY_CONTENT);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.announce_layout, container, false);
        ButterKnife.inject(this, view);
        if (announceObject == null)
            return view;

        announce_icon.setBackgroundResource(announceObject.getIcon());
        if (!announceObject.isTitleOneEmpty())
            announce_title_one.setText(announceObject.getTitle_one());

        if (!announceObject.isTitleTwoEmpty()) {
            announce_title_two.setText(announceObject.getTitle_two());
        } else {
            announce_title_two.setVisibility(View.GONE);
            announce_title_seperator.setVisibility(View.GONE);
        }

        return view;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putParcelable(KEY_CONTENT, announceObject);
    }

    public void onEvent(AnnounceObject announceObject) {
        if (announceObject == null)
            return;

        if (!announceObject.getTag().equals(getTag()))
            return;

        announce_icon.setBackgroundResource(announceObject.getIcon());
        if (!announceObject.isTitleOneEmpty())
            announce_title_one.setText(announceObject.getTitle_one());

        if (!announceObject.isTitleTwoEmpty()) {
            announce_title_two.setText(announceObject.getTitle_two());
        } else {
            announce_title_two.setVisibility(View.GONE);
            announce_title_seperator.setVisibility(View.GONE);
        }
    }
}
