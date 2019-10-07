package com.atest.atest;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

public class AdapterText extends FragmentPagerAdapter {
    private List<Fragment> list;
    AdapterText(FragmentManager fm, List<Fragment> x) {
        super(fm);
        list = x;
    }
    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }
    public int getCount() {
        return list.size();
    }
}
