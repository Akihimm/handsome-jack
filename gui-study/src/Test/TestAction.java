package Test;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.security.PrivateKey;

public class TestAction {
    public static void main(String [] args){
        Frame Frame=new Frame();
        Button Button=new Button("put out");
        Button button=new Button("Cancel");
        //定制一个动作监听器
        ActionListener actionListener=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            System.exit(0);
            }
        };
        Frame.add(button,BorderLayout.WEST);
        Frame.add(Button,BorderLayout.EAST);
        Frame.setVisible(true);
        MyActionListener myActionListener=new MyActionListener();
        //给按钮添加动作监听器
        Button.addActionListener(myActionListener);
        button.addActionListener(actionListener);
        Frame.setBounds(300,300,700,700);
        Frame.pack();
        Frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        }

    }

//此处主要说明监听器是接口此处为接口的对接
class MyActionListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("你好按钮");
    }
}