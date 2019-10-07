package com.atest.atest;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;

public class ActivityMain extends AppCompatActivity {
    private Fragment fragment[];
    private BottomNavigationBar bar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    private void initView() {
        fragment = new Fragment[]{new FragmentText(), new FragmentFire(), new FragmentExam(), new FragmentLesson(), new FragmentFoot()};
        replaceFragment(0);
        bar = findViewById(R.id.bnb_bottom);
        bar.setTabSelectedListener(new BottomNavigationBar.OnTabSelectedListener() {
            @Override
            public void onTabSelected(int position) {
                replaceFragment(position);
            }
            @Override
            public void onTabUnselected(int position) { }
            @Override
            public void onTabReselected(int position) { }
        });
        bar.setMode(BottomNavigationBar.MODE_FIXED)
            .setBackgroundStyle(BottomNavigationBar.BACKGROUND_STYLE_RIPPLE)
            .setBarBackgroundColor("#ffffffff")
            .setInActiveColor("#ffffff")
            .setActiveColor("#ffa26ac4")
            .addItem(new BottomNavigationItem(R.drawable.pagec,"文萃").setInactiveIconResource(R.drawable.page))
            .addItem(new BottomNavigationItem(R.drawable.firec,"燃烧").setInactiveIconResource(R.drawable.fire))
            .addItem(new BottomNavigationItem(R.drawable.penc,"测测").setInactiveIconResource(R.drawable.pen))
            .addItem(new BottomNavigationItem(R.drawable.homec,"课余").setInactiveIconResource(R.drawable.home))
            .addItem(new BottomNavigationItem(R.drawable.facec,"足迹").setInactiveIconResource(R.drawable.face))
            .setFirstSelectedPosition(0)
            .initialise();
    }
    private void replaceFragment(int i) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fl_main, fragment[i]);
        transaction.commit();
    }
}