package com.ferdinandsilva.android;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.content.Intent;
import android.content.ContentValues;
import android.net.Uri;
import android.app.Activity;

import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaInterface;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import DYNAMIC_IMPORT_OF_R;

public class BadgeCounterPlugin extends CordovaPlugin {
    public static final String TAG = "BadgeCounterPlugin";
    public static Context ctx;

    public BadgeCounterPlugin() {
    }

    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);
        BadgeCounterPlugin.ctx = cordova.getActivity().getApplicationContext();

    }
    
    public void setBadge(int count) {
        ContentValues cv = new ContentValues();
        cv.put("package", BadgeCounterPlugin.ctx.getPackageName());
        cv.put("class", BadgeCounterPlugin.ctx.getResources().getString(R.string.main_activity_class));
        cv.put("badgecount", count); 
        BadgeCounterPlugin.ctx.getContentResolver().insert(Uri.parse("content://com.sec.badge/apps"), cv);
    }
    
    public void clearBadge() {
        ContentValues cv = new ContentValues();
        cv.put("badgecount", 0);
        BadgeCounterPlugin.ctx.getContentResolver().update(Uri.parse("content://com.sec.badge/apps"), cv, "package=?", new String[] {BadgeCounterPlugin.ctx.getPackageName()}); 
    }

    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {

        JSONObject r = new JSONObject();

        if ("setBadge".equals(action)) {

            int cnt = args.getInt(0);
            setBadge(cnt);
            
            r.put("ok", "ok");
            callbackContext.success(r);
        } else if("clearBadge".equals(action)) {
            
            clearBadge();

            r.put("ok","ok");
            callbackContext.success(r);
        } else {
            return false;
        }

        return true;    
    }

}