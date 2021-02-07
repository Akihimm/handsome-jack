package SwingTest;

import javax.swing.*;
import java.awt.*;

public class IconTest extends JFrame implements Icon {

        int width;
        int height;
        public IconTest(){}
        public IconTest(int width, int height) {
            this.width = width;
            this.height = height;
        }
        public void init(){
            IconTest iconTest = new IconTest(15,15);
            JLabel jLabel = new JLabel("hello", iconTest, SwingConstants.CENTER);
            final Container contentPane = getContentPane();
            contentPane.add(jLabel);
            this.setVisible(true);


        }

    public static void main(String[] args) {
       new IconTest().init();
    }
        @Override
        public void paintIcon(Component c, Graphics g, int x, int y) {
            g.fillOval(x,y,width,height );
        }

        @Override
        public int getIconWidth() {
            return this.width;
        }

        @Override
        public int getIconHeight() {
            return this.height;
        }
    }

