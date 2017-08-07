package com.originalix.lix.helloandroid;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SharedPreferencesActivity extends AppCompatActivity {

    private Button saveBtn;
    private Button loadBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preferences);
        saveBtn = (Button) findViewById(R.id.button_1);
        loadBtn = (Button) findViewById(R.id.button_2);

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = getSharedPreferences("data", MODE_PRIVATE).edit();
                editor.putString("name", "Wsx");
                editor.putInt("age", 20);
                editor.putBoolean("married", false);
                editor.commit();
            }
        });
    }
}
g