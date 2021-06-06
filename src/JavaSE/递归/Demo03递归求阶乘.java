package JavaSE.FourteenDay.递归;

public class Demo03递归求阶乘 {
    public static void main(String[] args) {
        System.out.println(GetJieCheng(5) );
    }
    public static int GetJieCheng(int n){
        if (n ==1)
            return 1;
        return n*GetJieCheng(n-1);
    }
}
