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
    String str1() {
        return pos;
    }
    String str2(){
        return price;
    }
    String str3(){
        return item;
    }
    String str4(){
        return time;
    }
}
