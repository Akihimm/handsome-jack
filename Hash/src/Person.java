public class Person {
    String name;
    int age;
    public Person(){

    }
    public Person(String name, int age){
        this.age=age;
        this.name=name;

    }
//此处是Alt+insert其中有一个toString 来自动重写这个方法
    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
//此处是equals及类equals 的重写
    @Override
    public boolean equals(Object obj) {
        Person person=(Person) obj;
        boolean b =this.name.equals(person.name)&&this.age==person.age;
        return b;
    }
}

