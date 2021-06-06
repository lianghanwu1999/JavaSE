package JavaSE.SevenDay.关键词.super关键词;

//class Student extends Person01 {
//    public Student(){
//        super();
//    }
//}

//public class Test{
//    public static void main(String[] args) {
//        //调用Zi方法
//        new Zi();
//    }
//}
class Fu{
    int num ;
    Fu(){
        System.out.println("Fu构造方法"+num);
        num = 4;
    }
}

class Zi extends Fu{
    Zi(){
        //super();调用父类参数构造方法
        System.out.println("Zi构造方法"+num);
    }
}


