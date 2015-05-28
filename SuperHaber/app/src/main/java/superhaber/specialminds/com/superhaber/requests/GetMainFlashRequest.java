package superhaber.specialminds.com.superhaber.requests;

import com.android.volley.AuthFailureError;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;

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
public final class GetMainFlashRequest extends BaseRequest {

    public GetMainFlashRequest(int method,String url,JSONObject object, Listener<JSONObject> listener, ErrorListener errorListener) {
        super(method, url,object, listener, errorListener);
    }

    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        Map<String, String> params = new HashMap<String, String>();
        return params;
    }
}
