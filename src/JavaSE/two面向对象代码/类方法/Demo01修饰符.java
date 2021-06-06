package JavaSE.EightDay.类方法;
/*
 常用来修饰类、方法、变量的修饰符如下：
		public 权限修饰符，公共访问, 类,方法,成员变量
		protected 权限修饰符，受保护访问, 方法,成员变量
		默认什么也不写 也是一种权限修饰符，默认访问, 类,方法,成员变量
		private 权限修饰符，私有访问, 方法,成员变量
		static 静态修饰符  方法,成员变量
		final 最终修饰符   类,方法,成员变量,局部变量
		abstract 抽象修饰符  类 ,方法
 */

public class Demo01修饰符 {
    public class Demo{}  //最常用方式:公开访问
    class Demo02{}
//    public final class Demo03;  //最终修饰符，表示最后，只能修饰一次
    public abstract class Demo04{}

    //修饰成员变量
    public int count = 100;
    protected int count2 = 100;
    int count3 =100;
    private int count4 = 100;
    public final int count5 = 100;
    public static int count6 =100;

    //修饰成员方法能够使用修饰符
    public void method1(){}  //最常用方式
    protected void method2(){}  //保护
    void method3(){}    //无修饰符。默认访问
    private void method4(){} //私有，只有本类访问
    public final void method5(){}  //公有最终模式:最终状态，不可以继承
    public static void method6(){} //最常用方式
//    public abstract void method7();//最常用方式 接口方法

}
