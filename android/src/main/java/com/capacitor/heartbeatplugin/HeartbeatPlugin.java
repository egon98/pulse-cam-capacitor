package com.capacitor.heartbeatplugin;

import android.content.Context;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.getcapacitor.Plugin;

public class HeartbeatPlugin extends Plugin {

    public String echo(String value) {
        Log.i("Echo", value);
        return value;
    }

    public String proba(String value) {
      Log.i("Proba1", value);
      TextView myText = new TextView(getContext());
      myText.setText(value);
      return value;
    }
}
