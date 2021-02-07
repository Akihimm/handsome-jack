package Test;

import java.awt.*;

public class TestFrame {


    public static void main(String[] args) {
        Frame Frame = new Frame("我的第一个java图形界面窗口");
    //设置窗口可视化
    Frame.setVisible(true);
    //设置窗口大小
    Frame.setSize(400,400);
    //设置背景颜色
    Frame.setBackground(Color.CYAN);
    //设置初始位置
    Frame.setLocation(200,200);
    //设置是否可以改变大小、
    Frame.setResizable(true);
    }
}
