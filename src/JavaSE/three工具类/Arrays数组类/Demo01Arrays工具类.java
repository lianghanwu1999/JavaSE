package JavaSE.TenDay.Arrays数组类;

import java.util.Arrays;

public class Demo01Arrays工具类 {
    public static void main(String[] args) {
        //将数组转化为字符串
        function_01();
        //查找元素在数组中的位置
        function_02();
        //对数组进行升序
        function_03();
        int [] arr = {56,65,11,98,57,43,16,18,100,200};
        int [] newArray = test(arr);
        //toString方法 :十进制表示
        System.out.println(Arrays.toString(newArray));
    }
    /*
     *  定义方法,接收输入,存储的是10个人考试成绩
     *  将最后三个人的成绩,存储到新的数组中,返回新的数组
     */
    public static int [] test(int [] arr){  //返回int 数组类型
        //对数组排序
        Arrays.sort(arr);
        //将最后三个成绩存储到新的数组中
        int [] result = new int [3];
        //成绩数组的最后三个元素，复制到新数组中
        //将src数组的0位置开始(包含1位置)的1个元素，拷贝到result的0,3位置上
//        System.arraycopy(arr,0,result,0,3);
        for (int i = 0; i<3;i++){
            result[i] = arr[i];
        }
        return result;
    }
    /*
     *  static String toString(数组)
     *  将数组变成字符串
     */
    public static void function_01(){
        int [] arr = {5,1,4,6,8,9,0};
        //将数组变成字符串toString(arr)
        String s = Arrays.toString(arr);
        System.out.println(s);
    }
    /*
     *  static int binarySearch(数组, 被查找的元素)
     *  数组的二分搜索法
     *  返回元素在数组中出现的索引
     *  元素不存在, 返回的是  (-插入点-1)
     */
    //查找数组元素
    public static void function_02(){
        int [] arr = {1,4,7,9,11,15,18};
        //binarySearch(数组, 被查找的元素)
        int index = Arrays.binarySearch(arr,10);
        System.out.println(index);
    }

    /*
     *  static void sort(数组)
     *  对数组升序排列
     */
    public static void function_03(){
        int [] arr = {5,1,4,6,8,9,0};
        //对数组元素进行升序排序
        Arrays.sort(arr);
        //遍历打印数组元素
        for (int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }



}
