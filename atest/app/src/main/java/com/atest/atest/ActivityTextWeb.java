package com.atest.atest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityTextWeb extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_web);
        TextView tmp = findViewById(R.id.tv_item);
        DataTextWeb d = new DataTextWeb(getIntent().getBundleExtra("1"));
        String s = d.title + "\n" + d.item + "价格：\n简介：\n评级：\n精品课程推荐：";
        tmp.setText(s);
    }
}
