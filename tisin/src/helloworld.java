import java.util.Scanner;
public class helloworld{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入第一个数");
        int a=scan.nextInt();
        System.out.println("请输入第二个数");
        int a1=scan.nextInt();
        System.out.println("请输入第三个数");
        int a2=scan.nextInt();
        if(a>a1){
            if (a1>a2){
                System.out.println(a+","+a1+","+a2);
            }
            else if(a2>a){
                System.out.println(a2+","+a+","+a1);
            }
            else{
                System.out.println(a+","+a2+","+a1);
            }
        }
        else if(a2>a1){
            System.out.println(a2+","+a1+","+a);
        }
        else if(a2<a){
            System.out.println(a1+","+a+","+a2);
        }
        else{
            System.out.println(a1+","+a2+","+a);
        }
    }
}