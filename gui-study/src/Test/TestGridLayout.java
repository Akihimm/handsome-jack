package Test;

import java.awt.*;

public class TestGridLayout {
    public static void main(String [] args){
        Frame Frame=new Frame();
        Frame.setBounds(300,300,400,400);
        Button Button1 = new Button("btn1");
        Button Button2 = new Button("btn2");
        Button Button3 = new Button("btn3");
        Button Button4 = new Button("btn4");
        Button Button5 = new Button("btn5");
        Button Button6 = new Button("btn6");
        Frame.setLayout(new GridLayout(3,2));
        Frame.add(Button1);
        Frame.add(Button2);
        Frame.add(Button3);
        Frame.add(Button4);
        Frame.add(Button5);
        Frame.add(Button6);
        Frame.pack();//java函数自动选择优秀的布局
        Frame.setVisible(true);
    }
}
