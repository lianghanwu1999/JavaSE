package JavaSE.OneDay.数组;

public class Demo08 {
    //二维数组
    public static void main(String[] args) {
        //定义二维数组的方式
        //int [][] arr = new int [3][4];  //定义二维数组的定义和访问 方法1
        int[][] arr = {{1,2,4,5},{4,7,5,0},{0,9,3,6}};  //定义二维数组的定义和访问 方法2
        System.out.println(arr);
        System.out.println("二维数组长度:" + arr.length);
        //获取二维数组的3个元素
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        System.out.println("打印第一个一个数组的元素值:");
        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);
        System.out.println(arr[0][3]);

        System.out.println("打印第二个一维数组元素值:");
        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[1][2]);
        System.out.println(arr[1][3]);

        System.out.println("打印第三个一维数组元素值:");
        System.out.println(arr[2][0]);
        System.out.println(arr[2][1]);
        System.out.println(arr[2][2]);
        System.out.println(arr[2][3]);

    }
}
