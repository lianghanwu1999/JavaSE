package JavaSE.SixDay.接口;

class Fu02 {
    public void show(){}
}
interface Inter{
    //接口实现抽象方法
    public void show1();
}

//子类Zi02即继承Fu02同时又 实现接口Inter
class Zi02 extends Fu02 implements Inter{
    public void show1(){
    }
}
