package JavaSE.NineDay.正则;
//split() 通过指定分隔符对字符串进行切片

public class Demo02正则切割 {
    public static void main(String[] args) {
        split_1();
        split_2();
        split_3();
    }
    /*
     * String类方法split对字符串进行切割
     * 192.168.105.27 按照.点切割字符串
     */
    public static void split_3(){
        String ip = "192.168.105.27";
        String[] strArr = ip.split("\\.");
        System.out.println("数组的长度"+strArr.length);
        for(int i = 0; i<strArr.length;i++){
            System.out.println(strArr[i]);
        }
    }
    /*
     * String类方法split对字符串进行切割
     * 18 22 40 65 按照空格切割字符串
     */
    public static void split_2(){
        String str = " 18   22   40    65";
        String[] strArr = str.split(" +");
        System.out.println("数组的长度"+strArr.length);
        for (int i = 0;i<strArr.length;i++){
            System.out.println(strArr[i]);
        }
    }
    /*
     *  String类方法split对字符串进行切割
     *  12-25-36-98  按照-对字符串进行切割
     */
    public static void split_1(){
        String str = "12-25-36-98";
        //按照-对字符串进行切割，String类方法split
        String[] strArr = str.split("-");
        System.out.println("数组的长度"+strArr.length);
        for (int i = 0;i<strArr.length;i++){
            System.out.println(strArr[i]);
        }
    }
}
