package JavaSE.FiveDay.抽象类;

/*
1.抽象类和抽象方法都需要被abstract修饰，抽象方法一定要定义在抽象类中
2.抽象类不可以直接创建对象，原因:调用抽象方法没有意义。
3.只有覆盖了抽象类中所有的抽象方法后，其子类才可以创建对象，否则该子类还是抽象类
4.之所以继承抽象类，更多的是思想，是面对共性操作会更简单
 */

//抽象类
abstract class A {
    //抽象方法
    public abstract void func();
    public abstract void func2();
}

//子类A2 继承抽象类A
class A2 extends A{
    // A2把A中的两个抽象方法都重写掉了
    //A2类不在是抽象类
    public void func(){};
    public void func2(){};
}
abstract class A3 extends A {
    //含有抽象方法的类一定是抽象类
    public void func(){

    }
    //public abstract void func2();//func2相当于被继承下来
}


