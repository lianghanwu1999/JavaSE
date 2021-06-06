package JavaSE.SevenDay.构造方法;

class Person {
    //Person 的成员属性age和 name
    private int age;
    private String name;

    //Person 的构造方法 拥有参数列表
    Person(int a, String nm){
        //接收到创建对象时传递进来的值，将值赋给成员属性
        age = a;
        name = nm;
    }
    public void speak(){
        System.out.println("name = " + name +",name ="+age);
    }
}


public class Demo02构造调用 {
    public static void main(String[] args) {
        //创建Person 对象，并明确对象的年龄和姓名
        Person p2 = new Person(23,"张三");
        p2.speak();
    }
}
