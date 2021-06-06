package JavaSE.SixteenDay.转换流.字符;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//newLine()文本中换行, \r\n也是文本换行
public class Demo02字符输出缓冲区NewLine方法 {
    public static void main(String[] args)  throws IOException {
        FileWriter fw = new FileWriter("D:\\ceshi\\abc.txt");
        BufferedWriter bfw = new BufferedWriter(fw);

        bfw.write(100);
        bfw.flush();
        bfw.write("你好".toCharArray());
        bfw.flush();

        bfw.write("你好");
        bfw.newLine();  //换行
        bfw.flush();

        bfw.write("我好好");
        bfw.newLine();
        bfw.flush();

        bfw.write("大家都好");
        bfw.flush();

        bfw.close();

    }
}
