package JavaSE.ThreeDay.循环算法;

public class Demo06遍历 {
    public static void main(String[] args) {
        int [] arr1 = {11,44,55,33,66};
        printArray (arr1);

        int [] arr2 = {22,88,99,33,66};
        printArray(arr2);
    }
    /*
    定义方法,实现功能
       返回值: void
       方法参数: 数组
     */
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
