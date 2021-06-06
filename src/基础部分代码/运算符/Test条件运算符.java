package 基础部分代码.运算符;

public class Test条件运算符 {
    public static void main(String[] args) {
        int a,b;
        a= 10;
        //如果a等于1成立，则设置b为20，否则为20；
        b=(a==1) ? 20:30;
        System.out.println("Value of b is:" +b);
        //如果啊等于10成立，则设置为20，否则为30；
        b=(a==10) ?20:30;
        System.out.println("Value of b is:" +b);
    }
}
