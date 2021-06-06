package JavaSE.FourteenDay.递归;

public class Demo04递归计算斐波那契数列 {
    public static void main(String[] args) {
        System.out.println(getFBNQ(12) );
    }
    public static int getFBNQ(int month){
        if (month == 1)
            return 1;
        if (month ==2)
            return 1;
        return getFBNQ(month-1)+getFBNQ(month-2);
    }
}
