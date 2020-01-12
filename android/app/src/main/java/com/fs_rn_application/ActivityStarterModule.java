package com.fs_rn_application;

import android.content.Intent;
import android.widget.Toast;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.fs_rn_application.ui.DashBoardScreen;

public class ActivityStarterModule extends ReactContextBaseJavaModule {

    public ActivityStarterModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "ActivityStarter";
    }

    @ReactMethod
    public void startActivity() {
        ReactApplicationContext context = getReactApplicationContext();
        Intent intent = new Intent(context, DashBoardScreen.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }
}
