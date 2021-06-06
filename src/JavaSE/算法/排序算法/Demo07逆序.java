package JavaSE.ThreeDay.排序算法;

public class Demo07逆序 {
    //数组中的元素,进行位置上的交换
    //逆序 不等于 反向遍历
    //就是数组中最远的两个索引(最大最少两个元素),进行位置交换,实现数组的逆序
    public static void main(String[] args) {
        int [] arr = {3,5,7,1,0,9,-2};
        //调用数组的逆序方法
        reverse(arr);
        //看到数组的元素，遍历
        printArray(arr);
    }
    /*
       定义方法,实现数组的逆序
       返回值: 没有返回值
       参数:   数组就是参数
	*/
    public static void reverse(int [] arr){
        //利用循环，实现数组遍历，遍历过程中，最远端换位
        //for的第一项，定义2个变量，最后，两个变量++ --;
        for(int min = 0,max = arr.length -1; min<max ;min++,max --){
            //对数组中的元素，进行位置交换
            //min索引和max索引的元素交换 (交换索引)
            //换值公式:引入外值变量a; a = b,b=c,c= a;
            //定义变量，保存min索引
            int temp = arr[min];
            //max索引上的元素，赋值给min索引
            arr[min] = arr[max];
            //临时变量，保存数据，赋值到max索引上
            arr[max] = temp;
        }
    }

    //打印数组元素
    public static void printArray(int [] arr){
        //输出一半中括号，不要换行打印
        System.out.println("[");
        //数组进行遍历
        for (int i = 0; i <arr.length;i++){
            //判断遍历到元素，是不是数组的最后一个元素
            //如何判断 循环变量 到达 length -1;
            if( i == arr.length -1){
                //输出数组的元素和
                System.out.print(arr[i]+"]");
            }else {
                //不是数组的最后一个元素，输出数组元素和逗号
                System.out.println(arr[i]+",");
            }
        }
        System.out.println();
    }


}
