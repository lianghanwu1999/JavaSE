package JavaSE.TenDay.BigInteger大数;

import java.math.BigInteger;

public class Demo01大数 {
    //大数:如果整数和浮点数的精度都不能满足要求，可以使用大数
    //大数可以处理任意长度是数字序列的数值
    public static void main(String[] args) {
        function_001();
    }
    /*
     * BigInteger类的构造方法
     * 传递字符串,要求数字格式,没有长度限制
     */
    public static void function_001(){
        BigInteger b = new BigInteger("85521522212615323431232323123134313133");
        System.out.println(b);
        BigInteger b1 = new BigInteger("5662253355631442585232122258441123333");
        System.out.println(b1);

    }

}
