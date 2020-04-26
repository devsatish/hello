package com.notetaker.device;

import android.os.Build;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class DeviceModule extends ReactContextBaseJavaModule {

    public DeviceModule(@NonNull ReactApplicationContext reactContext) {
        super(reactContext);
    }


    @Override
    public String getName() {
        return "Device";
    }


    @ReactMethod
    public void getDeviceName(Callback cb) {
        try {
            cb.invoke(null, Build.MODEL);

        }catch(Exception ex) {
            cb.invoke(ex.toString(), null);
        }
    }
}
