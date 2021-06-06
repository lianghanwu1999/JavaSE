package JavaSE.EightDay.内部类;

//接口
interface Smoking{
    public abstract void smoking();
}

//实现类 ，实现接口，重写接口抽象方法，创建实现类对象
class smk implements Smoking{
    public void smoking(){
    }
}
//smk sm = new smk();
//sm.smoking();
//Smoking s =new smk();
//s.smoking();


public class Demo03匿名内部类 {
//    匿名内部类的本质是一个实现了接口或继承了某个类的子类匿名对象.
public static void main(String[] args) {
    //使用匿名内部类
    /*
     *  定义实现类,重写方法,创建实现类对象,一步搞定
     *  格式:
     *    new 接口或者父类(){
     *       重写抽象方法
     *    };
     *    从 new开始,到分号结束
     *    创建了接口的实现类的对象
     */
    new Smoking(){
        public void smoking(){
            System.out.println("人在吸烟");
        }
    }.smoking();   //调用方法

}

}
