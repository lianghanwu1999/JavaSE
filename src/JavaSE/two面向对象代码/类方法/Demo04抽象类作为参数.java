package JavaSE.EightDay.类方法;

//抽象类Person01
abstract class Person01{
    //抽象方法show
    public abstract void show();
}
//子类Student继承Person01类
class Student extends Person01{
    @Override   //重写show方法:将抽象方法覆盖长实例方法
    public void show() {
        System.out.println("重写了show方法");
    }
}

//测试类
public class Demo04抽象类作为参数 {
    public static void main(String[] args) {
        //通过多态的方式，创建一个Person类型变量。而这个对象实际是Student
        //Student从Person中继承
        Person01 p = new Student();
        //调用method方法
        method(p);
    }
    //定义一个方法method，用来接收一个Person类型的对象，
    // 在方法中调用Person对象的show方法
    public static void method(Person01 p){
        //通过p变量调用show方法，这时实际调用的是Student对象中的show方法
        p.show();
    }
}
