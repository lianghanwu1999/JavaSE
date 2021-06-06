package JavaSE.OneDay.数组;

public class Demo11 {
    public static void main(String[] args) {
        int[][] arr = new int[3][];
        arr[0] = new int[]{11, 12};
        arr[1] = new int[]{21, 22, 23};
        arr[2] = new int[]{31, 32, 33, 34};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {  //遍历数组元素
            int groupSum = 0;  //定义变量记录小组销售总额
            for (int j = 0; j < arr[i].length; j++) { // 遍历小组内每个人的销售额
                groupSum = groupSum + arr[i][j];
            }
            sum = sum + groupSum;  //累加小组销售额
            System.out.println("第" + (i + 1) + "小组销售额为:" + groupSum + "万元");
        }
        System.out.println("总销售额为:" + sum + "万元");
    }
}
