package 基础部分代码.数据类型;

public class ZiDongLeiZhuan自动类型转换 {
    //char（字符串）类型转换为 int(数字类型)
    public static void main(String[] args) {
        char c1 ='a';  //定义一个char类型
        int i1 = c1;   //char 自动类型转换为int
        System.out.println("char 自动类型转换为int 后的值等于" +i1);
        char c2 = 'A';  //定义一个char类型
        int i3 =  c2;
        System.out.println("A等于" +i3);
        int i2 = c2 +1;  //char类型和int类型计算
        System.out.println("char 类型和int计算后等于" +i2);

    }
}
