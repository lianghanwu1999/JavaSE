package JavaSE.ThreeDay.排序算法;

public class Demo09冒泡排序 {
    /*
      数组的排序: 一般都是升序排列,元素,小到大的排列

      两种排序的方式
         选择排序: 数组的每个元素都进行比较
         冒泡排序: 数组中相邻元素进行比较
         规则: 比较大小,位置交换
	*/
    public static void main(String[] args) {
        int [] arr = {3,1,4,2,56,7,0};
        //调用选择排序方法
//        selectSort(arr);
        //选择冒泡排序方法
        bubbleSort(arr);
        //打印数组元素
        printArray(arr);
    }

    public static void bubbleSort(int []arr){
        for (int i =0; i<arr.length-1;i++){   //外循环打印循环次数
            for(int j = 0;j <arr.length-i-1;j++){  //遍历推进完成相邻元素值比较
                //比较的索引，是j和j+1;
                if(arr[j] >arr[j+1]){  //和相邻元素进行比较
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
    }
    public static void printArray(int[] arr){
        //输出一半中括号,不要换行打印
        System.out.print("[");
        //数组进行遍历
        for(int i = 0 ; i < arr.length ; i++){
            //判断遍历到的元素,是不是数组的最后一个元素
            //如何判断 循环变量 到达 length-1
            if( i == arr.length-1 ){
                //输出数组的元素和]
                System.out.print(arr[i]+"]");
            }else{
                //不是数组的最后一个元素,输出数组元素和逗号
                System.out.print(arr[i]+",");
            }
        }
        System.out.println();
    }

}
