package JavaSE.TenDay.包装类;

public class Demo02转换成字符串 {
    //任意进制整数转成任意进制的字符串
    public static void main(String[] args) {
        Function01();
    }
    public static void Function01(){
        //使用+与字符串拼接
        int i =3;
        String s = i+"";
        System.out.println(s+1);   //"31
        //toString(int ,int 进制),任意进制整数转成任意进制的字符串
        //将十进制5.转成成二进制:101
        String s1 = Integer.toString(5,2);
        System.out.println(s1);
    }
}
