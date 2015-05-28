package superhaber.specialminds.com.superhaber.requests;

import com.android.volley.AuthFailureError;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.JsonRequest;


import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

import superhaber.specialminds.com.superhaber.core.Constants;

/**
 * Author
 * User: tkosen
 * Date: 20/01/2015
 * talhakosen@gmail.com
 */

public abstract class BaseRequest extends JsonObjectRequest {
    private static final int TIMEOUT_CONNECTION_MS = 30 * 1000;
    private static final int MAX_RETRY_COUNT = 2; // 2 retries = 3 attempts
    private Priority priority = null;
    private Map<String, String> headers = new HashMap<String, String>();

    public BaseRequest(int method, String url,JSONObject object, Listener<JSONObject> listener, ErrorListener errorListener) {
        super(method, url, object, listener, errorListener);
        setShouldCache(false);
        setRetryPolicy(new DefaultRetryPolicy(getConnectionTimeout(), getMaxRetries(), getBackoffMultiplier()));
    }

    /*
     * If prioirty set use it,else returned NORMAL
     * @see com.android.volley.Request#getPriority()
     */
    public Priority getPriority() {
        if (this.priority != null) {
            return priority;
        } else {
            return Priority.NORMAL;
        }
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    /*@Override
    public String getUrl() {
        //return BuildConfig.DEBUG ? Constants.HOST_DEV.concat(getEndpoint()) : Constants.HOST_PROD.concat(getEndpoint());
        return Constants.HOST_PROD.concat(getEndpoint());
    }*/

    /*public abstract String getEndpoint();*/

    @Override
    public Map<String, String> getHeaders() throws AuthFailureError {
        Map<String, String> headers = new HashMap<String, String>();
        return headers;
    }

    public void setHeader(String title, String content) {
        headers.put(title, content);
    }

    protected int getConnectionTimeout() {
        return TIMEOUT_CONNECTION_MS;
    }

    protected float getBackoffMultiplier() {
        return 1.0f;
    }

    protected int getMaxRetries() {
        return MAX_RETRY_COUNT;
    }
}
