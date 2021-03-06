package superhaber.specialminds.com.superhaber.activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import butterknife.ButterKnife;
import butterknife.InjectView;
import superhaber.specialminds.com.superhaber.R;
import superhaber.specialminds.com.superhaber.core.Constants;
import superhaber.specialminds.com.superhaber.models.MainPageSliderObject;

public final class MainSliderFragment extends Fragment {
    private static final String KEY_CONTENT = "TestFragment:Content";
    private MainPageSliderObject mainPageSliderObject;

    @InjectView(R.id.imgNews)
    ImageView imgNews;
    @InjectView(R.id.txtTitle)
    TextView txtTitle;
    @InjectView(R.id.txtNewsPaper)
    TextView txtNewsPaper;
    @InjectView(R.id.txtTime)
    TextView txtTime;
    @InjectView(R.id.txtShortDesc)
    TextView txtShortDesc;


    public static MainSliderFragment newInstance(MainPageSliderObject mainPageSliderObject) {
        MainSliderFragment fragment = new MainSliderFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable(KEY_CONTENT, mainPageSliderObject);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if ((savedInstanceState != null) && savedInstanceState.containsKey(KEY_CONTENT)) {
            mainPageSliderObject = savedInstanceState.getParcelable(KEY_CONTENT);
        }else{
            mainPageSliderObject = getArguments().getParcelable(KEY_CONTENT);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_slider_pager_view_fragment, container, false);
        ButterKnife.inject(this, view);
        Log.v("imgNews",Constants.URL_IMAGE + mainPageSliderObject.getKarisik_resim());
        Picasso.with(inflater.getContext()).load(Constants.URL_IMAGE + mainPageSliderObject.getKarisik_resim()).into(imgNews);
        txtTitle.setText(mainPageSliderObject.getKarisik_baslik().toUpperCase());
        txtNewsPaper.setText(mainPageSliderObject.getKarisik_kaynak());
        txtTime.setText(mainPageSliderObject.getKarisik_google_saati());
        txtShortDesc.setText(mainPageSliderObject.getKarisik_kisa_icerik());
        return view;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putParcelable(KEY_CONTENT, mainPageSliderObject);
    }
}
