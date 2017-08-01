package com.originalix.lix.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /* 因为继承自AppCompatActivity 所以下面方法无效*/
        //this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        /* 换此方法隐藏标题栏 */
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        setContentView(R.layout.activity_main);
        Log.e("xyz->HelloAndroidActivity", "onCreate execute");
    }

}
