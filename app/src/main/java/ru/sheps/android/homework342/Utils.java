package ru.sheps.android.homework342;

import android.app.Activity;
import android.content.Intent;

public class Utils
{
    private static int sTheme;

    public final static int MARGIN_BIG = 0;
    public final static int MARGIN_MIDDLE = 1;
    public final static int MARGIN_SMALL = 2;

    /**
     * Set the theme of the Activity, and restart it by creating a new Activity of the same type.
     */
    public static void changeToTheme(Activity activity, int theme)
    {
        sTheme = theme;
        activity.finish();

        activity.startActivity(new Intent(activity, activity.getClass()));

    }

    /** Set the theme of the activity, according to the configuration. */
    public static void onActivityCreateSetTheme(Activity activity)
    {
        switch (sTheme)
        {
            default:
            case MARGIN_BIG:
                activity.setTheme(R.style.MarginBig);
                break;
            case MARGIN_MIDDLE:
                activity.setTheme(R.style.MarginMiddle);
                break;
            case MARGIN_SMALL:
                activity.setTheme(R.style.MarginSmall);
                break;
        }
    }
}
