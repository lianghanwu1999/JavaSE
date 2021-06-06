package JavaSE.NineDay.调用时间信息.Calendar类;

import java.util.Calendar;

public class Demo01设定时间 {
    /* Calendar类写了静态方法 getInstance() 直接返回了子类的对象
		* 不需要直接new子类的对象,通过静态方法直接获取
		* 成员方法
        * getTime() 把日历对象,转成Date日期对象
        * get(日历字段) 获取指定日历字段的值
		* Calendar c = Calendar.getInstance();
		// 获取年份
		int year = c.get(Calendar.YEAR);
		// 获取月份:这个值的初始值为0，所以我们用它来表示日历月份时需要加1
		int month = c.get(Calendar.MONTH) + 1;
		// 获取天数
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(year + "年" + month + "月" + day + "日");
	*/
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance().getInstance();
        //获取年份
        int year = c.get(Calendar.YEAR);
        //获取月份
        int month = c.get(Calendar.MONDAY)+1;
        //获取天数
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(year+"年"+month+"月"+day+"日");

    }
}
