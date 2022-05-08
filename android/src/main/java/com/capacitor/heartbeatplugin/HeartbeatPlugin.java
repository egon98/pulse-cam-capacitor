package com.capacitor.heartbeatplugin;

import android.util.Log;


import com.getcapacitor.Plugin;

public class HeartbeatPlugin extends Plugin {

    public String echo(String value) {
        Log.i("Echo", value);
        return value;
    }

    public String proba(String test) {
      Log.i("Proba", test);
      return test;
    }


}
