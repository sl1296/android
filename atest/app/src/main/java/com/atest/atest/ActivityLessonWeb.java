package com.atest.atest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ActivityLessonWeb extends AppCompatActivity {
    private List<DataLessonWeb> web;
    private AdapterLessonWeb adapterWeb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_web);
        web = new ArrayList<>();
        for(int i = 0; i < 20; ++i) {
            web.add(new DataLessonWeb(i));
        }
        adapterWeb = new AdapterLessonWeb(this, web);
        final ListView listWeb = findViewById(R.id.lv_textveb);
        listWeb.setAdapter(adapterWeb);
        listWeb.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(ActivityLessonWeb.this, ActivityLessonWebItem.class).putExtra("1",web.get(position).toBundle()));
            }
        });
    }
}