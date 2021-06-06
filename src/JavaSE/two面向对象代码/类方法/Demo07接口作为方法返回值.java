package JavaSE.EightDay.类方法;

//接口
interface Smoke05{
    //抽象方法
    public abstract void smoking();
}
//Student05继承并调用接口Smoke05
class Student05 implements Smoke05{
    //重写smoking方法
    @Override
    public void smoking() {
        System.out.println("下课吸口烟");
    }
}

public class Demo07接口作为方法返回值 {
    public static void main(String[] args) {
        //调用method方法，获取返回值的会吸烟对象
        Smoke05 s =  method();
        //通过调用变量s调用smoking方法，这时实际调用的是Student对象smoking方法
        s.smoking();
    }
    //定义一个方法method，用来获取一个具备吸烟功能的对象，并在方法中完成吸烟者的创建
    public static Smoke05 method(){
        //多态将将重父类继承相关方法特性，创建对象接收
        Smoke05 ll = new Student05();
        //将接收的的值返回
        return ll;

    }
}
