package superhaber.specialminds.com.superhaber.models;

import android.os.Parcel;
import android.os.Parcelable;


import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by talhakosen on 23/05/15.
 */



public class CategoryObject implements Parcelable {
    @JsonProperty
    String kategori_id;
    @JsonProperty
    String kategori_adi;
    @JsonProperty
    String kategori_alt_cizgi;
    @JsonProperty
    String kategori_arkaplan;
    @JsonProperty
    String kategori_link;
    @JsonProperty
    String kategori_sira;
    @JsonProperty
    String YazarokuKategoriID;
    @JsonProperty
    String ana_kategori_kontrol;
    @JsonProperty
    String kategori_logo;
    CategoryType kategori_tipi;

    public enum CategoryType {
        ImageText,Text,YO,
    }


    public static final Parcelable.Creator<CategoryObject> CREATOR = new Parcelable.Creator<CategoryObject>() {
        @Override
        public CategoryObject createFromParcel(Parcel in) {
            final CategoryObject entry = new CategoryObject();
            entry.readFromParcel(in);
            return entry;
        }

        @Override
        public CategoryObject[] newArray(int size) {
            return new CategoryObject[size];
        }
    };

    public CategoryObject() {
        kategori_tipi = CategoryType.ImageText;
    }

    public CategoryObject(CategoryType categoryType,String kategori_id) {
        kategori_tipi = categoryType;
        this.kategori_id =kategori_id;
    }

    public CategoryObject(CategoryType categoryType,String kategori_adi,String kategori_id) {
        this.kategori_tipi = categoryType;
        this.kategori_adi =kategori_adi;
        this.kategori_id =kategori_id;
    }


    public String getKategori_id() {
        return kategori_id;
    }

    public void setKategori_id(String kategori_id) {
        this.kategori_id = kategori_id;
    }

    public String getKategori_adi() {
        return kategori_adi;
    }

    public void setKategori_adi(String kategori_adi) {
        this.kategori_adi = kategori_adi;
    }

    public String getKategori_alt_cizgi() {
        return kategori_alt_cizgi;
    }

    public void setKategori_alt_cizgi(String kategori_alt_cizgi) {
        this.kategori_alt_cizgi = kategori_alt_cizgi;
    }

    public String getKategori_arkaplan() {
        return kategori_arkaplan;
    }

    public void setKategori_arkaplan(String kategori_arkaplan) {
        this.kategori_arkaplan = kategori_arkaplan;
    }

    public String getKategori_link() {
        return kategori_link;
    }

    public void setKategori_link(String kategori_link) {
        this.kategori_link = kategori_link;
    }

    public String getKategori_sira() {
        return kategori_sira;
    }

    public void setKategori_sira(String kategori_sira) {
        this.kategori_sira = kategori_sira;
    }

    public String getYazarokuKategoriID() {
        return YazarokuKategoriID;
    }

    public void setYazarokuKategoriID(String yazarokuKategoriID) {
        YazarokuKategoriID = yazarokuKategoriID;
    }

    public String getAna_kategori_kontrol() {
        return ana_kategori_kontrol;
    }

    public void setAna_kategori_kontrol(String ana_kategori_kontrol) {
        this.ana_kategori_kontrol = ana_kategori_kontrol;
    }

    public String getKategori_logo() {
        return kategori_logo;
    }

    public void setKategori_logo(String kategori_logo) {
        this.kategori_logo = kategori_logo;
    }

    public CategoryType getKategori_tipi() {
        return kategori_tipi;
    }

    public void setKategori_tipi(CategoryType kategori_tipi) {
        this.kategori_tipi = kategori_tipi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CategoryObject)) return false;

        CategoryObject that = (CategoryObject) o;

        if (getKategori_id() != null ? !getKategori_id().equals(that.getKategori_id()) : that.getKategori_id() != null)
            return false;
        if (getKategori_adi() != null ? !getKategori_adi().equals(that.getKategori_adi()) : that.getKategori_adi() != null)
            return false;
        if (getKategori_alt_cizgi() != null ? !getKategori_alt_cizgi().equals(that.getKategori_alt_cizgi()) : that.getKategori_alt_cizgi() != null)
            return false;
        if (getKategori_arkaplan() != null ? !getKategori_arkaplan().equals(that.getKategori_arkaplan()) : that.getKategori_arkaplan() != null)
            return false;
        if (getKategori_link() != null ? !getKategori_link().equals(that.getKategori_link()) : that.getKategori_link() != null)
            return false;
        if (getKategori_sira() != null ? !getKategori_sira().equals(that.getKategori_sira()) : that.getKategori_sira() != null)
            return false;
        if (getYazarokuKategoriID() != null ? !getYazarokuKategoriID().equals(that.getYazarokuKategoriID()) : that.getYazarokuKategoriID() != null)
            return false;
        if (getAna_kategori_kontrol() != null ? !getAna_kategori_kontrol().equals(that.getAna_kategori_kontrol()) : that.getAna_kategori_kontrol() != null)
            return false;
        return !(getKategori_logo() != null ? !getKategori_logo().equals(that.getKategori_logo()) : that.getKategori_logo() != null);

    }

    @Override
    public int hashCode() {
        int result = getKategori_id() != null ? getKategori_id().hashCode() : 0;
        result = 31 * result + (getKategori_adi() != null ? getKategori_adi().hashCode() : 0);
        result = 31 * result + (getKategori_alt_cizgi() != null ? getKategori_alt_cizgi().hashCode() : 0);
        result = 31 * result + (getKategori_arkaplan() != null ? getKategori_arkaplan().hashCode() : 0);
        result = 31 * result + (getKategori_link() != null ? getKategori_link().hashCode() : 0);
        result = 31 * result + (getKategori_sira() != null ? getKategori_sira().hashCode() : 0);
        result = 31 * result + (getYazarokuKategoriID() != null ? getYazarokuKategoriID().hashCode() : 0);
        result = 31 * result + (getAna_kategori_kontrol() != null ? getAna_kategori_kontrol().hashCode() : 0);
        result = 31 * result + (getKategori_logo() != null ? getKategori_logo().hashCode() : 0);
        return result;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {
        out.writeString(kategori_id);
        out.writeString(kategori_adi);
        out.writeString(kategori_alt_cizgi);
        out.writeString(kategori_arkaplan);
        out.writeString(kategori_link);
        out.writeString(kategori_logo);
        out.writeString(kategori_sira);
        out.writeInt(kategori_tipi.ordinal());

    };


    protected void readFromParcel(Parcel in) {
        kategori_id = in.readString();
        kategori_adi = in.readString();
        kategori_alt_cizgi = in.readString();
        kategori_arkaplan = in.readString();
        kategori_link = in.readString();
        kategori_logo = in.readString();
        kategori_sira = in.readString();
        kategori_tipi = CategoryType.values()[in.readInt()];

    }
}
