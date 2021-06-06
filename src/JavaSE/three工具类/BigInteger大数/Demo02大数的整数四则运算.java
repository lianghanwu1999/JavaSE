package JavaSE.TenDay.BigInteger大数;

import java.math.BigInteger;

public class Demo02大数的整数四则运算 {
    public static void main(String[] args) {
        function_1();
    }
    public static void function_1(){
        BigInteger b1 = new BigInteger("52233223321455322214122333");
        BigInteger b2 = new BigInteger("23552222225331313232315625");

        //计算b1 + b2 对象是和，调用方法add
        BigInteger bigAdd = b1.add(b2);  //b1+b2
        System.out.println(bigAdd);

        //计算b1 - b2 对象的差，调用方法subtract
        BigInteger bigSub = b1.subtract(b2);  //b1-b2
        System.out.println(bigSub);

        //计算b1*b2 对象的乘积，调用方法multiply
        BigInteger bigMul = b1.multiply(b2);   //b1*b2
        System.out.println(bigMul);

        //计算b2/b1 对象的商，调用方法divide
        BigInteger bigDiv = b2.divide(b1);
        System.out.println(bigDiv);
    }
}
