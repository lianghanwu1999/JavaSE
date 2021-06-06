package JavaSE.SixDay.多态;

//描述动物类，并抽取共性eat方法
abstract class Animal{
    //抽象方法eat
    abstract void eat();
}

//描述狗类，继承动物类，重写eat方法，增加lookHook方法
class Dog extends Animal{
    //重写，将抽象变成现实
    void eat(){
        System.out.println("啃骨头");
    }
    void lookHome(){
        System.out.println("看家");
    }
}

//描述猫类，继承动物类，重写eat方法 ，增加catMouse方法
class Cat extends Animal{
    void eat(){
        System.out.println("吃鱼");
    }
    void catMouse(){
        System.out.println("抓老鼠");
    }
}

public class Demo02多态 {
    public static void main(String[] args) {
        //基于父类类型Animal，创建一个子类对象a
        Animal a = new Dog();  //多态形式，创建一个狗对象
        a.eat();   //调用对象中方法，会执行狗类中的eat方法
        // a.lookHome();//使用Dog类特有的方法，需要向下转型，不能直接使用

        //为了使用狗类的lookHome方法，需要向上转型
        //向下转型过程中，可能会发生类型转换的错误，即ClassCastException异常
        //那么，在转前需要健壮性判断
        if(!(a instanceof Dog)){  //判断当前对象是否Dog类型
            System.out.println("类型不匹配，不能转换");
            return;
        }
        Dog d = (Dog) a;  //向下转型 强制转换
        d.lookHome();   //调用狗类的lookHome方法
    }
}
