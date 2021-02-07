package Test1;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TestKey {
    public static void main(String[] args) {
    new KeyFrame();
    }
}
class KeyFrame extends Frame{
    public KeyFrame(){
        setVisible(true);
        setBounds(200,200,300,500);
        this.addKeyListener(new MyKeyListener());
    }
}
class MyKeyListener extends KeyAdapter{
    @Override
    public void keyPressed(KeyEvent e) {
        int n=e.getKeyCode();
        if (n==KeyEvent.VK_B){
            System.out.println("你好我叫董宇");
        }
    }
}