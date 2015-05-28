package superhaber.specialminds.com.superhaber.core;

import android.app.Application;

import com.android.volley.RequestQueue;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.Volley;
import com.fasterxml.jackson.databind.ObjectMapper;

import superhaber.specialminds.com.superhaber.utils.BitmapLruCache;

/**
 * Created by talhakosen on 18/05/15.
 */
public class ApplicationMain extends Application {
    static ApplicationMain application;

    //Volley image loader
    ImageLoader imageLoader;
    BitmapLruCache cache = new BitmapLruCache();
    private RequestQueue requestQueue;
    private ObjectMapper objectMapper;
    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
        objectMapper = new ObjectMapper();
        //  Network Stack
        requestQueue = Volley.newRequestQueue(this);
        VolleyLog.DEBUG = true;
        VolleyLog.TAG = "SuperHaber";
    }

    public RequestQueue getRequestQueue() {
        return requestQueue;
    }

    public  static ApplicationMain getInstance(){
        return application;
    }

    public ImageLoader getImageLoader() {

        if (imageLoader == null)
            imageLoader = new ImageLoader(Volley.newRequestQueue(this), cache);
        return imageLoader;
    }


    public ObjectMapper getObjectMapper() {
        return objectMapper;
    }
}
