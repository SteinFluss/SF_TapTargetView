package com.steinfluss.sf_taptargetview;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class PreferenceUtils {
    public static boolean isFirstTime(Context context, String uniquePrefName){
        if (getSharedPref(context).getBoolean(uniquePrefName,true)){
            setFirstTime(context,uniquePrefName,false);
            return true;
        }else{
            return false;
        }
    }

    public static void setFirstTime(Context context, String uniquePrefName, boolean value){
        getEditor(context).putBoolean(uniquePrefName,value).apply();
    }

    private static SharedPreferences getSharedPref(Context context){
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    private static SharedPreferences.Editor getEditor(Context context){
        return getSharedPref(context).edit();
    }
}
