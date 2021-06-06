package JavaSE.ThreeDay.循环算法;

public class Demo01奇偶 {
    //奇偶求和
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i< 100; i++){  //使用for循环语句，完成1-100之间每个数的获取
            if (i %2 ==1){         //使用if条件语句，判断当前数是否是奇数
                sum += i;           //是奇数，进行累加和操作
            }
        }
        System.out.println("累加和的值"+sum);
    }
}
