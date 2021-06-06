package JavaSE.FifteenDay.输入流;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo01输入流读取字节 {
    public static void main(String[] args)throws IOException {
        FileInputStream fis = new FileInputStream("c:\\a.txt");
        //读取一个字节，调用方法read返回 int
        //使用循环方式 读取文件 循环结束的条件 read()方法返回-1
        int len = 0;  //接受read方法的返回值

        while ((len = fis.read()) !=-1){
            System.out.println((char)len );
        }
        //关闭资源
        fis.close();
    }
}


