package Test;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyMonitor implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("b2被按下了msg："+e.getActionCommand());
    }

    public static class TestAction2 {
        public static void main(String [] args){
        Frame Frame=new Frame("start-stop");
        Frame.setVisible(true);
        Frame.setBounds(300,300,500,500);
        Button b1=new Button("start");
        Button b2=new Button("stop");
        MyMonitor myMonitor=new MyMonitor();
        b1.addActionListener(myMonitor);
        b2.addActionListener(myMonitor);
        b2.setActionCommand("b2-stop");
        Frame.add(b1);
        Frame.add(b2);

        }
    }
}