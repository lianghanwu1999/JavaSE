package JavaSE.NineDay.调用时间信息.Calendar类;

import java.util.Calendar;

public class Demo02设定日期 {
    public static void main(String[] args) {
        function();
    }
    public static void function(){
        Calendar c = Calendar.getInstance();
        //设置年，月，日
        c.set(2099,4,1);
        //设置，月份，设置到10月份
        c.set(Calendar.MONDAY,9);  //Calendar类是从0开始

        //获取年份
        int year = c.get(Calendar.YEAR);
        //获取月份
        int month = c.get(Calendar.MONDAY);
        //获取天数
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(year+"年"+month+"月"+day+"日");
    }
}
