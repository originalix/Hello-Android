package com.originalix.lix.helloandroid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Lix on 2017/8/6.
 */

public class NerworkChangeReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "network changes", Toast.LENGTH_SHORT).show();
    }
}
