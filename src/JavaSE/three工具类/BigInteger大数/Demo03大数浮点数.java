package JavaSE.TenDay.BigInteger大数;

import java.math.BigDecimal;

public class Demo03大数浮点数 {
    public static void main(String[] args) {
        function_2();
    }
    /*
     *  BigDecimal实现三则运算
     *  + - *
     */
    public static void function_2(){
        BigDecimal b1 = new BigDecimal("0.09");
        BigDecimal b2 = new BigDecimal("0.01");
        //计算b1+b2的和 调用方法add
        BigDecimal bigAdd = b1.add(b2);
        System.out.println(bigAdd);

        BigDecimal b3 = new BigDecimal("1");
        BigDecimal b4 = new BigDecimal("0.32");
        //计算b3-b4 的差，调用方法subtract(b4)
        BigDecimal bigSub = b3.subtract(b4);
        System.out.println(bigSub);

        BigDecimal b5 = new BigDecimal("1.015");
        BigDecimal b6 = new BigDecimal("100");
        //计算b5*b6 的成绩，调用方法 multiply
        BigDecimal bigMUl = b5.multiply(b6);
        System.out.println(bigMUl);
    }

}
