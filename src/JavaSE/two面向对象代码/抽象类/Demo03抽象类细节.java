package JavaSE.FiveDay.抽象类;

/*
 *   抽象类,可以没有抽象方法,可以定义带有方法体的方法
 *   让子类继承后,可以直接使用
 */
//抽象类
abstract class Animal{
//    抽象类,可以没有抽象方法,可以定义带有方法体的方法
    public void sleep(){
        System.out.println("动物睡觉");
    }
}
//子类Cat 完全继承 Animal方法
class Cat extends Animal{
    //完全继承Animal类的public公开方法
}

public class Demo03抽象类细节 {
    public static void main(String[] args) {
        //Cat 完全继承Animal的公开方法
        //Cat c = new Cat();
        new Cat().sleep();   //不改创建对象，方法可以直接让子类去使用
    }
}
