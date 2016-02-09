package superhaber.specialminds.com.superhaber.utils;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;

/**
 * Created by talhakosen on 30/05/15.
 */
public class AndroidUtils {

    public static int dpToPixels(Context context, int dp) {
        final Resources r = context.getResources();
        return (int) Math.ceil(TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics()));
    }

    public static int pixelsToDp(Context context, int px) {
        Resources resources = context.getResources();
        DisplayMetrics metrics = resources.getDisplayMetrics();
        float dp = px / (metrics.densityDpi / 160f);
        return (int) Math.ceil(dp);
    }

    @SuppressLint("NewApi")
    public static boolean isTablet(Context context) {
        if (android.os.Build.VERSION.SDK_INT > 12) {
            return context.getResources().getConfiguration().smallestScreenWidthDp > 600;
        } else if (android.os.Build.VERSION.SDK_INT > 10) {
            final int size = context.getResources().getConfiguration().screenLayout
                    & Configuration.SCREENLAYOUT_SIZE_MASK;
            return (size == Configuration.SCREENLAYOUT_SIZE_LARGE)
                    || (size == Configuration.SCREENLAYOUT_SIZE_XLARGE);
        } else {
            return false;
        }
    }

    @SuppressLint("NewApi")
    public static int getScreenWidthInDp(Activity activity) {
        if (OsUtilities.hasHoneycomb()) {
            return activity.getResources().getConfiguration().screenWidthDp;
        }

        @SuppressWarnings("deprecation")
        int pixel = activity.getWindowManager().getDefaultDisplay().getWidth();
        int dp = pixel / (int) activity.getResources().getDisplayMetrics().density;
        return dp;
    }


    @SuppressLint("NewApi")
    public static int getScreenHeight(Activity activity) {
        if (OsUtilities.hasHoneycomb()) {
            return activity.getResources().getConfiguration().screenHeightDp;
        }

        @SuppressWarnings("deprecation")
        int pixel = activity.getWindowManager().getDefaultDisplay().getHeight();
        int dp = pixel / (int) activity.getResources().getDisplayMetrics().density;
        return dp;
    }
}
