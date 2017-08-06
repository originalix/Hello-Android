package com.originalix.lix.helloandroid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Lix on 2017/8/7.
 */

public class MyBroadcastReceiver extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Received in MybroadcastReveiver", Toast.LENGTH_SHORT).show();
        abortBroadcast();
    }
}
