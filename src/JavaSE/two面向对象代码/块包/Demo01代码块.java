package JavaSE.EightDay.块包;

//程序中用大括号括起来的代码叫代码块
//局部代码块  构造代码块  静态代码块  同步代码块

//局部代码块
class Demo01{
    public static void main(String[] args) {  //程序中用大括号括起来的代码叫代码块
        {
            int x = 1;
            System.out.println("普通代码块"+x);
        }
        int x = 99;
        System.out.println("代码块之外" + x);
    }
}

//构造代码块
//构造代码块是定义在类中成员位置的代码块
/*
优先于构造方法执行，构造代码块用于执行所有对象均需要的初始化动作
		每创建一个对象均会执行一次构造代码块。

 */

class Person{
    private String name;
    private int age;

    //构造代码块
    {
        System.out.println("构造代码块执行了");
    }
    Person(){
        System.out.println("Person无参数的构造函数执行");
    }
    Person(int age){
        this.age = age;
        System.out.println("Person(age) 参数的构造函数执行");
    }
}

class PersonDemo{
    public static void main(String[] args) {
        Person p = new Person();
        Person p1 = new Person(23);
    }
}

/*
静态代码块
	静态代码块是定义在成员位置，使用static修饰的代码块。
 */

public class Demo01代码块 {
    private String name;
    private int age;

    //静态代码
    static {
        System.out.println("静态代码执行了");
    }
}
