package JavaSE.SixteenDay.转换流.字节;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo03字节输出缓冲流 {
    public static void main(String[] args) throws IOException {
        //创建字节输出流 绑定文件
        FileOutputStream fos = new FileOutputStream("D:\\ceshi\\abc.txt");
        FileOutputStream bos = new FileOutputStream("D:\\ceshi\\abc.txt");
        bos.write(55);
        byte[] bytes = "HelloWorld".getBytes();
        bos.write(bytes);
        bos.write(bytes,3,2);
        bos.close();
    }
}
