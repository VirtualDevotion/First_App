package com.virtdev.cfdowningtown;

import android.app.Activity;
import android.content.Intent;

/**
 * Created by Admin on 7/22/2015.
 */
public class Utils {

    private static int sTheme;
    public final static int THEME_DEFAULT = 0;
    public final static int THEME_LIGHT = 1;
    public final static int THEME_DARK = 2;
    /**
     * Set the theme of the Activity, and restart it by creating a new Activity of the same type.
     */
    public static void changeToTheme(Activity activity, int theme)
    {
        sTheme = theme;
        activity.finish();
        activity.startActivity(new Intent(activity, activity.getClass()));
    }
    /** Set the theme of the activity, according to the configuration.
     * @param activity*/
    public static void onActivityCreateSetTheme(MainActivity activity) {
        switch (sTheme) {
            default:
            case THEME_DEFAULT:
                activity.setTheme(R.style.AppTheme);
                break;
            case THEME_LIGHT:
                activity.setTheme(R.style.AppLight);
                break;
            case THEME_DARK:
                activity.setTheme(R.style.AppDark);
                break;
        }
    }
}
