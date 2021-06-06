package JavaSE.EightDay.类方法;

//接口
interface Smoke{
    //定义抽象方法
    public abstract void smoking();
}

class Student03 implements Smoke{
    @Override
    public void smoking() {
        System.out.println("下课吸口烟");
    }
}

public class Demo06接口作为方法参数 {
    public static void main(String[] args) {
        //通过多态的方式，创建一个Smoke类型的变量，而这个对象实际是Student
        Smoke s = new Student03();
        //调用method方法
        method(s);
    }
    //定义一个方法method，用来接收一个Smoke类型对象，在方法中调用Smoke对象的show方法
    public static void method(Smoke sm){
        //通过sm变量调用smoking方法，这时实际上调用Student中的smoking方法
        sm.smoking();
    }
}
