package com.capacitor.heartbeatplugin;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.provider.MediaStore;
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
        final int REQUEST_IMAGE_CAPTURE = 1;

      Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
      try {
        startActivityForResult(call, takePictureIntent, REQUEST_IMAGE_CAPTURE);
      } catch (ActivityNotFoundException e) {
        // display error state to the user
      }

      call.resolve(ret);
    }

    @PluginMethod
    public void proba(PluginCall call) {
      String test = call.getString("test");
      JSObject ret = new JSObject();
      ret.put("test", implementation.proba(test));

      int duration = Toast.LENGTH_SHORT;
      Toast toast = Toast.makeText(getContext(), test, duration);
      toast.show();

      call.resolve(ret);
    }

}
