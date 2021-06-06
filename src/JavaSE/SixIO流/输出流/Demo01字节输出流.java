package JavaSE.FifteenDay.输出流;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01字节输出流 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("c:\\a.txt");
        //流对象的方法write写微信
        //写1字节
        fos.write(97);
        //关闭资源
        fos.close();
    }
}
