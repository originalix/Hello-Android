package com.originalix.lix.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class UISizeActivity extends AppCompatActivity {

    private ListView msgListView;
    private EditText inputText;
    private Button send;
    private MsgAdapter adapter;
    private List<Msg> msgList = new ArrayList<Msg>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uisize);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        float xdpi = getResources().getDisplayMetrics().xdpi;
        float ydpi = getResources().getDisplayMetrics().ydpi;
        Log.d("lix", "xdpi is " + xdpi);
        Log.d("lix", "ydpi is " + ydpi);
        initMsg();
        adapter = new MsgAdapter(UISizeActivity.this, R.layout.msg_item, msgList);
        inputText = (EditText) findViewById(R.id.input_text);
        send = (Button) findViewById(R.id.send);
        msgListView = (ListView) findViewById(R.id.msg_list_view);
        msgListView.setAdapter(adapter);

    }

    protected void initMsg() {
        Msg msg1 = new Msg("Hello wsx.", Msg.TYPE_RECEIVED);
        msgList.add(msg1);
        Msg msg2 = new Msg("Hi.", Msg.TYPE_SENT);
        msgList.add(msg2);
        Msg msg3 = new Msg("I m sure", Msg.TYPE_RECEIVED);
        msgList.add(msg3);
        Msg msg4 = new Msg("meeeeeeeeeeeeee tooooooo", Msg.TYPE_SENT);
        msgList.add(msg4);
    }
}
