package JavaSE.OneDay.数组;

import java.util.Random;

public class Demo12 {
    //随机点名器
    /*
     随机点名器:
​	     1  存储姓名
​		 2. 预览所有人的姓名
​		 3. 随机出一个人的姓名
     */

    public static void main(String[] args) {
        //存储姓名，存储到数组中
        //数组存储姓名，姓名的数据类型，String
        String [] names = {"张三","李四","王五","李蕾","韩梅梅",
                "小明","老王","约翰逊","爱丽丝"};
//        //预览:遍历数组，打印所有人姓名
//        for(int i =0;i< names.length;i++){
//            System.out.println(names[i]);  //遍历索引，一个个数组元素打印出来
//        }
        System.out.println("=============");
        //随机出一个人名
        //利用随机生成数，生成一个整数，作为索引，到数组中找到对应的元素
        Random ran = new Random();
        //随机数，范围必须是0-数组最大索引
        int index = ran.nextInt(names.length); //index 就是随机数，作为索引
        System.out.println(names[index]);

        //代码优化:
        //System.out.println(names[new Random().nextInt(names.length)]);
    }
}
