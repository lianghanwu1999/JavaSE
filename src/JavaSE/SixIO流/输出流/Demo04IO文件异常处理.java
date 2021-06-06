package JavaSE.FifteenDay.输出流;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo04IO文件异常处理 {
    public static void main(String[] args) {
        //try外面声明变量，try里面建立对象
        //创建输出流为空
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("c:\\a.txt");
            fos.write(100);
        }catch (IOException ex){
            //打印异常
            System.out.println(ex );
            throw new RuntimeException( "文件写入失败，重试" );
        }finally {
            try {
                if (fos !=null)
                    //关闭资源
                    fos.close();
            }catch (IOException ex){
                //指定错误
                throw new RuntimeException( "关闭资源失败" );
            }
        }
    }
}
