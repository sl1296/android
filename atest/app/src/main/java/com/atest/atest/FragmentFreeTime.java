package com.atest.atest;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zhpan.viewpager.holder.HolderCreator;
import com.zhpan.viewpager.holder.ViewHolder;
import com.zhpan.viewpager.view.CircleViewPager;

import java.util.ArrayList;
import java.util.List;

public class FragmentFreeTime extends Fragment {
    private View view;
    private XNavigationView nv;
    private ViewPager vp;
    private TextView tvFocus, tvSquare;
    private List<Fragment> fragment;
    private CircleViewPager cvp;
    private List<XImageData> image;
    @Override
    @Nullable public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_freetime, container, false);
        return view;
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initFragment();
        cvp = view.findViewById(R.id.cvp_image);
        cvp.isShowIndicator(true);
        cvp.setIndicatorGravity(Gravity.CENTER);
        cvp.setIndicatorRadius(4);
        cvp.setIndicatorColor(0xff767676,0xff000000);
        cvp.setCanLoop(true);
        cvp.setAutoPlay(true);
        cvp.setInterval(2000);
        cvp.setOnPageClickListener(new CircleViewPager.OnPageClickListener() {
            @Override
            public void onPageClick(int position) {
                startActivity(new Intent(getContext(), ActivityHot.class).putExtra("1",position));
            }
        });
        image = new ArrayList<>();
        image.add(new XImageData());
        image.add(new XImageData());
        image.add(new XImageData());
        image.add(new XImageData());
        cvp.setPages(image, new HolderCreator<ViewHolder>() {
            @Override
            public ViewHolder createViewHolder() {
                return new XImageViewHolder();
            }
        });
    }
    private void initFragment() {
        fragment = new ArrayList<>();
        fragment.add(new FragmentFreeTimeFocus());
        fragment.add(new FragmentFreeTimeSquare());
        nv = view.findViewById(R.id.nv_line);
        vp = view.findViewById(R.id.vp_mainm);
        vp.setCurrentItem(0);
        tvFocus = view.findViewById(R.id.tv_focus);
        tvSquare = view.findViewById(R.id.tv_square);
        setSelect(tvFocus);
        setUnselect(tvSquare);
        tvFocus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changePage(0);
            }
        });
        tvSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changePage(1);
            }
        });
        vp.setAdapter(new AdapterFreeTime(getChildFragmentManager(), fragment));
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
                    setSelect(tvFocus);
                    setUnselect(tvSquare);
                } else if (i == 1) {
                    setSelect(tvSquare);
                    setUnselect(tvFocus);
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

    @Override
    public void onDestroy() {
        super.onDestroy();
        cvp.stopLoop();
    }
}