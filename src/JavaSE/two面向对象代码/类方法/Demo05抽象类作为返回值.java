package JavaSE.EightDay.类方法;

//抽象类作为方法返回值的情况，也是有的，
// 这时需要返回一个实现抽象类所有抽象方法的子类对象
//抽象类
abstract class Person02{
    public abstract void show();
}
class Student02 extends Person02{
    @Override
    public void show() {
        System.out.println("重写了show方法！");
    }
}

//测试类
public class Demo05抽象类作为返回值 {
    public static void main(String[] args) {
        //调用method方法，获取返回的Person对象
        Person02 p = method(); //method的返回值作为Person对象
        //通过p变量调用show方法，这时实际调用的是Student对象中的show方法
        p.show();
    }
    //定义一个方法method，用来获取一个Person对象，在方法中完成Person对象的创建
    public static Person02 method(){
        //将变量p作为返回值返回作为Person对象
        Person02 p = new Student02();
        return p;
    }
}
