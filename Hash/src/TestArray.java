public class TestArray {
    public static void main(String[] args) {
        Animals[] array=new Animals[3];
        System.out.println(array[0]);
        Animals dog=new Animals(12,"狗");
        Animals pig=new Animals(11, "猪");
        Animals duck=new Animals(10,"鸭子");
        array[0]=dog;//此处是将地址值赋值到数组中0的位置
        array[1]=pig;
        array[2]=duck;
    }
}
