package com.atest.atest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ActivityLessonReal extends AppCompatActivity {
    private List<DataLessonReal> lesson;
    private AdapterLessonReal adapterLesson;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_real);
        lesson = new ArrayList<>();
        for(int i = 0; i < 20; ++i) {
            lesson.add(new DataLessonReal(i));
        }
        final RecyclerView listLesson = findViewById(R.id.rv_lesson);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        listLesson.setLayoutManager(layoutManager);
        adapterLesson = new AdapterLessonReal(lesson);
        listLesson.setAdapter(adapterLesson);
    }
}
