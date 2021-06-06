package JavaSE.SixDay.多态;

/*
多态的定义格式：
	* 就是父类的引用变量指向子类对象
		 父类类型  变量名 = new 子类类型();
		 变量名.方法名();
 */

/*
 普通类多态定义的格式
		父类 变量名 = new 子类();
 */
//父类Fu
class Fu{
    String name;
}
//子类继承父类Fu
class Zi extends Fu{
}
//类的多态使用
//Fu f = new Zi();




/*
抽象类多态定义格式
		抽象类 变量名 = new 抽象类子类();
 */
abstract class Fu01{
    public abstract void method();
}

class Zi01 extends Fu01{
    public void method(){
        System.out.println("重写父类抽象方法");
    }
}

//类的多态使用
//Fu01 fu = new Zi01();

/*
接口多态定义的格式
		接口 变量名 = new 接口实现类();
 */

interface Fu02{
    public abstract void method();
}

//class Zi02 implements Fu02 {
////    public void method(){
////        System.out.println("重写接口抽象方法");
////    }
//}
//接口的多态使用
//Fu02 fu = new Zi02();