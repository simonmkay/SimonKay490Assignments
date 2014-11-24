package com.simonkay.broadcastreceiver;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Simon Kay on 11/24/2014.
 */
public class Broadcastreceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(Context, "We sense an Intent.", Toast.LENGTH_LONG).show();
    }

}
