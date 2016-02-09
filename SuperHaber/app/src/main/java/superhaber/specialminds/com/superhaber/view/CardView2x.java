package superhaber.specialminds.com.superhaber.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import butterknife.ButterKnife;
import butterknife.InjectView;
import superhaber.specialminds.com.superhaber.R;
import superhaber.specialminds.com.superhaber.core.Constants;
import superhaber.specialminds.com.superhaber.models.FlashObject;

/**
 * Created by talhakosen on 27/05/15.
 */

public class CardView2x extends FrameLayout {

    @InjectView(R.id.imgNews)
    ImageView imgNews;
    @InjectView(R.id.txtTitle)
    TextView txtTitle;
    @InjectView(R.id.txtDesc)
    TextView txtDesc;
    @InjectView(R.id.txtNewsType)
    TextView txtNewsType;
    @InjectView(R.id.txtNewsPaper)
    TextView txtNewsPaper;
    @InjectView(R.id.txtTime)
    TextView txtTime;
    @InjectView(R.id.frameLayoutNewsType)
    FrameLayout frameLayoutNewsType;



    public CardView2x(Context context) {
        this(context, null);
    }

    public CardView2x(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CardView2x(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    private void init() {
        LayoutInflater.from(getContext()).inflate(R.layout.card_view_2x, this, true);
        ButterKnife.inject(this);
    }

    public void setObject(FlashObject flashObject) {
        Picasso.with(getContext()).load(Constants.URL_IMAGE + flashObject.getManset_resim()).into(imgNews);
        frameLayoutNewsType.setBackgroundColor(flashObject.getKategoriArkaPlan());
        txtDesc.setText(flashObject.getManset_kisa_icerik());
        txtNewsPaper.setText(flashObject.getManset_kaynak());
        txtTitle.setText(flashObject.getManset_baslik());
        txtNewsType.setText(flashObject.getKategori_adi());
    }
}