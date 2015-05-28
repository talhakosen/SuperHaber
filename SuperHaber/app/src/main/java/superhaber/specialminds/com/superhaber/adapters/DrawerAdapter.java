package superhaber.specialminds.com.superhaber.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;
import superhaber.specialminds.com.superhaber.R;
import superhaber.specialminds.com.superhaber.models.CategoryObject;

public class DrawerAdapter extends ArrayAdapter<CategoryObject> {
    private static LayoutInflater inflater = null;
    private Activity activity;
    private List<CategoryObject> lItems;

    public DrawerAdapter(Activity activity, int textViewResourceId, List<CategoryObject> _lItems) {
        super(activity, textViewResourceId, _lItems);
        this.activity = activity;
        this.lItems = _lItems;
        inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public int getCount() {
        return lItems.size();
    }

    public CategoryObject getItem(CategoryObject position) {
        return position;
    }

    public long getItemId(int position) {
        return position;
    }

    @SuppressWarnings("deprecation")
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        View view = inflater.inflate(R.layout.fragment_drawer_item, parent, false);;
        if (lItems.get(position).getKategori_tipi() == CategoryObject.CategoryType.ImageText) {
            holder = new ViewHolder(view);
            holder.image.setTag(position);
            Picasso.with(inflater.getContext()).load("http://lorempixel.com/200/200/sports/" + (position + 1)).into(holder.image);
            holder.text.setText(lItems.get(position).getKategori_adi());
        } else if (lItems.get(position).getKategori_tipi() == CategoryObject.CategoryType.Text) {
            view = inflater.inflate(R.layout.fragment_drawer_item, parent, false);
            holder = new ViewHolder(view);
            holder.image.setVisibility(View.GONE);
            holder.text.setText(lItems.get(position).getKategori_adi());
        } else if (lItems.get(position).getKategori_tipi() == CategoryObject.CategoryType.YO) {
            view = inflater.inflate(R.layout.fragment_drawer_yazar_oku_item, parent, false);
        }

        return view;
    }

    static class ViewHolder {
        @InjectView(R.id.drawer_item_icon)
        ImageView image;

        @InjectView(R.id.drawer_item_text)
        TextView text;

        public ViewHolder(View view) {
            ButterKnife.inject(this, view);
        }
    }
}
