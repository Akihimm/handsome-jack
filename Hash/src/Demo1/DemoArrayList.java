package Demo1;

import java.sql.SQLOutput;
import java.util.ArrayList;

//首先ArrayList长度可以发生改变
public class DemoArrayList {
    public static void main(String[] args){
        ArrayList<String> list=new ArrayList<>();//这个不是添加地址而是直接加的字符串
        list.add("付明铭");
        list.add("董宇");
        list.add("董子杰");
        list.add("高腾飞");
        list.add("冯豪");
        list.add("高新宇");
        System.out.println(list);
    }
}
