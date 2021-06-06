package JavaSE.OneDay.变量;

import java.util.Random;

public class Demo03 {
    //随机数使用Random
    /*
    调用方法:
        nextDouble()  //产生[0.1)范围的随机数
        如: Random(变量类型) 变量名  = new Random();
            Random random = new Random();
            //使用myNumber 接收random生成的随机数
                int myNumber = random.nextDouble();//结果为0.0-1.0之间的数(包括0.0不包括1.0)
     */
    public static void main(String[] args) {
        //java 每一种类型都可以看作一种的变量类型
        //理解:变量方法：在变量类型Random 中New(新建)一个变量。
        Random ran = new Random();  //Random 产生随机数
        //使用一个变量接收Random返回值产生的数:随机数范围：1-99
        int i = ran.nextInt(100);
        System.out.println(i);
    }
}

