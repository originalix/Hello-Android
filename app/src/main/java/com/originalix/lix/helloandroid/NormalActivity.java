package com.originalix.lix.helloandroid;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class NormalActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("lix", "Task id is " + getTaskId());
        setContentView(R.layout.activity_normal);
        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NormalActivity.this, FirstActivity.class);
                startActivity(intent);
            }
        });

        Intent intent = getIntent();
        String data1 = intent.getStringExtra("param1");
        String data2 = intent.getStringExtra("param2");
        Log.d("lix", "data1: " + data1 + " , data2: " + data2);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lix", "Normal Destroy");
    }

    public static void actionStart(Context context, String data1, String data2) {
        Intent intent = new Intent(context, NormalActivity.class);
        intent.putExtra("param1", data1);
        intent.putExtra("param2", data2);
        context.startActivity(intent);
    }
}
