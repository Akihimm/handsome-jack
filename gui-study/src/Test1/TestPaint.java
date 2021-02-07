package Test1;

import java.awt.*;

public class TestPaint {
    public static void main(String[] args) {
        new PaintTest().LoadFrame();
    }
}
class PaintTest extends Frame {
    public void LoadFrame(){
        setVisible(true);
        setBounds(200,200,600,500);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.draw3DRect(200,200,200,200,false);
    }
}