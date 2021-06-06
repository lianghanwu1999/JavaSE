package JavaSE.ThirteenDay;
//子类覆盖父类方法时，如果父类的方法声明异常，子类只能声明父类异常或者该异常的子类，或者不声明。
public class Demo02方法重写异常处理 {
    public void method () throws RuntimeException{

    }
}

class Zi extends Demo02方法重写异常处理{
    public void method() throws RuntimeException{ }//抛出父类一样的异常
//    public void method() throws NullPointerException{ }//抛出父类子异常
}

class Fu01{
    public void method () throws NullPointerException,ClassCastException{

    }
}
class Zi01 extends Fu01{
//    public void method() throws NullPointerException,ClassCastException{ };
//    public void method() throws NullPointerException{ };  //抛出父类异常中的一部分
    public void method() throws ClassCastException{ }     //抛出父类异常中的一部分
}


