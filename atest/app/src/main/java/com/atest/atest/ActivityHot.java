package com.atest.atest;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ActivityHot extends AppCompatActivity {
    private XNavigationView nv;
    private ViewPager vp;
    private TextView tvActive, tvHot;
    private List<Fragment> fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hot);
        int x = getIntent().getIntExtra("1",0);
        TextView tv = findViewById(R.id.tv_title);
        String s = "choose=" + x;
        tv.setText(s);
        initFragment();
    }
    void initFragment() {
        fragment = new ArrayList<>();
        fragment.add(new FragmentFreeTimeActive());
        fragment.add(new FragmentFreeTimeHot());
        nv = findViewById(R.id.nv_line);
        vp = findViewById(R.id.vp_mainm);
        vp.setCurrentItem(0);
        tvActive = findViewById(R.id.tv_active);
        tvHot = findViewById(R.id.tv_hot);
        setSelect(tvActive);
        setUnselect(tvHot);
        tvActive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changePage(0);
            }
        });
        tvHot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changePage(1);
            }
        });
        vp.setAdapter(new AdapterFreeTime(getSupportFragmentManager(), fragment));
        vp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {
                // i:当前页面，及你点击滑动的页面；v:当前页面偏移的百分比；i1:当前页面偏移的像素位置
                nv.setCurrentCount(v);
            }
            @Override
            public void onPageSelected(int i) {
                // 当前选中的页面
                vp.setCurrentItem(i);
                nv.setPageSelected(i);
                if (i == 0) {
                    setSelect(tvActive);
                    setUnselect(tvHot);
                } else if (i == 1) {
                    setSelect(tvHot);
                    setUnselect(tvActive);
                }
            }
            @Override
            public void onPageScrollStateChanged(int i) {
                // 1表示正在滑动，2表示滑动完毕了，0表示什么都没做。
            }
        });
    }
    private void changePage(int i) {
        vp.setCurrentItem(i);
    }
    private void setSelect(TextView x) {
        x.setTextColor(0xff000000);
        x.setTextSize(20);
    }
    private void setUnselect(TextView x) {
        x.setTextColor(0xff767676);
        x.setTextSize(17);
    }
}
