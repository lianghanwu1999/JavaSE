package 基础部分代码.运算符;

/*instanceof 运算符的使用:如果运算符左侧变量所指的对象，
是操作符右侧类或接口(class/interface)的一个对象，那么结果为真。
 */

class Vehicle{}

//Test运算符类 继承与Vehicle类
public class Test运算符 extends  Vehicle {
    //( 所指对象) instanceof  (类或接口)
    public static void main(String[] args) {
        Vehicle a = new Test运算符();
        boolean result = a instanceof Test运算符;
        //如果被比较的对象兼容于右侧类型(使用右侧的一个对象),该运算符仍然返回true。
        System.out.println( result );
    }
    //输出结果为True
}
