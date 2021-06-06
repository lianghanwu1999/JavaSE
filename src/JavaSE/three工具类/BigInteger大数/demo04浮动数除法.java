package JavaSE.TenDay.BigInteger大数;

import java.math.BigDecimal;

public class demo04浮动数除法 {
    public static void main(String[] args) {
        function_4();
    }
    /*
     * BigDecimal实现除法运算
     * divide(BigDecimal divisor, int scale, int roundingMode)
     * int scale : 保留几位小数
     * int roundingMode : 保留模式
     * 保留模式 阅读API文档
     *   static int ROUND_UP  向上+1
     *   static int ROUND_DOWN 直接舍去
     *   static int ROUND_HALF_UP  >= 0.5 向上+1
     *   static int ROUND_HALF_DOWN   > 0.5 向上+1 ,否则直接舍去
     */

    public static void function_4(){
        BigDecimal b1 = new BigDecimal("1.0301");
        BigDecimal b2 = new BigDecimal("100");
        //计算b1/b2的商,调用方法divide
        BigDecimal bigDiv = b1.divide(b2,2,BigDecimal.ROUND_HALF_UP);
        System.out.println(bigDiv);

    }
}
