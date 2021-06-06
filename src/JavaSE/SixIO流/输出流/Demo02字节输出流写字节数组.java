package JavaSE.FifteenDay.输出流;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo02字节输出流写字节数组 {
    public static void main(String[] args)  throws IOException {
        FileOutputStream fos = new FileOutputStream("c:\\a.txt");
        //流对象的方法write写入数据
        //写字节数组
        byte[] bytes = {65,66,67,68};
        fos.write(bytes);

        //写入字节数组的一部分 ，开始索引，写几个
        fos.write(bytes,1,2);

        //写入字节数组的简便方式
        //写字符串
        fos.write("hello".getBytes());

        //关闭资源
        fos.close();

    }
}
