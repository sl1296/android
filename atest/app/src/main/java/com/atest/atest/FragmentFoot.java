package com.atest.atest;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class FragmentFoot extends Fragment {
    private View view;
    @Override
    @Nullable public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_foot, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ImageView iv = view.findViewById(R.id.iv_image);
        TextView user = view.findViewById(R.id.tv_username);
        TextView coin = view.findViewById(R.id.tv_coin);
        //iv.setImageResource(R.drawable.ic_launcher_background);
        user.setText("测试用户01");
        coin.setText("100");
    }
}