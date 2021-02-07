package Test;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TestPanel {
    public static void main(String[] args) {
        Frame Frame=new Frame("董宇脱单神器");
        Panel Panel=new Panel();
        Frame.setLayout(null);
        Frame.setVisible(true);
        Frame.setBounds(300,300,500,500);
        Frame.setBackground(new Color(14, 16, 14));
        Panel.setBounds(50,50,400,400);
        Panel.setBackground(new Color(46, 167, 144, 151));
        Frame.add(Panel);//将面板添加到框
        Frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                //此处为结束程序
                System.exit(0);
            }
        });


    }
}
