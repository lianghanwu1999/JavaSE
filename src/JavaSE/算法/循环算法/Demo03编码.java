package JavaSE.ThreeDay.循环算法;

public class Demo03编码 {
    //char类型存储
    /*
    取值范围
		* short:占两个字节,是有符号数据,取值范围-32768-32767
		* char: 占两个字节,是无符号数据,取值范围0-65536

		int 类型和 char 数据类型转换
        char  两个字节, int 四个字节

        char转成int类型的时候,类型自动提示,char数据类型,会查询编码表,得到整数
        int转成char类型的时候,强制转换,会查询编码表

        char存储汉字,查询Unicode编码表

        char可以和int计算,提示为int类型, 内存中两个字节
        char取值范围是0-65535, 无符号的数据类型

     */
    public static void main(String[] args) {
        //低到高，自动转换
        char c = 'a';
        int i = c+1;    //后面的字母比它前面的字母，ASCII值大1
        int x = c;     //c 在ASCII码 为97
        System.out.println(i);
        System.out.println(x);





        //从高到低，强制转换，低到高，自动转换
        int j = 90 ;
        char h = (char) j;  //int 类型，强制转换为char类型: 字符在ASCII编码中90是 Z
        System.out.println(h);

        System.out.println((char)6);

        char k = '你';
        System.out.println(k);

        char m = (char) -1;  //ASCII中-1 为空
        System.out.println(m);
    }
}
