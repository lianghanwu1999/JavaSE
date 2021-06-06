package JavaSE.TenDay.Math类;

public class Demo01基本求值 {
    public static void main(String[] args) {
        function01();
        function02();
        function03();
        function04();
        function05();
    }
    /*
     * static double sqrt(double d)
     * 返回参数的平方根
     */
    public static void function01(){
        //返回平方根d
        double d = Math.sqrt(2);
        System.out.print("平方根:");
        System.out.println(d);
    }
    /*
     * static double pow(double a, double b)
     * a的b次方
     */
    //次方
    public static void function02(){
        //返回值是，2的3次方
        double d = Math.pow(2,3);
        System.out.print("2的3次方:");
        System.out.println(d);
    }
    /*
     * static double floor(double d)
     * 返回小于或者等于参数d的最大整数
     */
    public static void function03(){
        double d = Math.floor(1.5);
        System.out.print("最大整数:");
        System.out.println(d);   //最大整数 1.0
    }

    /*
     *  static double ceil(double d)
     *  返回大于或者等于参数d的最小整数
     */
    public static void function04(){
        double d = Math.ceil(5.1);   //最少整数6.0
        System.out.print("最小整数:");
        System.out.println(d);
    }

    /*
     *  static int abs(int i)
     *  获取参数的绝对值
     */
    public static void function05(){
        //返回值0的绝对值
        int i = Math.abs(0);
        System.out.print("绝对值:");
        System.out.println(i);
    }
}
