package com.originalix.lix.helloandroid;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class LifeCycleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("lix", "onCreate");
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_life_cycle);
        Button startNormalActivity = (Button) findViewById(R.id.start_normal_activity);
        Button startDialogActivity = (Button) findViewById(R.id.start_dialog_activity);
        startNormalActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LifeCycleActivity.this, NormalActivity.class);
                startActivity(intent);
            }
        });

        startDialogActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LifeCycleActivity.this, DialogActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lix", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lix", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lix", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lix", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lix", "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("lix", "onRestart");
    }
}
