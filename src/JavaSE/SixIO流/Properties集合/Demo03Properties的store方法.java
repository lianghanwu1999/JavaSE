package JavaSE.EighteenDay.Properties集合;

/*Properties集合的特有方法store
        * store(OutputStream out)
        * store(Writer w)
        * 接收所有的字节或者字符的输出流,将集合中的键值对,写回文件中保存*/

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Demo03Properties的store方法 {
    public static void main(String[] args) throws IOException {
        function_03();
    }
    public static void function_03() throws IOException{
        Properties pro = new Properties( );
        //设置键值对值
        pro.setProperty("name","ZhangSan");
        pro.setProperty("age","31");
        pro.setProperty("email","123456789@163.com");
        //接收到相应的地方存储,并注明时间
        FileWriter fw = new FileWriter("D:\\ceshi\\pro.ceshi.txt");
        //键值对，存回文件 使用集合法方法store传递字符输出流
        pro.store(fw,"");
        fw.close();
    }
}
