package JavaSE.FifteenDay.输入流;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo04复制文件读取字节 {
    public static void main(String[] args) {
        //定义两个流的对象变量
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try{
            //建立两个流的对象 绑定数据源和数据目的
            fis = new FileInputStream("c:\\t.zip");
            fos = new FileOutputStream("d:\\t.zip");
            //字节输入流，读取1个字节，输出流写1个字节
            int len = 0;
            while ((len = fis.read()) !=-1){
                fos.write(len);
            }
        }catch (IOException ex){
            System.out.println(ex );
            throw new RuntimeException( "文件复制失败" );
        }finally {
            try {
                if (fis !=null)
                    fis.close();
            }catch (IOException ex){
                throw new RuntimeException( "释放资源失败" );
            }
        }
    }
}
