package JavaSE.SevenDay.构造方法;

//构造方法:自己按照构造方法的规则。书写自己的方法

public class Demo03构造重载 {
    private int age;
    private String name;

    //私有无参数的构造方法，即外界不能通过new Person();语句创建本类对象
    private Demo03构造重载(){
    }

    //多个构造方法是以重载形式存在
    //重载01
    Demo03构造重载(int a){
        age = a;
    }

    //重载02
    Demo03构造重载(String nm,int a){
        name = nm;
        age = a;
    }
}
