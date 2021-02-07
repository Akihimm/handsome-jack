package SwingTest;

import javax.swing.*;
import java.awt.*;

public class ScrollPanelTest extends JFrame {
    public ScrollPanelTest() {
        TextArea textArea=new TextArea(20,30);
        textArea.setText("欢迎来到1216");
        Container contentPane = this.getContentPane();
        JScrollPane jScrollPane=new JScrollPane(textArea);//再次使用的滑动窗口并且添加了文字域
        contentPane.add(jScrollPane);
        this.setSize(500,500);
        contentPane.setVisible(true);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
       new ScrollPanelTest();
    }

}
