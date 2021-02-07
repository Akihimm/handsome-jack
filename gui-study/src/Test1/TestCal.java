package Test1;

import java.awt.*;
import java.awt.event.*;

public class TestCal {
    public static void main(String[] args) {
        new Calculator().LoadFrame();//此处只放一个对象和方法
    }
}
class Calculator extends Frame {
    TextField num1,num2,num3;//先定义一个属性然后在方法中运用
    public void LoadFrame(){

         num1=new TextField(10);
         num2=new TextField(10);
         num3=new TextField(20);
        Label label=new Label("+");
        Button button=new Button("=");
        button.addActionListener(new MyCalculatorActionListener(this));
        setLayout(new FlowLayout());//设置流水布局
        add(num1);
        add(label);
        add(num2);
        add(button);
        add(num3);
        pack();
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

}
class MyCalculatorActionListener implements ActionListener{
    Calculator calculator;//引入Calculator对象
        public MyCalculatorActionListener(Calculator calculator){//以Calculator为参数
            this.calculator=calculator;
        }
    @Override
    public void actionPerformed(ActionEvent e) {
         int n = Integer.parseInt(calculator.num1.getText());
         int m = Integer.parseInt(calculator.num2.getText());
        calculator.num3.setText(""+(n+m));
        calculator.num1.setText("");//计算出结果后将后边清零
        calculator.num2.setText("");
    }
}