package JavaSE.SevenDay.关键词.final关键词;

//被static修饰的成员变量属于类，不属于这个类的某个对象
//static静态对象
class Demo{
//    static //关键词:静态
    public static int num = 100;
}


public class Demo02关键词Static修饰数据 {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        d1.num = 200;
        //多个对象在访问或修改static修饰的成员变量时，其中一个对象将static成员变量值进行了修改，
        //其他对象中的static成员变量值跟着改变，即多个对象共享同一个static成员变量
        System.out.println(d1.num);  //结果为200
        System.out.println(d2.num);  //结果为200
    }
}
