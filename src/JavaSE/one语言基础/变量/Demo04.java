package JavaSE.OneDay.变量;

import java.util.Random;
import java.util.Scanner;

public class Demo04 {
    //猜字游戏:随机数，循环，分支语句的实际
    public static void main(String[] args) {
        //1.产生随机数
        //后台产生一个随机数，范围1-100; 用户键盘录入
        //创建随机数对象
        Random ran = new Random();
        //产生一个随机数
        int randomNumber = ran.nextInt(100) +1;  //包括100在内

        //引用类型；调用控制台录入的Scanner对象
        Scanner sc = new Scanner(System.in);
        //3.通过for循环完成用户猜数环节
        //i 是循环次数，就是游戏可以完几次
        for (int i = 1; i<=5; i++){
            System.out.println();  //循环打印
            System.out.println("请你输入一个1-100的数:");
            //接收输入的数
            int gNumber = sc.nextInt();

            //2、通过if语句对用户猜的数与随机数进行比较
            //如果猜对了
            if(gNumber == randomNumber){
                //提示：用户结果
                System.out.println("恭喜你，猜对了！");
                //游戏结束:跳出循环
                break;
            }else {
                //如果猜大了
                if(gNumber>randomNumber){
                    System.out.println("Sorry.您猜大了!");
                }else {
                    //如果猜小了
                    System.out.println("Sorry.你猜小了!");
                }
            }
            //如果猜到了最后的第5次仍然没有猜对就跳出循环
            if(i == 5){
                System.out.println("对不起，点太背，下次再来吧！");
                break;
            }
            //每次猜错后，都提示还有多少次机会
            //java是使用+号在 I/O函数中调用变量值
            System.out.println("请注意，你还有"+(5-i)+"次机会.请谨慎作答！");
        }
    }
}
