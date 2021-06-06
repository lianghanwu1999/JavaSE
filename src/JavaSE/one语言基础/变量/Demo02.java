package JavaSE.OneDay.变量;

import java.util.Scanner;   //自动调包

public class Demo02 {
    //Scanner类的使用:引用数据类型
    public static void main(String[] args) {
        //引用数据类型的格式：
        //数据类型 变量名 = new 数据类型()
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入的整数行为");   //提示
        //引用数据类型的使用:变量名. 方法名();   调用相应方法 :nextInt输入一个整数字符
        int enterNumber = sc.nextInt();
        System.out.println("用户输入的整数行为"+enterNumber);

        //.next()  输入一段字符串
        System.out.println("请输入的字符串行为"); //提示
        String enterString = sc.next();
        System.out.println("用户输入的字符串为：" +enterString);
    }
}
