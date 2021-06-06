package JavaSE.EighteenDay.Properties集合;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**Properties集合特有方法 load(传递任意字节字符流)
         * load(InputStream in)
         * load(Reader r)
         * 传递任意的字节或者字符输入流
  * **/

public class Demo02Properties的load方法 {
    //传递任意的字节或者字符输入流
    public static void main(String[] args) throws IOException {
        function_02();
    }
    public static void function_02() throws IOException{
        Properties pro = new Properties();
        FileReader fr = new FileReader("D:\\ceshi\\pro.ceshi.txt");
        //调用集合法方法load,传递字符输入流
        pro.load(fr);
        //关闭写入流
        fr.close();
        System.out.println(pro);
    }
}
