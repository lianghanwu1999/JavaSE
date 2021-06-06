package JavaSE.NineDay.调用时间信息.Calendar类;

import java.util.Calendar;

public class Demo03计算偏移值 {
    public static void main(String[] args) {
        function01();
    }
    public static void function01(){
        /*
         * Calendar类方法add 日历的偏移量,
         * 可以指定一个日历中的字段,
         * 进行整数的偏移 add(int field, int value)
        */
        Calendar c= Calendar.getInstance();
        //让日历中天数，向后偏移280天
        //add(int field, int value(偏移量))
        c.add(Calendar.DAY_OF_MONTH,-280);  //将天数减280
        //获取年份
        int year = c.get(Calendar.YEAR);
        //获取月份
        int month = c.get(Calendar.MONDAY)+1;
        //获取天数
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(year+"年"+month+"月"+day+"日");
    }
}
