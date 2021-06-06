package JavaSE.TenDay.Math类;

public class Demo02其他方法 {
    public static void main(String[] args) {
        function06();
        function07();
    }
    /*
     *  static double round(double d)
     *  获取参数的四舍五入,取整数
     */
    public static void function06(){
        //四舍五入:取值
        double d = Math.round(5.4195);
        System.out.println(d);
    }
    /*
     *  static double random() 返回随机数 0.0-1.0之间
     *  来源,也是Random类
     */
    public static void function07(){
        for (int i =0;i<10;i++){
            //Math中的随机数方法
            double d = Math.random();
            System.out.println(d);
        }
    }
}
