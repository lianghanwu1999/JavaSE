package JavaSE.SixDay.接口;
/*
1.完成接口的定义
2.类转接口:使用子类来继承，然后重写接口的抽象方法，将方法变成实例可以调用。
 */
//定义一个名为Demo的接口
//接口是一些方法声明，相当于模板作用
interface Demo {
    //定义接口的抽象方法
    public abstract void show1();
    public abstract void show2();
}

//定义子类去覆盖接口中的方法，
// 类接口:类与接口之间的关系是 实现。通过 关键词 implements
abstract class DemoImpl implements Demo{
    //重写接口的方法
    //覆盖抽象方法，将其变成实例
    public void show1(){}
    public void show2(){}
}