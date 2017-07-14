package com.rideshareos.spm;

import android.content.Intent;
import android.content.pm.PackageManager;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;


public class ScoutPackageManagerModule extends ReactContextBaseJavaModule {

  public ScoutPackageManagerModule(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @Override
  public String getName() {
    return "ScoutPackageManager";
  }


  @ReactMethod
  public void startActivityByPackageName(String packageName) {
    PackageManager pm = getReactApplicationContext().getPackageManager();
    Intent intent = pm.getLaunchIntentForPackage(packageName);
    getReactApplicationContext().startActivity(intent);
  }
}
