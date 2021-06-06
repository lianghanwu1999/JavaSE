package JavaSE.SixteenDay.转换流.字节;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo04字节输入缓冲流 {
    public static void main(String[] args) throws IOException {
        //创建字节输入流的缓冲流对象 构造方法中包装字节输入流 包装文件
        BufferedInputStream bis = new
                BufferedInputStream(new FileInputStream("D:\\ceshi\\abc.txt"));
        byte[] bytes = new byte[10];
        int len = 0;
        while ((len = bis.read(bytes)) != -1){
            System.out.print(new String(bytes,0,len ));
        }
        bis.close();
    }
}
