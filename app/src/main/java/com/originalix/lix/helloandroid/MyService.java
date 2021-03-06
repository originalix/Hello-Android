package com.originalix.lix.helloandroid;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.IntDef;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by Lix on 2017/8/10.
 */

public class MyService extends Service {

    private DownloadBinder mBinder = new DownloadBinder();

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("lix", "onCreate executed");
//        Notification notification = new Notification(R.mipmap.ic_launcher, "Notification comes", System.currentTimeMillis());
        Intent notificationIntent = new Intent(this, ServiceActivity.class);
        PendingIntent pi = PendingIntent.getActivity(this, 0, notificationIntent, 0);
        Notification.Builder builder = new Notification.Builder(this);
        builder.setContentTitle("This is title");
        builder.setContentText("This is content");
        builder.setSmallIcon(R.mipmap.ic_launcher);
        builder.setContentIntent(pi);
        Notification notification = builder.build();
        startForeground(1, notification);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("lix", "onStartCommand executed");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("lix", "onDestroy executed");
    }

    class DownloadBinder extends Binder {
        public void startDownload() {
            Log.d("lix", "startDownload executed");
        }

        public int getProgress() {
            Log.d("lix", "getProgress executed");
            return 0;
        }

    }
}
