package JavaSE.TenDay.System类;

public class Demo01计算程序执行时间 {
    //System类方法currentTimeMillis():用于计算程序的执行时间
    /*
     *  获取系统当前毫秒值:1000mn = 1m
     *  static long currentTimeMillis()
     *  对程序执行时间测试
     */
    public static void main(String[] args) {
        Function01();
        function_3();
    }
    public static void Function01(){
        //开始计算的时间
        long start = System.currentTimeMillis();//当前时间x-(系统初始时间)1970年1月1日零时零分零秒
        //要计算的打印程序
        for (int i = 0;i<10000;i++){
            System.out.println(i);
        }
        //程序执行结束时间
        long end = System.currentTimeMillis(); //当前时间y-(系统初始时间)1970年1月1日零时零分零秒
        System.out.println(end - start);//当前时间y-当前时间x
    }
//    System类方法getProperties(了解)
    /*
     *  获取当前操作系统的属性:例如操作系统名称,
     *  static Properties getProperties()
     */
    public static void function_3(){   //
        System.out.println( System.getProperties() );
    }
}
