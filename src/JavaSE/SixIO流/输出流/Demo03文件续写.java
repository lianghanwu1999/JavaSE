package JavaSE.FifteenDay.输出流;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo03文件续写 {
    public static void main(String[] args)  throws IOException {
        File file = new File("c:\\b.txt");
        //写入数据文件，文件中写入数据的文件输出流
        FileOutputStream fos = new FileOutputStream(file,true);
        //写入文件数据，可以在上一行末尾，添加\r\n
        fos.write("hello\r\n".getBytes());
        //写入文件数据
        fos.write("world".getBytes());
        //关闭文件
        fos.close();
    }
}
