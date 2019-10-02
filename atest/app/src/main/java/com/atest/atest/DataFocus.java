package com.atest.atest;

import android.os.Bundle;

public class DataFocus {
    String title, item;
    DataFocus(int i) {
        title = i + "**老师";
        item = "首页首页首页";
    }
    DataFocus(Bundle x) {
        title = x.getString("title");
        item = x.getString("item");
    }
    Bundle toBundle() {
        Bundle ret = new Bundle();
        ret.putString("title", title);
        ret.putString("item", item);
        return ret;
    }
    String str(){
        return title + "\n" + item;
    }
}
