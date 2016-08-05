package com.bolg.macbook.demoforintent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by macbook on 2016/8/5.
 */

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        /**
         * 接受传递过来的参数
         */
        Intent intent = getIntent();
        String getName = intent.getStringExtra("Name");
        int getAge = intent.getIntExtra("Age", 0);
        boolean getIsMan = intent.getBooleanExtra("IsMan", false);
    }

    /**
     * 返回上层页面并把内容带回上层页面
     */
    public void back(View v) {
        Intent intent = new Intent();
        intent.putExtra("YoursMsg", "我想给上层界面返回一个名字Tom");
        setResult(2000, intent);
        finish();
    }
}
