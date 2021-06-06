package JavaSE.SixDay.接口;

interface Fu1{
    void show1();
}
interface Fu2{
    void show2();
}

//一个接口子类 可以同时实现多个接口
class Zi implements Fu1,Fu2{
    //重写抽象方法，覆盖原抽象方法，将其可以变实例被调用。
    public void show1(){}
    public void show2(){}
}
