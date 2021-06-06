package JavaSE.OneDay.数组;

public class Demo07 {
    //数组最值
    //定义数组的第一个元素arr[0]为最大值;循环arr数组,
    //判断如果有比arr[0] 大的就交换,直到arr数组遍历完毕,那么arr[0]中就保存了最大的元素
    public static void main(String[] args) {
        int [] arr = { 4,1,6,3,9,8};  //定义一个数组
        int max = arr[0]; //定义变量max用于记为最大数，首先假设第一个为最大值
        //下面通过一个for循环遍历数组中的元素
        for (int x =1; x<arr.length; x++){
            if (arr[x] >max){    //比较arr[x] 的值是否大于max
                max =arr[x];     //条件成立，将arr[x]的值赋给max
            }
            System.out.println("max=" +max);
        }
    }
}
