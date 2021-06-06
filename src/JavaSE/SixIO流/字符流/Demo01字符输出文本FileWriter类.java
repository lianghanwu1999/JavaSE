package JavaSE.FifteenDay;

import java.io.FileWriter;
import java.io.IOException;

public class Demo01字符输出文本FileWriter类 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("c:\\.txt");
        //写一个字符
        fw.write(100);
        fw.flush();

        //写一个字符数组
        char[] c = {'a','b','c','d','e'};
//        写入一个字符数组
        fw.write(c);
//        刷新文档
        fw.flush();

        //写入数组一部分
        fw.write(c,2,3);
        //刷新文档
        fw.flush();

        //写如字符串
        fw.write("hello");
        //刷新文档
        fw.flush();


        //关闭文件
        fw.close();

    }
}
