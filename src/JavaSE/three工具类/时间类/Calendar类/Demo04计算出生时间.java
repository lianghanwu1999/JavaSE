package JavaSE.NineDay.调用时间信息.Calendar类;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Demo04计算出生时间 {

//    private static function02 Exception;

    public static void main(String[] args) {
        try {
            function02();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
    /*
     *  计算活了多少天
     *   生日  今天的日期
     *   两个日期变成毫秒值,减法
     */
    public static void function02()throws Exception {
        System.out.println("请输入出生日期 格式 YYYY-MM-dd");
        //获取出生日期，键盘输入:获取整数字段
        String birthdayString = new Scanner(System.in).next();
        //将字符串日期，转成Date对象
        //创建SimpleDateFormat对象，写日期模式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //调用方法parse，字符串转成日期对象
        Date birthdayDate = sdf.parse(birthdayString);

        //获取今天的日期对象
        Date todayDate = new Date();

        //将两个日期转成毫秒值，Date类的方法getTime
        long birthdaySecond = birthdayDate.getTime();
        long todaySecond = todayDate.getTime();
        long second = todaySecond-birthdaySecond;

        if (second < 0){
            System.out.println("还没出生呢");
        }
        else {
            System.out.println(second/1000/60/60/24);
        }
    }
}
