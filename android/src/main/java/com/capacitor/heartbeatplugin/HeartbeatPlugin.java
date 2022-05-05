package com.capacitor.heartbeatplugin;

import android.util.Log;

public class HeartbeatPlugin {

    public String echo(String value) {
        Log.i("Echo", value);
        return value;
    }
}
