package com.originalix.lix.helloandroid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.telephony.SmsMessage;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SMSActivity extends AppCompatActivity {

    private TextView sender;
    private TextView content;
    private IntentFilter receiverFilter;
    private MessageReceiver messageReceiver;

    private EditText to;
    private EditText msgInput;
    private Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);
//        sender = (TextView) findViewById(R.id.sender);
//        content = (TextView) findViewById(R.id.content);
//        receiverFilter = new IntentFilter();
//        receiverFilter.addAction("android.provider.Telephony.SMS_RECEIVED");
//        receiverFilter.setPriority(100);
//        messageReceiver = new MessageReceiver();
//        registerReceiver(messageReceiver, receiverFilter);
        to = (EditText) findViewById(R.id.to);
        msgInput = (EditText) findViewById(R.id.msg_input);
        send = (Button) findViewById(R.id.send);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SmsManager smsManager = SmsManager.getDefault();
                smsManager.sendTextMessage(to.getText().toString(), null, msgInput.getText().toString(), null, null);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(messageReceiver);
    }

    class MessageReceiver extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            Bundle bundle = intent.getExtras();
            Object[] pdus = (Object[]) bundle.get("pdus");
            SmsMessage[] messages = new SmsMessage[pdus.length];
            for (int i = 0; i < messages.length; i++) {
                messages[i] = SmsMessage.createFromPdu((byte[]) pdus[i]);
            }

            String address = messages[0].getOriginatingAddress();
            String fullMessage = "";
            for (SmsMessage message : messages) {
                fullMessage += message.getMessageBody();
            }

            sender.setText(address);
            content.setText(fullMessage);
            abortBroadcast();
        }
    }
}
