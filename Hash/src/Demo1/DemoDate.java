package Demo1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class DemoDate {
    public static void main(String[] args)  {//暂且理解为如果格式不同的话就抛出异常及是解析异常
        System.out.println(System.currentTimeMillis());
    DemoDate.dateDemo();
    DemoDate.dateDemo2();
        SimpleDateFormat slf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//此处是时间的格式
        Date date=new Date();//默认的系统时间
        //此处为将时间转化为给定格式的字符串
        final String text = slf.format(date);
        System.out.println(text);
        System.out.println(date);
        //此处为将给定的字符串时间转化为时间；
        Date date1=new Date();
        SimpleDateFormat slf1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        try {
            date1=slf1.parse("2077-01-01 00:00:00");
        } catch (ParseException e) {
            e.printStackTrace();//此处为try catch 打印错误栈信息说白了就是打印出这个时候的错误
        }
        
    }//如果与上边规定的格式不同就会抛出解析异常


    private static  void dateDemo(){
        Date date=new Date();//无参构造Date初始职位系统时间
        System.out.println(date);
    }
    private static void dateDemo2(){
        Date date=new Date(54654L);//带参构造的话就是距离1970年多少毫秒而后转化成年月日
        System.out.println(date);
        long x=date.getTime();//此处为获得毫秒数
        System.out.println(x);
        }
}