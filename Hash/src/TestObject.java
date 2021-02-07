import sun.awt.geom.AreaOp;

public class TestObject {
    public static void main(String[] args) {
        Person Person=new Person("董宇",18);
        String s = Person.toString();//s的地址这个和System.out.pritnln(Person)是一个结果
        System.out.println(s);
    }

}
