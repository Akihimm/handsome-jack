package SwingTest;

import javax.swing.*;
import java.awt.*;

public class ComboTest extends JFrame {
    public static void main(String[] args) {
        new ComboTest();
    }
    public  ComboTest(){//下拉框
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();
        JComboBox jComboBox =new JComboBox();
        String[] strings={"5","df","dsf"};
        jComboBox.addItem("hello");
        jComboBox.addItem("byebye");

        contentPane.add(jComboBox);
    }
}
