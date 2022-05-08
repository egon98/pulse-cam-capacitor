package com.capacitor.heartbeatplugin;

import android.content.Context;
import android.widget.TextView;
import android.widget.Toast;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "HeartbeatPlugin")
public class HeartbeatPluginPlugin extends Plugin {

    private final HeartbeatPlugin implementation = new HeartbeatPlugin();

    @PluginMethod
    public void echo(PluginCall call) {
        String value = call.getString("value");
        JSObject ret = new JSObject();
        ret.put("value", implementation.echo(value));
        call.resolve(ret);
    }

     @PluginMethod
        public void proba(PluginCall call) {
            String value = call.getString("value");
            JSObject ret = new JSObject();
            ret.put("value", implementation.proba(value));
            TextView myText = new TextView(getContext());
            myText.setText(value);
            call.resolve(ret);
        }
}
