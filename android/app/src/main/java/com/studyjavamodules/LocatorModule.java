package com.studyjavamodules;

import android.content.Intent;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class LocatorModule extends ReactContextBaseJavaModule {

    private static ReactApplicationContext reactContext;

    public LocatorModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "LocatorModule";
    }

    @ReactMethod
    public void onTheStart() {
        reactContext.startService(new Intent(reactContext, MyAndroidServiceTutorial.class));
    }

    @ReactMethod
    public void onTheEnd() {
        reactContext.stopService(new Intent(reactContext, MyAndroidServiceTutorial.class));
    }
}
