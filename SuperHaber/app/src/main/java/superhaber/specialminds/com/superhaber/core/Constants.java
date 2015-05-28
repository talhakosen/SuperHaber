package superhaber.specialminds.com.superhaber.core;

/**
 * Created by talhakosen on 18/05/15.
 */
public class Constants {
    public static String HOST_DEV = "http://www.superhaber.com/robotlar/webservice.php?f=";
    public static String HOST_PROD = "http://www.superhaber.com/robotlar/webservice.php?f=";

    public static String URL_CATEGORIES = HOST_PROD + "kategorilerWS";
    public static String URL_MAIN_SLIDER = HOST_PROD + "index_sliderWS";
    public static String URL_CATEGORY_SLIDER = HOST_PROD + "kategori_sliderWS&kategori=%d";
    public static String URL_CURRENCIES = "kurlarWS";
    public static String URL_MANSET_DETAIL = "index_manset_detay WS&id=%d";
    public static String URL_CATEGORY_MANSET_DETAIL = "kategori_manset_detayWS&id=%d";

    public static String URL_IMAGE = "http://www.superhaber.com/resimler/";
    /*
       uygulama anasayfa en ustte yer alacak SATIR anasayfa slider'dan (bu satır tum manset kategorilerini icericek)
       uygulama anasayfada alttaki kategorik mansetler , kategori sayfası slider'dan
       en ust satırın detayları tıklanınca gelecek olan anasayfa manset detay'dan
       en ust satır harici kategori manset detayları ise, kategori manset detaydan gelecek
    */
}
