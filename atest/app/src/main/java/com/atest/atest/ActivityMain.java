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
        fragment = new Fragment[]{new FragmentFreeTime(), new FragmentExam(), new FragmentText(), new FragmentFootPrint()};
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
            .setBarBackgroundColor("#2FA8E1")
            .setInActiveColor("#929292")
            .setActiveColor("#ffffff")
            .addItem(new BottomNavigationItem(R.drawable.ic_launcher_background,"课余").setInactiveIconResource(R.drawable.ic_launcher_foreground)) // 添加Item
            .addItem(new BottomNavigationItem(R.drawable.ic_launcher_background,"测测").setInactiveIconResource(R.drawable.ic_launcher_foreground))
            .addItem(new BottomNavigationItem(R.drawable.ic_launcher_background,"文萃").setInactiveIconResource(R.drawable.ic_launcher_foreground))
            .addItem(new BottomNavigationItem(R.drawable.ic_launcher_background,"足迹").setInactiveIconResource(R.drawable.ic_launcher_foreground))
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