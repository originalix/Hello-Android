package com.originalix.lix.helloandroid;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /* 因为继承自AppCompatActivity 所以下面方法无效*/
        //this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        /* 换此方法隐藏标题栏 */
//        if (getSupportActionBar() != null) {
//            getSupportActionBar().hide();
//        }

        setContentView(R.layout.activity_main);
        Log.e("xyz->HelloAndroidActivity", "onCreate execute");

//        Button button1 = (Button) findViewById(R.id.button2);
//        button1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "You clicked Button 1", Toast.LENGTH_SHORT).show();
//                String data = "Hello Lix. I love U";
//                Intent intent = new Intent(MainActivity.this, FirstActivity.class);
//                intent.addCategory("android.intent.firstActivity");  /* 隐式调用Intent */
//                intent.putExtra("extra_data", data);
////                intent.setData(Uri.parse("http://baidu.com"));
////                startActivity(intent);
//                startActivityForResult(intent, 1);
//            }
//        });
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add_item:
                Toast.makeText(this, "You clicked add", Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this, "You clicked remove", Toast.LENGTH_LONG).show();
                break;
        }
        return true;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case 1:
                if (resultCode == RESULT_OK) {
                    String returnedData = data.getStringExtra("data_return");
                    Log.d("lix", returnedData);
                }
                break;
            default:
        }
    }
}
