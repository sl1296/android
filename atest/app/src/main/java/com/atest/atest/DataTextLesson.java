package com.atest.atest;

public class DataTextLesson {
    String name, pos, price, item, time;
    DataTextLesson(int i) {
        name = "**辅导班" + i;
        pos = "" + i;
        price = pos;
        item = pos;
        time = pos;
    }
    String str() {
        return "位置：" + pos + "\n价格：" + price + "\n课程内容：" + item + "\n课程安排：" + time;
    }
}
