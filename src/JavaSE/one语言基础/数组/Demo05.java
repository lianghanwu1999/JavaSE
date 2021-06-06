package JavaSE.OneDay.数组;

public class Demo05 {
    //数组长度
    public static void main(String[] args) {
        //java 每一种类型都可以看作一种的变量类型
        int[] arr ; //声明arr变量 该变量的类型为int[]
        arr = new int[3] ; //创建数组对象
        System.out.println("arr[0]=" + arr[0]);  //访问数组中的第一个元素
        System.out.println("arr[1]=" + arr[1]);  //访问数组中的第二个元素
        System.out.println("arr[2]=" + arr[2]);  //访问数组中的第二个元素
        System.out.println("数组的长度是:" + arr.length);  //打印数组长度
    }
}
