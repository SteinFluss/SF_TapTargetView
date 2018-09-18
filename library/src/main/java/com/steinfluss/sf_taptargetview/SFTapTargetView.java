package com.steinfluss.sf_taptargetview;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;

import com.getkeepsafe.taptargetview.TapTarget;
import com.getkeepsafe.taptargetview.TapTargetView;

public class SFTapTargetView {
    public static void showOnce(View view, String tapTargetID, String title, String description, @NonNull Activity activity){
        Context context = activity.getApplicationContext();
        if (PreferenceUtils.isFirstTime(context,tapTargetID)) {

            TapTargetView.showFor(activity, TapTarget.forView(view,title,description)
                    .outerCircleColor(R.color.colorAccent)
                    .outerCircleAlpha(0.9f)
                    .transparentTarget(true)
                    .descriptionTextSize(20)
                    .titleTextSize(24)
                    .descriptionTextColor(android.R.color.black)
                    .targetCircleColor(android.R.color.white));
        }
    }

    public static void showOnce(View view,String tapTargetID,int title, int description,@NonNull Activity activity){
        String titleString = activity.getString(title);
        String descriptionString = activity.getString(description);
        showOnce(view,tapTargetID,titleString,descriptionString,activity);
    }
}
