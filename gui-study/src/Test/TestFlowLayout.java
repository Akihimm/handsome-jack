package Test;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestFlowLayout {
    public static void main(String [] args){
        Frame Frame=new Frame("董宇不肯能脱单");
        Frame.setBounds(300,300,500,500);
        Frame.setBackground(new Color(30, 121, 127));
        Frame.setVisible(true);
        Button Button1 = new Button("肯定的");
        Button Button2 = new Button("当然了");
        Button Button3 = new Button("应该是吧");
        Frame.setLayout(new FlowLayout(FlowLayout.LEFT));//此处设置为流水布局
        Frame.add(Button1);
        Frame.add(Button2);
        Frame.add(Button3);
        Frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}
