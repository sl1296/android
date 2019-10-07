package com.atest.atest;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class FragmentTextActive extends Fragment {
    private View view;
    private List<DataActive> list;
    private AdapterTextActive adapter;
    @Override
    @Nullable public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_text_active, container, false);
        return view;
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        list = new ArrayList<>();
        list.add(new DataActive("爱心公益", "#留守儿童#"));
        list.add(new DataActive("经历分享", "#青藏之旅#"));
        list.add(new DataActive("主题竞赛", "#清晨打卡#"));
        adapter = new AdapterTextActive(getContext(), list);
        ListView lv = view.findViewById(R.id.exam_list);
        lv.setAdapter(adapter);
    }
}