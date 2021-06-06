package JavaSE.SevenDay.关键词.final关键词;


//final 修饰类
//final修饰类不可以被继承，但是可以继承其他类
//class Yy{}
//final class FU extends Yy{}  //可以继承其他类Yy类
////class Zi extends FU{}  //不能继承FU类:使用关键词final修饰了之后不能被继承。
//
//class FU{
//    //final 修饰方法，不可以被覆盖，但可以继承使用
//    public final void method1(){ }
//    public void method2(){}
//}
//class Zi extends FU{
//    //重写method2方法
//    public final void method2(){}
//}


//public class Demo01final修饰 {
////    final修饰的变量称为常量，这些变量只能赋值一次
//    final FU p = new FU();
//    FU p2 = new FU();
//    p = p2;  //final修饰的变量p，所记录的地址值不能改变
//    p.name = "小明"; //可以更改p对象中name属性值
    //p不能为别的对象，而p对象中的name或age属性值可更改。
//}
