package com.originalix.lix.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HomePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        hiddenActionBar();
        setContentView(R.layout.activity_home_page);
    }

    protected void hiddenActionBar() {
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }
}
