package JavaSE.OneDay.数组;

public class Demo10 {
    //二维数组累加求和
    public static void main(String[] args) {
        int [][] arr2 = {{1,2},{3,4,5},{6,7,8,9,10}};
        int sum2 = 0;
        for (int i =0;i< arr2.length;i++){
            for (int j =0; j<arr2[i].length;j++){
                System.out.println(arr2[i][j]);
                //累加之和
                sum2 +=arr2[i][j];
            }
        }
        System.out.println("sum2=" +sum2);
    }
}
