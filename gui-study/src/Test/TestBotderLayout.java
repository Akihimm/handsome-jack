package Test;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestBotderLayout {
    public static void main(String [] args) {
        Frame Frame = new Frame("董宇是海王");
        Frame.setVisible(true);
        Button Button1 = new Button("East");
        Button Button2 = new Button("West");
        Button Button3 = new Button("South");
        Button Button4 = new Button("North");
        Frame.setLayout(new BorderLayout());
        Frame.add(Button1,BorderLayout.EAST);
        Frame.add(Button2,BorderLayout.WEST);
        Frame.add(Button3,BorderLayout.SOUTH);
        Frame.add(Button4,BorderLayout.NORTH);
        Frame.setBounds(300,300,500,500);
        Frame.setBackground(new Color(0x317095));

        Frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
