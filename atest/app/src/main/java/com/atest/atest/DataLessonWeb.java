package com.atest.atest;

import android.os.Bundle;

public class DataLessonWeb {
    String title, item;
    DataLessonWeb(int i) {
        title = "在线教育网站" + i;
        item = "**** **** ****";
    }
    DataLessonWeb(Bundle x) {
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
