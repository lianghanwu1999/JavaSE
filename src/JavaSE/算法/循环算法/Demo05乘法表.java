package JavaSE.ThreeDay.循环算法;

public class Demo05乘法表 {
    public static void main(String[] args) {
        for (int j = 1; j< 10; j++){ //控制外行号
            for (int k =1;k<=j;k++){ //打印内数据
                System.out.println(k +"*" + j+"=" +j*k +"\t");
            }
            System.out.println();
        }
    }
}
