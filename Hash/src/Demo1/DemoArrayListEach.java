package Demo1;

import java.util.ArrayList;

public class DemoArrayListEach {
    public static void main(String[] args) {;
        ArrayList<String> list=new ArrayList<>();
        list.add("董宇");
        list.add("董子杰");
        list.add("冯豪");
        for (int i = 0; i < list.size(); i++) {//此处可以用list.fori来生成
            System.out.println(list.get(i));
        }
    }
}
