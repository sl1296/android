package com.atest.atest;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class FragmentTextFocus extends Fragment {
    private View view;
    private List<DataFocus> list;
    private AdapterTextFocus adapter;
    @Override
    @Nullable public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_text_focus, container, false);
        return view;
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        list = new ArrayList<>();
        list.add(new DataFocus("小明家长","[明星家长认证]...","今天小明买了一束花给...",R.drawable.img101));
        list.add(new DataFocus("未来教育专家","[知名教育家，心理学家]...","孩子在成长过程中，家长...",R.drawable.img102));
        list.add(new DataFocus("小红家长","[普通用户]...","小红有好几天不理我了，因为...",R.drawable.img103));
        list.add(new DataFocus("小蓝","[可爱儿童欢乐多]...","你们与父母之间有没有...",R.drawable.img104));
        list.add(new DataFocus("小蓝","[可爱儿童欢乐多]...","你们与父母之间有没有...",R.drawable.img104));
        for(int i = 4; i < 15; ++i) {
            list.add(new DataFocus(i));
        }
        adapter = new AdapterTextFocus(getContext(), list);
        ListView lv = view.findViewById(R.id.lv_list);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(getContext(), ActivityFocus.class).putExtra("1",list.get(position).toBundle()));
            }
        });
    }
}