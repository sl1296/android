package com.atest.atest;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class FragmentText extends Fragment {
    private View view;
    private List<DataTextWeb> web;
    private AdapterTextWeb adapterWeb;
    private List<DataTextLesson> lesson;
    private AdapterTextLesson adapterLesson;
    @Override
    @Nullable public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_text, container, false);
        return view;
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        web = new ArrayList<>();
        lesson = new ArrayList<>();
        for(int i = 0; i < 20; ++i) {
            web.add(new DataTextWeb(i));
            lesson.add(new DataTextLesson(i));
        }
        adapterWeb = new AdapterTextWeb(getContext(), web);
        ListView listWeb = view.findViewById(R.id.lv_textveb);
        listWeb.setAdapter(adapterWeb);
        listWeb.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(getContext(), ActivityTextWeb.class).putExtra("1",web.get(position).toBundle()));
            }
        });

        RecyclerView listLesson = view.findViewById(R.id.rv_lesson);
        GridLayoutManager layoutManager = new GridLayoutManager(getContext(), 3);
        listLesson.setLayoutManager(layoutManager);
        adapterLesson = new AdapterTextLesson(lesson);
        listLesson.setAdapter(adapterLesson);
    }
}