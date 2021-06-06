package JavaSE.SixteenDay.转换流.字符;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo03读取字符文本行 {
    public static void main(String[] args) throws IOException {
        int LineNumber = 0;
        //创建字符输入缓冲流对象 构造方法传递字符输入流 包装数据源文件
        BufferedReader bfr = new BufferedReader(new FileReader("D:\\ceshi\\abc.txt"));
        //调用缓冲区流方法 readLine() 读取文本行
        //循环读取文本行 结束条件 readLine()返回null
        String Line  = null;
        while ((Line = bfr.readLine())!=null){
            LineNumber ++;
            System.out.println(LineNumber+" " +Line );
        }
        bfr.close();
    }
}
