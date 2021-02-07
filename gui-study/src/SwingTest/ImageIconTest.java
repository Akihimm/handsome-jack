package SwingTest;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageIconTest extends JFrame {
    public ImageIconTest() {
        URL url = ImageIconTest.class.getResource("1.jpg");
    JLabel jLabel=new JLabel("你好漫天星空");
        ImageIcon icon = new ImageIcon(url);
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);//设置居中
        jLabel.setIcon(icon);
        Container container = getContentPane();
        this.setVisible(true);
        container.setBounds(200,300,330,200);
        container.add(jLabel);


    }

    public static void main(String[] args) {
        new ImageIconTest();
    }
}

