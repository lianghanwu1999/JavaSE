package JavaSE.FifteenDay.输入流;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo02输入流读取数组 {
    public static void main(String[] args)throws IOException {
        FileInputStream fis = new FileInputStream("c:\\a.txt");
        //创建字节数组
        byte[] b = new byte[2];

        //接受输入的内容
        int len = fis.read(b);
        System.out.println(new String(b ) ); //ab
        System.out.println(len );//2

        len = fis.read(b);
        System.out.println(new String(b) );  //cd
        System.out.println(len );  //2

        len =fis.read(b);
        System.out.println(new String(b)); //ed
        System.out.println(len );//1

        len = fis.read(b);
        System.out.println(new String (b) ); //ed
        System.out.println(len ); //-1

        fis.close();
    }
}
