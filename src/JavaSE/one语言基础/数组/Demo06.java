package JavaSE.OneDay.数组;

public class Demo06 {
    //数组异常
    public static void main(String[] args) {
        //数组的索引越界异常
        int[] arr = {5,2,1};
        //数组中3个元素，索引 0,1,2
//        System.out.println(arr[3]);  //数组索引越界。报错:java.lang.ArrayIndexOutOfBoundsException: 3

        //空字符异常
        int[] arr2 = {1,5,8};
        System.out.println(arr2[2]);
        arr2 = null;  //arr2 不在保存数组地址
        System.out.println(arr2[2]); //数组名为空 :java.lang.NullPointerException
    }
}
