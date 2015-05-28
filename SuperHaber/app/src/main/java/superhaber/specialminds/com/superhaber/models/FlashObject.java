package superhaber.specialminds.com.superhaber.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by talhakosen on 23/05/15.
 */


public class FlashObject implements Parcelable {
    @JsonProperty
    String manset_id;
    @JsonProperty
    String manset_baslik;
    @JsonProperty
    String manset_kisa_icerik;
    @JsonProperty
    String manset_kaynak;
    @JsonProperty
    String manset_sistem_saati;
    @JsonProperty
    String manset_resim;
    @JsonProperty
    String kategori_adi;
    @JsonProperty
    String kategori_arkaplan;
    @JsonProperty
    String kategori_link;


    public static final Creator<FlashObject> CREATOR = new Creator<FlashObject>() {
        @Override
        public FlashObject createFromParcel(Parcel in) {
            final FlashObject entry = new FlashObject();
            entry.readFromParcel(in);
            return entry;
        }

        @Override
        public FlashObject[] newArray(int size) {
            return new FlashObject[size];
        }
    };


    public String getManset_id() {
        return manset_id;
    }

    public void setManset_id(String manset_id) {
        this.manset_id = manset_id;
    }

    public String getManset_baslik() {
        return manset_baslik;
    }

    public void setManset_baslik(String manset_baslik) {
        this.manset_baslik = manset_baslik;
    }

    public String getManset_kisa_icerik() {
        return manset_kisa_icerik;
    }

    public void setManset_kisa_icerik(String manset_kisa_icerik) {
        this.manset_kisa_icerik = manset_kisa_icerik;
    }

    public String getManset_kaynak() {
        return manset_kaynak;
    }

    public void setManset_kaynak(String manset_kaynak) {
        this.manset_kaynak = manset_kaynak;
    }

    public String getManset_sistem_saati() {
        return manset_sistem_saati;
    }

    public void setManset_sistem_saati(String manset_sistem_saati) {
        this.manset_sistem_saati = manset_sistem_saati;
    }

    public String getManset_resim() {
        return manset_resim;
    }

    public void setManset_resim(String manset_resim) {
        this.manset_resim = manset_resim;
    }

    public String getKategori_adi() {
        return kategori_adi;
    }

    public void setKategori_adi(String kategori_adi) {
        this.kategori_adi = kategori_adi;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FlashObject)) return false;

        FlashObject that = (FlashObject) o;

        if (manset_id != null ? !manset_id.equals(that.manset_id) : that.manset_id != null)
            return false;
        if (manset_baslik != null ? !manset_baslik.equals(that.manset_baslik) : that.manset_baslik != null)
            return false;
        if (manset_kisa_icerik != null ? !manset_kisa_icerik.equals(that.manset_kisa_icerik) : that.manset_kisa_icerik != null)
            return false;
        if (manset_kaynak != null ? !manset_kaynak.equals(that.manset_kaynak) : that.manset_kaynak != null)
            return false;
        if (manset_sistem_saati != null ? !manset_sistem_saati.equals(that.manset_sistem_saati) : that.manset_sistem_saati != null)
            return false;
        if (manset_resim != null ? !manset_resim.equals(that.manset_resim) : that.manset_resim != null)
            return false;
        if (kategori_adi != null ? !kategori_adi.equals(that.kategori_adi) : that.kategori_adi != null)
            return false;
        if (kategori_arkaplan != null ? !kategori_arkaplan.equals(that.kategori_arkaplan) : that.kategori_arkaplan != null)
            return false;
        return !(kategori_link != null ? !kategori_link.equals(that.kategori_link) : that.kategori_link != null);

    }

    @Override
    public int hashCode() {
        int result = manset_id != null ? manset_id.hashCode() : 0;
        result = 31 * result + (manset_baslik != null ? manset_baslik.hashCode() : 0);
        result = 31 * result + (manset_kisa_icerik != null ? manset_kisa_icerik.hashCode() : 0);
        result = 31 * result + (manset_kaynak != null ? manset_kaynak.hashCode() : 0);
        result = 31 * result + (manset_sistem_saati != null ? manset_sistem_saati.hashCode() : 0);
        result = 31 * result + (manset_resim != null ? manset_resim.hashCode() : 0);
        result = 31 * result + (kategori_adi != null ? kategori_adi.hashCode() : 0);
        result = 31 * result + (kategori_arkaplan != null ? kategori_arkaplan.hashCode() : 0);
        result = 31 * result + (kategori_link != null ? kategori_link.hashCode() : 0);
        return result;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {
        out.writeString(manset_id);
        out.writeString(manset_baslik);
        out.writeString(manset_kisa_icerik);
        out.writeString(manset_kaynak);
        out.writeString(manset_sistem_saati);
        out.writeString(manset_resim);
        out.writeString(kategori_adi);
        out.writeString(kategori_arkaplan);
        out.writeString(kategori_link);
    };


    protected void readFromParcel(Parcel in) {
        manset_id = in.readString();
        manset_baslik = in.readString();
        manset_kisa_icerik = in.readString();
        manset_kaynak = in.readString();
        manset_sistem_saati = in.readString();
        manset_resim = in.readString();
        kategori_adi = in.readString();
        kategori_arkaplan = in.readString();
        kategori_link = in.readString();
    }
}
