//这个要点是Frame分割成2个面板每个面板分成东西中结构 中间放一个面板用表格模式来盛放按钮即可。
package Test;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class NbTest {
    public static void main(String [] args){
        Frame Frame=new Frame();
        Frame.setVisible(true);
        Frame.setLayout(new GridLayout(2,1));
        Frame.setBounds(300,300,500,500);
        Frame.setBackground(Color.CYAN);

        Panel Panel1=new Panel(new BorderLayout());
        Panel Panel2=new Panel(new GridLayout(2,1));
        Panel Panel3=new Panel(new BorderLayout());
        Panel Panel4=new Panel(new GridLayout(2,2));
        Panel1.add(new Button("East"),BorderLayout.EAST);
        Panel1.add(new Button("West"),BorderLayout.WEST);
        Panel2.add(new Button("ptd1"));
        Panel2.add(new Button("ptd2"));
        Panel1.add(Panel2,BorderLayout.CENTER);
        Panel3.add(new Button("East"),BorderLayout.EAST);
        Panel3.add(new Button("West"),BorderLayout.WEST);
        Panel4.add(new Button("ptd1"));
        Panel4.add(new Button("ptd2"));
        Panel4.add(new Button("ptd3"));
        Panel4.add(new Button("ptd4"));
        Panel3.add(Panel4,BorderLayout.CENTER);
        Frame.add(Panel1);
        Frame.add(Panel3);
        Frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
