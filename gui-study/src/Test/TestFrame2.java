package Test;
import java.awt.*;
public class TestFrame2 {
    public static void main(String [] args){
    MyFrame myframe=new MyFrame(100,100,100,100,Color.CYAN);

    }
}
class MyFrame extends Frame{//继承不填类名要填frame铭
    static int id=0;
    public MyFrame(int x,int y,int w,int h,Color color){
        super("我的第几个窗口"+(++id));//此处为super（）在子类重构方法中的应用
        setBounds(x,y,w,h);//这是新窗口的参数设置
        setBackground(color);
        setVisible(true);
    }
}

