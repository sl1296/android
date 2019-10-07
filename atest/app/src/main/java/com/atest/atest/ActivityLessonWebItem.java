package com.atest.atest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityLessonWebItem extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_web_item);
        TextView tmp = findViewById(R.id.tv_item);
        DataLessonWeb d = new DataLessonWeb(getIntent().getBundleExtra("1"));
        String s = d.title + "\n" + d.item + "价格：\n简介：\n评级：\n精品课程推荐：";
        tmp.setText(s);
    }
}