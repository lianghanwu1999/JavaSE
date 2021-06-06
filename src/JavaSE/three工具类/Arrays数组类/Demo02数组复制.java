package JavaSE.TenDay.Arrays数组类;

import java.util.Arrays;

public class Demo02数组复制 {
    public static void main(String[] args) {
        int [] arr = {56,65,11,98,57,43,16,18,100,200};
        int [] newArray = tests(arr);
        //将数组转化为字符串
        System.out.println(Arrays.toString(newArray));
    }
    /*
     *  定义方法,接收输入,存储的是10个人考试成绩
     *  将最后三个人的成绩,存储到新的数组中,返回新的数组
     */
    public static int [] tests(int[] arr){
        //对数组排序
        Arrays.sort(arr);
        //将最后三个成绩存储到新的数组中
        int [] result = new int[3];
        //成绩数组的最后三个元素，复制到新数组中
        System.arraycopy(arr,0,result,0,3);
        for (int i= 0;i<3;i++){
            result[i] = arr[i];
        }
        return result;
    }
}
