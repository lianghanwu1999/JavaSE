package JavaSE.FifteenDay.输入流;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo03处理数组的实现原理 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("c:\\a.txt");
        //创建字节数组
        byte[] b = new byte[1024];

        int len = 0;
        while ((len = fis.read( b )) != -1){
            System.out.println(new String(b,0,len) );
        }
        fis.close();
    }
}
