package com.originalix.lix.helloandroid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

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
        pushToLogin();
        pushToSaveView();
        pushToSharedPerferencesView();
        createDatabase();
        readContacts();
        useNotice();
        receiverSMS();
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

    protected void pushToLogin() {
        Button btn = (Button) findViewById(R.id.button_6);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePageActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }

    protected void pushToSaveView() {
        Button btn = (Button) findViewById(R.id.button_7);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePageActivity.this, SaveTextActivity.class);
                startActivity(intent);
            }
        });
    }

    protected void pushToSharedPerferencesView() {
        Button btn = (Button) findViewById(R.id.button_8);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePageActivity.this, SharedPreferencesActivity.class);
                startActivity(intent);
            }
        });
    }

    protected void createDatabase() {
        Button btn = (Button) findViewById(R.id.button_9);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePageActivity.this, DatabaseActivity.class);
                startActivity(intent);
            }
        });
    }

    protected void readContacts() {
        Button btn = (Button) findViewById(R.id.button_10);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePageActivity.this, ContactsActivity.class);
                startActivity(intent);
            }
        });
    }

    protected void useNotice() {
        Button btn = (Button) findViewById(R.id.button_11);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePageActivity.this, NotificationActivity.class);
                startActivity(intent);
            }
        });
    }

    protected void receiverSMS() {
        Button btn = (Button) findViewById(R.id.button_12);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePageActivity.this, SMSActivity.class);
                startActivity(intent);
            }
        });
    }

    private IntentFilter intentFilter;
    private LocalReceiver localReceiver;
    private LocalBroadcastManager localBroadcastManager;

    protected void sendMyBroadcast() {
        localBroadcastManager = LocalBroadcastManager.getInstance(this);
        Button btn = (Button) findViewById(R.id.button_5);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.originalix.lix.helloandroid.MY_BROADCAST");
                localBroadcastManager.sendBroadcast(intent);
            }
        });
        intentFilter = new IntentFilter();
        intentFilter.addAction("com.originalix.lix.helloandroid.MY_BROADCAST");
        localReceiver = new LocalReceiver();
        localBroadcastManager.registerReceiver(localReceiver, intentFilter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        localBroadcastManager.unregisterReceiver(localReceiver);
    }

    class LocalReceiver extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            Toast.makeText(context, "received local broadcast", Toast.LENGTH_SHORT).show();
        }
    }
}
