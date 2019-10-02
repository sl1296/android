package com.atest.atest;

import android.os.Bundle;

public class DataTextWeb {
    String title, item;
    DataTextWeb(int i) {
        title = "在线教育网站" + i;
        item = "**** **** ****";
    }
    DataTextWeb(Bundle x) {
        title = x.getString("title");
        item = x.getString("item");
    }
    Bundle toBundle() {
        Bundle ret = new Bundle();
        ret.putString("title", title);
        ret.putString("item", item);
        return ret;
    }
}
