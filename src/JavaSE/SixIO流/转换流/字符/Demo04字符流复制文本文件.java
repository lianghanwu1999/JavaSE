package JavaSE.SixteenDay.转换流.字符;

import java.io.*;

public class Demo04字符流复制文本文件 {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new FileReader("D:\\ceshi\\abc.txt"));
        BufferedWriter bfw = new BufferedWriter(new FileWriter("D:\\ceshi\\molu"));
        //读取文本行 读一行 写一行 写换行
        String Line = null;
        while ((Line = bfr.readLine()) !=null){
            //读取一行
            bfw.write(Line);
            //换行
            bfw.newLine();
            //刷新缓冲区
            bfw.flush();
        }
        bfw.close();
        bfr.close();
    }
}
