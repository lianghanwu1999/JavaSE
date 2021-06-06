package JavaSE.OneDay.数组;

public class Demo09 {
    //遍历二维数组
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5},{6,7,8,9},{0}};

        //外循环，遍历二维数组,行数
        for(int i =0; i<arr.length;i++){
            //内循环，遍历每一个数组 arr[0] arr[1] arr[i]
            for (int j=0;j< arr[i].length;j++){
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }
    }
}
