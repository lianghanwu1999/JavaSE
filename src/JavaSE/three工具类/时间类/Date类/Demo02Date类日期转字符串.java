package JavaSE.NineDay.调用时间信息.Date类;

import java.util.Date;
import java.util.Locale;
/* SimpleDateFormat调用方法format对日期进行格式化
         * public String format(Date date) 传递日期对象,返回字符串
        * 日期模式:
        * yyyy    年份
        * MM      月份
        * dd      月中的天数
        * HH       0-23小时
        * mm      小时中的分钟
        * ss      秒
        * yyyy年MM月dd日 HH点mm分钟ss秒  汉字修改,: -  字母表示的每个字段不可以随便写
        * */
public class Demo02Date类日期转字符串 {
    public static void main(String[] args) {
        Date date = new Date();
//        使用printf格式化日期
        //b使用，月份简称
        String str = String.format(Locale.US,"英文日份简称:%tb",date);
        System.out.println(str);
        System.out.printf("本地月份简称:%tb%n",date);
        //B的使用，月份全称
        str = String.format(Locale.US,"英文月份全称:%tB",date);
        System.out.println(str);
        System.out.printf("本月份全称:%tB%n",date);
        //a的使用，星期全称
        str = String.format(Locale.US,"英文星期的简称:%ta",date);
        System.out.println(str);
        //A的使用，星期全称
        System.out.printf("本地星期的简称:%tA%n",date);
        //C的使用，年前两位
        System.out.printf("年的前两位数字(不足两位前面补0):%tC%n",date);
        //y的使用，年后两位
        System.out.printf("年的后两位数字（不足两位前面补0）：%ty%n",date);
        //j的使用。一年的天数
        System.out.printf("一年中的天数（即年的第几天）：%tj%n",date);
        //m的使用，月份
        System.out.printf("两位数字的月份（不足两位前面补0）：%tm%n",date);
        //d的使用，日(两位，不够补零)
        System.out.printf("两位数字的日（不足两位前面补0）：%td%n",date);
        //e的使用，日(一位不补零)
        System.out.printf("月份的日（前面不补0）：%te",date);

    }
}
