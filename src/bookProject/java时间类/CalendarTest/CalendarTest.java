package bookProject.java时间类.CalendarTest;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class CalendarTest {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now(); // 构造日期对象
        int month = date.getMonthValue();  //获取当前月份
        int today = date.getDayOfMonth();  //获取当前日期

        date = date.minusDays(today-1);  //设置开始月份
        DayOfWeek weekday = date.getDayOfWeek();  //设置周
        int value = weekday.getValue();  //获取星期几数据，将其转换成数字，1 = monday ....

        //打印日历星期表
        System.out.println("Mon   Tue   Thu   Fri   Sat    Sun" );
        for (int i = 1; i <value ; i++) {
            System.out.print("   ");  //当value，超过星期数7，就换行
        }
        while (date.getMonthValue() == month)   // 判断是否为当前月份
        {
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == today)
            {
                System.out.print("*");
            }
            else
                System.out.print(" ");
            date = date.plusDays(1); //设置为开始天

            if (date.getDayOfWeek().getValue() ==1)
                System.out.println( );
        }
        if (date.getDayOfWeek().getValue() !=1)
            System.out.println( );
    }
}
