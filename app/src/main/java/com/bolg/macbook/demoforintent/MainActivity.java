package com.bolg.macbook.demoforintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.text);
    }

    /**
     * 简单跳转
     */
    public void onClick01(View v) {

        Intent intent = new Intent();
        intent.setClass(this, SecondActivity.class);
        startActivity(intent);

    }

    /**
     * 携参跳转
     */
    public void onClick02(View v) {

        Intent intent = new Intent();
        intent.setClass(this, SecondActivity.class);
        intent.putExtra("Name", "Tom");
        intent.putExtra("Age", 18);
        intent.putExtra("IsMan", true);
        startActivity(intent);

    }

    /**
     * 含有索求的跳转
     */
    public void onClick03(View v) {

        Intent intent = new Intent();
        intent.setClass(this, SecondActivity.class);
        startActivityForResult(intent, 1000);

    }

    /**
     * 索求目的Activity反馈的内容
     */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1000 && resultCode == 2000) {
            String getMsg = data.getStringExtra("YoursMsg");
            text.setText("从目的Activity获取的内容：" + getMsg);
        }
    }
}
