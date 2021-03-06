package com.originalix.lix.helloandroid;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class LifeCycleActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("lix", "onCreate");
        Log.d("lix", "Task id is " + getTaskId());
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_life_cycle);

        if (savedInstanceState != null) {
            String tempData = savedInstanceState.getString("data_key");
            Log.d("lix", tempData);
        }

        Button startNormalActivity = (Button) findViewById(R.id.start_normal_activity);
        Button startDialogActivity = (Button) findViewById(R.id.start_dialog_activity);
        Button createMyselfButton = (Button) findViewById(R.id.create_myself);
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

        createMyselfButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(LifeCycleActivity.this, NormalActivity.class);
//                startActivity(intent);

                NormalActivity.actionStart(LifeCycleActivity.this, "dataaaa1", "dataaaa2");
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

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        String tempData = "something you just typed";
        outState.putString("data_key", tempData);
    }
}
