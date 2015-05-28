package superhaber.specialminds.com.superhaber.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by talhakosen on 18/05/15.
 */


public class CategoryPageSliderObject implements Parcelable {
    @JsonProperty
    private String kategori_sira;
    @JsonProperty
    private String kategori_logo;
    @JsonProperty
    private String kategori_link;
    @JsonProperty
    private String karisik_google_saati;
    @JsonProperty
    private String kategori_arkaplan;
    @JsonProperty
    private String karisik_okunma_sayisi;
    @JsonProperty
    private String karisik_url;
    @JsonProperty
    private String YazarokuKategoriID;
    @JsonProperty
    private String karisik_sistem_saati;
    @JsonProperty
    private String karisik_kaynak;
    @JsonProperty
    private String karisik_id;
    @JsonProperty
    private String ana_kategori_kontrol;
    @JsonProperty
    private String kategori_adi;
    @JsonProperty
    private String karisik_kisa_icerik;
    @JsonProperty
    private String kategori_id;
    @JsonProperty
    private String karisik_seflink;
    @JsonProperty
    private String social;
    @JsonProperty
    private String kalici_sira;
    @JsonProperty
    private String karisik_resim;
    @JsonProperty
    private String karisik_baslik;
    @JsonProperty
    private String resim_md5;
    @JsonProperty
    private String kategori_alt_cizgi;
    @JsonProperty
    private String karisik_kategori_id;
    @JsonProperty
    private String karisik_uzun_icerik;


    public static final Parcelable.Creator<CategoryPageSliderObject> CREATOR = new Parcelable.Creator<CategoryPageSliderObject>() {
        @Override
        public CategoryPageSliderObject createFromParcel(Parcel in) {
            final CategoryPageSliderObject entry = new CategoryPageSliderObject();
            entry.readFromParcel(in);
            return entry;
        }

        @Override
        public CategoryPageSliderObject[] newArray(int size) {
            return new CategoryPageSliderObject[size];
        }
    };

    public CategoryPageSliderObject() {
    }

    public String getKategori_sira() {
        return kategori_sira;
    }

    public void setKategori_sira(String kategori_sira) {
        this.kategori_sira = kategori_sira;
    }

    public String getKategori_logo() {
        return kategori_logo;
    }

    public void setKategori_logo(String kategori_logo) {
        this.kategori_logo = kategori_logo;
    }

    public String getKategori_link() {
        return kategori_link;
    }

    public void setKategori_link(String kategori_link) {
        this.kategori_link = kategori_link;
    }

    public String getKarisik_google_saati() {
        return karisik_google_saati;
    }

    public void setKarisik_google_saati(String karisik_google_saati) {
        this.karisik_google_saati = karisik_google_saati;
    }

    public String getKategori_arkaplan() {
        return kategori_arkaplan;
    }

    public void setKategori_arkaplan(String kategori_arkaplan) {
        this.kategori_arkaplan = kategori_arkaplan;
    }

    public String getKarisik_okunma_sayisi() {
        return karisik_okunma_sayisi;
    }

    public void setKarisik_okunma_sayisi(String karisik_okunma_sayisi) {
        this.karisik_okunma_sayisi = karisik_okunma_sayisi;
    }

    public String getKarisik_url() {
        return karisik_url;
    }

    public void setKarisik_url(String karisik_url) {
        this.karisik_url = karisik_url;
    }

    public String getYazarokuKategoriID() {
        return YazarokuKategoriID;
    }

    public void setYazarokuKategoriID(String yazarokuKategoriID) {
        YazarokuKategoriID = yazarokuKategoriID;
    }

    public String getKarisik_sistem_saati() {
        return karisik_sistem_saati;
    }

    public void setKarisik_sistem_saati(String karisik_sistem_saati) {
        this.karisik_sistem_saati = karisik_sistem_saati;
    }

    public String getKarisik_kaynak() {
        return karisik_kaynak;
    }

    public void setKarisik_kaynak(String karisik_kaynak) {
        this.karisik_kaynak = karisik_kaynak;
    }

    public String getKarisik_id() {
        return karisik_id;
    }

    public void setKarisik_id(String karisik_id) {
        this.karisik_id = karisik_id;
    }

    public String getAna_kategori_kontrol() {
        return ana_kategori_kontrol;
    }

    public void setAna_kategori_kontrol(String ana_kategori_kontrol) {
        this.ana_kategori_kontrol = ana_kategori_kontrol;
    }

    public String getKategori_adi() {
        return kategori_adi;
    }

    public void setKategori_adi(String kategori_adi) {
        this.kategori_adi = kategori_adi;
    }

    public String getKarisik_kisa_icerik() {
        return karisik_kisa_icerik;
    }

    public void setKarisik_kisa_icerik(String karisik_kisa_icerik) {
        this.karisik_kisa_icerik = karisik_kisa_icerik;
    }

    public String getKategori_id() {
        return kategori_id;
    }

    public void setKategori_id(String kategori_id) {
        this.kategori_id = kategori_id;
    }

    public String getKarisik_seflink() {
        return karisik_seflink;
    }

    public void setKarisik_seflink(String karisik_seflink) {
        this.karisik_seflink = karisik_seflink;
    }

    public String getSocial() {
        return social;
    }

    public void setSocial(String social) {
        this.social = social;
    }

    public String getKalici_sira() {
        return kalici_sira;
    }

    public void setKalici_sira(String kalici_sira) {
        this.kalici_sira = kalici_sira;
    }

    public String getKarisik_resim() {
        return karisik_resim;
    }

    public void setKarisik_resim(String karisik_resim) {
        this.karisik_resim = karisik_resim;
    }

    public String getKarisik_baslik() {
        return karisik_baslik;
    }

    public void setKarisik_baslik(String karisik_baslik) {
        this.karisik_baslik = karisik_baslik;
    }

    public String getResim_md5() {
        return resim_md5;
    }

    public void setResim_md5(String resim_md5) {
        this.resim_md5 = resim_md5;
    }

    public String getKategori_alt_cizgi() {
        return kategori_alt_cizgi;
    }

    public void setKategori_alt_cizgi(String kategori_alt_cizgi) {
        this.kategori_alt_cizgi = kategori_alt_cizgi;
    }

    public String getKarisik_kategori_id() {
        return karisik_kategori_id;
    }

    public void setKarisik_kategori_id(String karisik_kategori_id) {
        this.karisik_kategori_id = karisik_kategori_id;
    }

    public String getKarisik_uzun_icerik() {
        return karisik_uzun_icerik;
    }

    public void setKarisik_uzun_icerik(String karisik_uzun_icerik) {
        this.karisik_uzun_icerik = karisik_uzun_icerik;
    }

    public static Creator<CategoryPageSliderObject> getCREATOR() {
        return CREATOR;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CategoryPageSliderObject)) return false;

        CategoryPageSliderObject that = (CategoryPageSliderObject) o;

        if (getKategori_sira() != null ? !getKategori_sira().equals(that.getKategori_sira()) : that.getKategori_sira() != null)
            return false;
        if (getKategori_logo() != null ? !getKategori_logo().equals(that.getKategori_logo()) : that.getKategori_logo() != null)
            return false;
        if (getKategori_link() != null ? !getKategori_link().equals(that.getKategori_link()) : that.getKategori_link() != null)
            return false;
        if (getKarisik_google_saati() != null ? !getKarisik_google_saati().equals(that.getKarisik_google_saati()) : that.getKarisik_google_saati() != null)
            return false;
        if (getKategori_arkaplan() != null ? !getKategori_arkaplan().equals(that.getKategori_arkaplan()) : that.getKategori_arkaplan() != null)
            return false;
        if (getKarisik_okunma_sayisi() != null ? !getKarisik_okunma_sayisi().equals(that.getKarisik_okunma_sayisi()) : that.getKarisik_okunma_sayisi() != null)
            return false;
        if (getKarisik_url() != null ? !getKarisik_url().equals(that.getKarisik_url()) : that.getKarisik_url() != null)
            return false;
        if (getYazarokuKategoriID() != null ? !getYazarokuKategoriID().equals(that.getYazarokuKategoriID()) : that.getYazarokuKategoriID() != null)
            return false;
        if (getKarisik_sistem_saati() != null ? !getKarisik_sistem_saati().equals(that.getKarisik_sistem_saati()) : that.getKarisik_sistem_saati() != null)
            return false;
        if (getKarisik_kaynak() != null ? !getKarisik_kaynak().equals(that.getKarisik_kaynak()) : that.getKarisik_kaynak() != null)
            return false;
        if (getKarisik_id() != null ? !getKarisik_id().equals(that.getKarisik_id()) : that.getKarisik_id() != null)
            return false;
        if (getAna_kategori_kontrol() != null ? !getAna_kategori_kontrol().equals(that.getAna_kategori_kontrol()) : that.getAna_kategori_kontrol() != null)
            return false;
        if (getKategori_adi() != null ? !getKategori_adi().equals(that.getKategori_adi()) : that.getKategori_adi() != null)
            return false;
        if (getKarisik_kisa_icerik() != null ? !getKarisik_kisa_icerik().equals(that.getKarisik_kisa_icerik()) : that.getKarisik_kisa_icerik() != null)
            return false;
        if (getKategori_id() != null ? !getKategori_id().equals(that.getKategori_id()) : that.getKategori_id() != null)
            return false;
        if (getKarisik_seflink() != null ? !getKarisik_seflink().equals(that.getKarisik_seflink()) : that.getKarisik_seflink() != null)
            return false;
        if (getSocial() != null ? !getSocial().equals(that.getSocial()) : that.getSocial() != null)
            return false;
        if (getKalici_sira() != null ? !getKalici_sira().equals(that.getKalici_sira()) : that.getKalici_sira() != null)
            return false;
        if (getKarisik_resim() != null ? !getKarisik_resim().equals(that.getKarisik_resim()) : that.getKarisik_resim() != null)
            return false;
        if (getKarisik_baslik() != null ? !getKarisik_baslik().equals(that.getKarisik_baslik()) : that.getKarisik_baslik() != null)
            return false;
        if (getResim_md5() != null ? !getResim_md5().equals(that.getResim_md5()) : that.getResim_md5() != null)
            return false;
        if (getKategori_alt_cizgi() != null ? !getKategori_alt_cizgi().equals(that.getKategori_alt_cizgi()) : that.getKategori_alt_cizgi() != null)
            return false;
        if (getKarisik_kategori_id() != null ? !getKarisik_kategori_id().equals(that.getKarisik_kategori_id()) : that.getKarisik_kategori_id() != null)
            return false;
        return !(getKarisik_uzun_icerik() != null ? !getKarisik_uzun_icerik().equals(that.getKarisik_uzun_icerik()) : that.getKarisik_uzun_icerik() != null);

    }

    @Override
    public int hashCode() {
        int result = getKategori_sira() != null ? getKategori_sira().hashCode() : 0;
        result = 31 * result + (getKategori_logo() != null ? getKategori_logo().hashCode() : 0);
        result = 31 * result + (getKategori_link() != null ? getKategori_link().hashCode() : 0);
        result = 31 * result + (getKarisik_google_saati() != null ? getKarisik_google_saati().hashCode() : 0);
        result = 31 * result + (getKategori_arkaplan() != null ? getKategori_arkaplan().hashCode() : 0);
        result = 31 * result + (getKarisik_okunma_sayisi() != null ? getKarisik_okunma_sayisi().hashCode() : 0);
        result = 31 * result + (getKarisik_url() != null ? getKarisik_url().hashCode() : 0);
        result = 31 * result + (getYazarokuKategoriID() != null ? getYazarokuKategoriID().hashCode() : 0);
        result = 31 * result + (getKarisik_sistem_saati() != null ? getKarisik_sistem_saati().hashCode() : 0);
        result = 31 * result + (getKarisik_kaynak() != null ? getKarisik_kaynak().hashCode() : 0);
        result = 31 * result + (getKarisik_id() != null ? getKarisik_id().hashCode() : 0);
        result = 31 * result + (getAna_kategori_kontrol() != null ? getAna_kategori_kontrol().hashCode() : 0);
        result = 31 * result + (getKategori_adi() != null ? getKategori_adi().hashCode() : 0);
        result = 31 * result + (getKarisik_kisa_icerik() != null ? getKarisik_kisa_icerik().hashCode() : 0);
        result = 31 * result + (getKategori_id() != null ? getKategori_id().hashCode() : 0);
        result = 31 * result + (getKarisik_seflink() != null ? getKarisik_seflink().hashCode() : 0);
        result = 31 * result + (getSocial() != null ? getSocial().hashCode() : 0);
        result = 31 * result + (getKalici_sira() != null ? getKalici_sira().hashCode() : 0);
        result = 31 * result + (getKarisik_resim() != null ? getKarisik_resim().hashCode() : 0);
        result = 31 * result + (getKarisik_baslik() != null ? getKarisik_baslik().hashCode() : 0);
        result = 31 * result + (getResim_md5() != null ? getResim_md5().hashCode() : 0);
        result = 31 * result + (getKategori_alt_cizgi() != null ? getKategori_alt_cizgi().hashCode() : 0);
        result = 31 * result + (getKarisik_kategori_id() != null ? getKarisik_kategori_id().hashCode() : 0);
        result = 31 * result + (getKarisik_uzun_icerik() != null ? getKarisik_uzun_icerik().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CategoryPageSliderObject{" +
                "kategori_sira='" + kategori_sira + '\'' +
                ", kategori_logo='" + kategori_logo + '\'' +
                ", kategori_link='" + kategori_link + '\'' +
                ", karisik_google_saati='" + karisik_google_saati + '\'' +
                ", kategori_arkaplan='" + kategori_arkaplan + '\'' +
                ", karisik_okunma_sayisi='" + karisik_okunma_sayisi + '\'' +
                ", karisik_url='" + karisik_url + '\'' +
                ", YazarokuKategoriID='" + YazarokuKategoriID + '\'' +
                ", karisik_sistem_saati='" + karisik_sistem_saati + '\'' +
                ", karisik_kaynak='" + karisik_kaynak + '\'' +
                ", karisik_id='" + karisik_id + '\'' +
                ", ana_kategori_kontrol='" + ana_kategori_kontrol + '\'' +
                ", kategori_adi='" + kategori_adi + '\'' +
                ", karisik_kisa_icerik='" + karisik_kisa_icerik + '\'' +
                ", kategori_id='" + kategori_id + '\'' +
                ", karisik_seflink='" + karisik_seflink + '\'' +
                ", social='" + social + '\'' +
                ", kalici_sira='" + kalici_sira + '\'' +
                ", karisik_resim='" + karisik_resim + '\'' +
                ", karisik_baslik='" + karisik_baslik + '\'' +
                ", resim_md5='" + resim_md5 + '\'' +
                ", kategori_alt_cizgi='" + kategori_alt_cizgi + '\'' +
                ", karisik_kategori_id='" + karisik_kategori_id + '\'' +
                ", karisik_uzun_icerik='" + karisik_uzun_icerik + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {
        out.writeString(kategori_sira);
        out.writeString(kategori_logo);
        out.writeString(kategori_link);
        out.writeString(karisik_google_saati);
        out.writeString(kategori_arkaplan);
        out.writeString(karisik_okunma_sayisi);
        out.writeString(karisik_url);
        out.writeString(YazarokuKategoriID);
        out.writeString(karisik_sistem_saati);
        out.writeString(karisik_kaynak);
        out.writeString(karisik_id);
        out.writeString(ana_kategori_kontrol);
        out.writeString(kategori_adi);
        out.writeString(karisik_kisa_icerik);
        out.writeString(kategori_id);
        out.writeString(karisik_seflink);
        out.writeString(social);
        out.writeString(kalici_sira);
        out.writeString(karisik_resim);
        out.writeString(karisik_baslik);
        out.writeString(resim_md5);
        out.writeString(kategori_alt_cizgi);
        out.writeString(karisik_kategori_id);
        out.writeString(karisik_uzun_icerik);
    }

    protected void readFromParcel(Parcel in) {
        kategori_sira = in.readString();
        kategori_logo = in.readString();
        kategori_link = in.readString();
        karisik_google_saati = in.readString();
        kategori_arkaplan = in.readString();
        karisik_okunma_sayisi = in.readString();
        karisik_url = in.readString();
        YazarokuKategoriID = in.readString();
        karisik_sistem_saati = in.readString();
        karisik_kaynak = in.readString();
        karisik_id = in.readString();
        ana_kategori_kontrol = in.readString();
        kategori_adi = in.readString();
        karisik_kisa_icerik = in.readString();
        kategori_id = in.readString();
        karisik_seflink = in.readString();
        social = in.readString();
        kalici_sira = in.readString();
        karisik_resim = in.readString();
        karisik_baslik = in.readString();
        resim_md5 = in.readString();
        YazarokuKategoriID = in.readString();
        karisik_kategori_id = in.readString();
        karisik_uzun_icerik = in.readString();
    }

}
