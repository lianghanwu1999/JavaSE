package JavaSE.NineDay.调用时间信息.Calendar类;

import java.util.Calendar;

public class Demo05计算闰年 {
    public static void main(String[] args) {
        Fuction03();
    }
    public static void Fuction03(){
        Calendar c = Calendar.getInstance();
        //将日历，设置为指定年的3月1日
        c.set( 2088,2,1);
        //日历add方法，向前偏移1天
        c.add(Calendar.DAY_OF_MONTH,-1);
        //get方法获取天数
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
    }
}
