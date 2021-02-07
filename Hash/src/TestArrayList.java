import java.util.*;
public class TestArrayList {
    public static void main(String[] args) {
        Random random=new Random();
        ArrayList<Integer> arrayList=new ArrayList();
        for (int i = 0; i < 6; i++) {
            int num= random.nextInt(32);
            arrayList.add(num+1);//添加元素
        }
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));//此处为遍历集合
        }
        //这里是将类作为了集合中的元素
        ArrayList<Animals> List=new ArrayList<>();
        Animals one=new Animals(12,"狗");
        Animals two=new Animals(13,"羊");
        Animals three=new Animals(14,"鸡");
        Animals four=new Animals(15,"鸭");
        List.add(one);
        List.add(two);
        List.add(three);
        List.add(four);
        //运用这个来输出年龄和类别也可以直接用重新定义的toString来输出
        for (Animals Ani : List) {
            System.out.println("这个动物是" + Ani.getName() + "年龄是" + Ani.getAge());
        }
        Nb(List);//调用方法Nb参数为List

    }
    //此处为输出{name+@}的方法其参数是ArrayList
    public static void Nb(ArrayList<Animals> arrayList){
        System.out.print("{");
        for (int i = 0; i < arrayList.size(); i++) {
            Animals anis=arrayList.get(i);
            if(i< arrayList.size()-1){
                System.out.print(anis.getName()+"@");
            }
            else if (i== arrayList.size()-1){
                System.out.print(anis.getName()+"}");
            }
        }
    }
}
