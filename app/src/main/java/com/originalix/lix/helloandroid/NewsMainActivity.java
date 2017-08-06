package com.originalix.lix.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NewsMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_main);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }
}
