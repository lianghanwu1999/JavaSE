package JavaSE.TenDay.包装类;

public class Demo01ParseInt方法 {
    //指定进制的字符串转换为十进制的整数
    public static void main(String[] args) {
        Function();
    }
    public static void Function(){
        //将二进制数110，转换成十进制数：6
        //指定进制的字符串转换为十进制的整数
        int i = Integer.parseInt("110",2);
        System.out.println(i);
    }
}
