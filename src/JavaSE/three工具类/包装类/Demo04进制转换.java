package JavaSE.TenDay.包装类;

public class Demo04进制转换 {
    public static void main(String[] args) {
        function03();
        function04();
    }
    /*
     * Integer类的3个静态方法
     * 做进制的转换
     * 十进制转成二进制  toBinarString(int)
     * 十进制转成八进制  toOctalString(int)
     * 十进制转成十六进制 toHexString(int)
     * 三个方法,返回值都是以String形式出现
     */
    public static void function03(){
        //十进制转成二进制  toBinaryString(int)
        System.out.println(Integer.toBinaryString(99));
        //十进制转成八进制  toOctalString(int)
        System.out.println(Integer.toOctalString(99));
        //十进制转成十六进制 toHexString(int)
        System.out.println(Integer.toHexString(99));
    }
    //获取int的最大值和最小值
    /*
     *   Integer类的静态成员变量
     *   MAX_VALUE
     *   MIN_VALUE
     */
    public static void function04(){
        //获取最大值
        System.out.println(Integer.MAX_VALUE);
        //获取最小值
        System.out.println(Integer.MIN_VALUE);
    }

}
