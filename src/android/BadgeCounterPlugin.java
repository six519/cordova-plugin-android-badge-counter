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


public class BadgeCounterPlugin extends CordovaPlugin {
    public static final String TAG = "BadgeCounterPlugin";
    public static Context ctx;

    public BadgeCounterPlugin() {
    }

    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);
        BadgeCounterPlugin.ctx = cordova.getActivity().getApplicationContext();

    }

    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {


        return true;    
    }

}