package JavaSE.SixteenDay.转换流.字符;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Demo01字符输出缓冲区 {
    public static void main(String[] args)  throws IOException {
        //创建字符输出流 封装文件
        FileWriter fw = new FileWriter("D:\\ceshi\\abc.txt");
        //创建字符输出缓冲流
        BufferedWriter bfw = new BufferedWriter(fw);

        //写入字符缓冲区
        bfw.write(100);
        //刷新缓冲区
        bfw.flush();
        //写入字符缓冲区
        bfw.write("你好".toCharArray());
        //刷新缓冲区
        bfw.flush();

        //写入字符缓冲区
        bfw.write("我好好");
        //刷新缓冲区
        bfw.flush();

        //写入字符缓冲区
        bfw.write("大家好");
        //刷新缓冲区
        bfw.flush();

        //关闭缓冲区资源
        bfw.close();


    }
}
