package JavaSE.SixteenDay.转换流.字节;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

//OutputStreamWriter写文本文件
//OutputStreamWriter 是字符流通向字节流的桥梁：可使用指定的字符编码表
public class Demo01转换流写入文本文件 {
    //添加IOEIOException,避免输出IO异常
    public static void main(String[] args) throws IOException {
//        writeUTF();
        writeGBK();
    }
    /*
     * 转换流对象OutputStreamWriter写文本
     * 采用UTF-8编码表写入
     */

    public static void writeUTF() throws IOException{
        //创建字节输出流 绑定文件
        FileOutputStream fos = new FileOutputStream("D:\\ceshi\\abc.txt");
        //创建转换对象，(转换流：OutputStreamWriter)构造方法保证字节输出流，并指定编码表时UTF-8;
        OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
        osw.write("你好");
        osw.close();
    }
    /*
     * 转换流对象 OutputStreamWriter写文本
     * 文本采用GBK的形式写入
     */
    public static void writeGBK() throws IOException{
        //创建字节输出流 绑定数据文件
        FileOutputStream fos = new FileOutputStream("D:\\ceshi\\abc.txt");
        //创建转换数据流 构造方法 绑定字节输出流 使用GBK 编码表
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        //转换流 写数据
        osw.write("您好");
        System.out.println("输入完毕!" );
        //关闭流资源
        osw.close();
    }




}
