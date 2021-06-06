package JavaSE.EightDay.类方法;

//在编写程序中，会经常碰到调用的方法要接收的是一个类类型的情况，
// 那么这时，要向方法中传入该类的对象
class Person{
    public void show(){
        System.out.println("show方法执行了");
    }
}


public class Demo03类作为方法参数 {
    public static void main(String[] args) {
        //创建Person对象
        Person p = new Person();
        //调用method方法
        method(p);
    }
    //定义一个方法method，用来接收一个Person对象，在方法中调用Person对象的show方法
    //把类作为方法的参数
    public static void method(Person p){
        p.show();
    }
}
