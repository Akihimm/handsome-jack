package Test1;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

public class TestPaintPanel {
    public static void main(String[] args) {
    new MyFrame();
    }
}
class MyFrame extends Frame implements KeyListener {
    //该集合是对鼠标点记录的
    ArrayList Points;

    public MyFrame(){
        Points=new ArrayList();
        setVisible(true);
        setBounds(200,200,300,500);
        this.addMouseListener( new MyMouseListener());
    }
    //方法将鼠标监视器收集到的点传给记录鼠标垫的集合
    public   void AddPoints(Point point){
        Points.add(point);
    }
    @Override
    public void paint(Graphics g) {
        //利用迭代器来“使用”集合中的点
        Iterator iterator=Points.iterator();
        while (iterator.hasNext()){
            Point points=(Point) iterator.next();
            g.setColor(Color.RED);
            g.drawOval(points.x,points.y,10,10);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
 class MyMouseListener extends MouseAdapter{
    @Override
    public void mousePressed(MouseEvent e) {
        //引出MYFrame并且将监视的窗口设置为MyFrame
        MyFrame myFrame=(MyFrame) e.getSource();
    myFrame.AddPoints(new Point(e.getX(),e.getY()));
    myFrame.repaint();
    }
}