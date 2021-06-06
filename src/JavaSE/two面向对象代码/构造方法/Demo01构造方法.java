package JavaSE.SevenDay.构造方法;

/*
构造方法的格式：
    修饰符 构造方法名(参数列表){

    }
构造方法同时给属性初始化
    在new的同时给成员变量赋值,给对象属性进行初始化。
    Person p = new Person("张三",23);在new 的时候给p对象的name属性和age属性进行赋值,使这个对象的属性有值。


 */
public class Demo01构造方法 {
    //Person的成员属性age和name
    private int age;
    private String name;

    //在new 对象的时候自动调用执行。
    //Person的构造方法，拥有参数列表
    Demo01构造方法(int a,String nm){
        //接收到创建对象时传递进来的值，将值赋给成员属性
        age = a;
        name = nm;
    }
}
