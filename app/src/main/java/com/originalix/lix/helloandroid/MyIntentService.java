package com.originalix.lix.helloandroid;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

/**
 * Created by Lix on 2017/8/10.
 */

public class MyIntentService extends IntentService {

    public MyIntentService() {
        super("MyIntentService");
    }

    protected void onHandleIntent(Intent intent) {
        Log.d("lix", "MyIntentService Thread id is " + Thread.currentThread().getId());
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("lix", "onDestroy executed");
    }
}
