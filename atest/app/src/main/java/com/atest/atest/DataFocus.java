package com.atest.atest;

import android.os.Bundle;

public class DataFocus {
    String title, item, text;
    int img;
    DataFocus(int i) {
        title = i + "**老师";
        item = "首页首页首页";
        text = "哈哈哈";
        img = R.drawable.activity;
    }
    DataFocus(String vtitle, String vitem, String vtext, int vimg) {
        title = vtitle;
        item = vitem;
        text = vtext;
        img = vimg;
    }
    DataFocus(Bundle x) {
        title = x.getString("title");
        item = x.getString("item");
        text = x.getString("text");
        img = x.getInt("img");
    }
    Bundle toBundle() {
        Bundle ret = new Bundle();
        ret.putString("title", title);
        ret.putString("item", item);
        ret.putString("text", text);
        ret.putInt("img", img);
        return ret;
    }
    String str(){
        return "所谓师德，是教师应有的道德和行为规范，是全社会道德体系的组成部分，是青少年学生道德修养的楷模之一。从实践的角度看，具有高尚情操、渊博学识和人格魅力的教师，会对其学生产生一辈子的影响。\n" +
                "\n" +
                "师德，是教师工作的精髓，可以用“师爱为魂，学高为师，身正为范”概括其内涵。\n" +
                "\n" +
                "师爱为魂。“师爱”是教师对学生无私的爱，它是师德的核心，即“师魂”。从爱学生的角度讲，就是教师要做学生的良师益友。\n" +
                "\n" +
                "\n" +
                "让师德在教育中闪光:\n" +
                "\n" +
                "一、真情投入，把班级营造成温馨和谐的家\n" +
                "\n" +
                "二、春风化雨，用爱去浇灌学生的心灵之花\n" +
                "\n" +
                "如果说，教育是太阳底下最光辉的事业，那么师德是教育的光辉；如果说教师是塑造人类灵魂的工程师，而师德就是教师的灵魂。师德是人梯，给求学的攀登者以无穷的帮助；师德是绿叶，衬托着千万朵桃李之花尽情地开放；师德是渡船，搭送着求知者驶向成功的彼岸；师德是教师的人格魅力，是教育的全部生命。苏霍姆林斯基说过：“没有爱就没有教育。”讲台下，每个教师所面对的不止是几十双渴求知识的眼睛，而是一个需要用爱来倾注的浩瀚的海洋。\n" +
                "\n" +
                "法国作家拉封丹有这样一则寓言：\n" +
                "\n" +
                "北风和南风比试，看谁能把行人身上的大衣脱掉。北风首先发威，行人为了抵御北风侵袭，把大衣越裹越紧，北风失败了。轮到南风的时候，南风则徐徐吹拂。顿时，行人觉得春暖衣厚，开始解开衣扣，脱掉大衣。\n" +
                "\n" +
                "教育教学工作就如这南风和北风一样，有些教师以为对学生越严厉，要求越严格，学生就会越听话，越服从。其实完全错了，最能打动学生心灵的往往是教师如春雨般滋润的爱。\n" +
                "\n" +
                "德育工作是一个长期的过程、复杂的过程、最为重要的过程，它会影响到孩子的一生，我将继续不懈地探索，用忘我的工作热情、朴实的师德风范，去教好书，育好人，在三尺讲台上尽洒自己的心血和汗水，让“人民教师”这一光荣称号成为一座永恒的丰碑。";
    }
}
