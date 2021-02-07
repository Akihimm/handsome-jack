package SwingTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameTest extends JFrame{
    public void init(){

        setVisible(true);
        setBounds(200,200,300,500);
        JLabel jLabel=new JLabel("你好我叫董宇");
        setBackground(Color.BLUE);
        add(jLabel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//此处设置关闭操作
        Container container=this.getContentPane();
        container.setBackground(Color.RED);//容器里的颜色才是真正的背景颜色
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);//设置标签水平位置居中
        JButton jButton=new JButton("hello");
        jButton.setBounds(30,200,20,50);
        container.setLayout(null);
        container.add(jButton);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MyDiaLog();
            }
        });
    }
    public static void main(String[] args) {
        new JFrameTest().init();
    }
}
class MyDiaLog extends JDialog{
    public MyDiaLog(){
        Container container=this.getContentPane();
        container.setBackground(Color.CYAN);
        this.setBounds(20,20,300,500);
        this.setLayout(null);
        this.setVisible(true);

    }
}
