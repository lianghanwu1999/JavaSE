package JavaSE.SixteenDay.转换流.字节;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

//OuputStreamWriter：写了文件
//InputStreamReader：接收所有的字节输入流
public class Demo02转换流读取文本文件 {
    public static void main(String[] args) throws IOException {


    }
    public static void readUTF() throws IOException{
        //创建自己输出流 传递文本文件
        FileInputStream fis  = new FileInputStream("D:\\ceshi\\abc.txt");
        //创建转换流对象 构造方法中 包装字节输入流 同时写编码表名
        InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
        //创建字符串，并分配空间
        char [] ch = new char[1024];
        int len = isr.read(ch);
        System.out.println(new String(ch,0,len ) );
        isr.close();
    }

}
