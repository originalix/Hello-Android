package com.originalix.lix.helloandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        hiddenActionBar();
        setContentView(R.layout.activity_home_page);
        pushToUISizeActivity();
        pushToNewFragment();
        pushToNews();
        pushToNetBroadcast();
        sendMyBroadcast();
    }

    protected void hiddenActionBar() {
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }

    protected void pushToUISizeActivity() {
        Button uisizeBtn = (Button) findViewById(R.id.button_1);
        uisizeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePageActivity.this, UISizeActivity.class);
                startActivity(intent);
            }
        });
    }

    protected void pushToNewFragment() {
        Button fragmentBtn = (Button) findViewById(R.id.button_2);
        fragmentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePageActivity.this, FirstFragmentActivity.class);
                startActivity(intent);
            }
        });
    }

    protected void pushToNews() {
        Button newsBtn = (Button) findViewById(R.id.button_3);
        newsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePageActivity.this, NewsMainActivity.class);
                startActivity(intent);
            }
        });
    }

    protected void pushToNetBroadcast() {
        Button netBtn = (Button) findViewById(R.id.button_4);
        netBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePageActivity.this, NetworkBroadcastActivity.class);
                startActivity(intent);
            }
        });
    }

    protected void sendMyBroadcast() {
        Button btn = (Button) findViewById(R.id.button_5);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.originalix.lix.helloandroid.MY_BROADCAST");
                sendOrderedBroadcast(intent, null);
            }
        });
    }
}
