package superhaber.specialminds.com.superhaber.models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by talhakosen on 29/05/15.
 */

public class AnnounceObject implements Parcelable {
    private int icon;
    private String title_one;
    private String title_two;
    private String tag;

    public static final Creator<AnnounceObject> CREATOR = new Creator<AnnounceObject>() {
        @Override
        public AnnounceObject createFromParcel(Parcel in) {
            final AnnounceObject entry = new AnnounceObject();
            entry.readFromParcel(in);
            return entry;
        }

        @Override
        public AnnounceObject[] newArray(int size) {
            return new AnnounceObject[size];
        }
    };

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getTitle_one() {
        return title_one;
    }

    public void setTitle_one(String title_one) {
        this.title_one = title_one;
    }

    public String getTitle_two() {
        return title_two;
    }

    public void setTitle_two(String title_two) {
        this.title_two = title_two;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public boolean isTitleOneEmpty(){
        if(title_one!=null && !title_one.equals(""))
            return false;

        return true;
    }

    public boolean isTitleTwoEmpty(){
        if(title_two!=null && !title_two.equals(""))
            return false;

        return true;
    }

    public AnnounceObject(int icon, String title_one, String title_two, String tag) {
        this.icon = icon;
        this.title_one = title_one;
        this.title_two = title_two;
        this.tag = tag;
    }

    public AnnounceObject() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AnnounceObject)) return false;

        AnnounceObject that = (AnnounceObject) o;

        if (getIcon() != that.getIcon()) return false;
        if (getTitle_one() != null ? !getTitle_one().equals(that.getTitle_one()) : that.getTitle_one() != null)
            return false;
        if (getTitle_two() != null ? !getTitle_two().equals(that.getTitle_two()) : that.getTitle_two() != null)
            return false;

        return !(getTag() != null ? !getTag().equals(that.getTag()) : that.getTag() != null);
    }

    @Override
    public int hashCode() {
        int result = getIcon();
        result = 31 * result + (getTitle_one() != null ? getTitle_one().hashCode() : 0);
        result = 31 * result + (getTitle_two() != null ? getTitle_two().hashCode() : 0);
        result = 31 * result + (getTag() != null ? getTag().hashCode() : 0);
        return result;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {
        out.writeInt(icon);
        out.writeString(title_one);
        out.writeString(title_two);
        out.writeString(tag);
    };

    protected void readFromParcel(Parcel in) {
        icon = in.readInt();
        title_one = in.readString();
        title_two = in.readString();
        tag = in.readString();
    }
}
