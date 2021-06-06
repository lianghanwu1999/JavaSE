package JavaSE.FiveDay.继承;

class Fu02{
    //上千行代码
    //Fu类中的方法最先存在,那么如果项目需求变了,该方法
    //功能不能够满足我们的需求,此时我们也不会去改这个方法
    //因为项目中可能有大量的功能已经使用到该方法,如果随意修改可能使调用该方法的功能出现问题
    //所以使用重写方式基于原有功能提供更强的功能
    public void show(){
    }
}
//子类Zi02
class Zi02 extends Fu02{
    //子类复写父类的show方法
    //使用子类同名方法，去覆盖父类方法 -- 重写父类方法
    public void show(){
        System.out.println("Zi02 show");
    }
}


public class Demo04子类重写父类 {
    public static void main(String[] args) {
        Zi02 z = new Zi02();
        z.show();   //Zi show 子类有直接使用子类
    }
 }
