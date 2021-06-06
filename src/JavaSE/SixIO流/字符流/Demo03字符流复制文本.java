package JavaSE.FifteenDay;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo03字符流复制文本 {
    public static void main(String[] args) throws IOException {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("D:\\ceshi\\abc.txt");
            fw = new FileWriter("d:\\ceshi\\molu\\abc.txt");
            char[] cbuf = new char[1024];
            int len = 0;
            while ((len =fr.read(cbuf))!=-1){
                //写入字符数组
                fw.write(cbuf,0,len);
                //刷新缓冲区
                fw.flush();
            }
        }catch (IOException ex){
            System.out.println(ex );
            throw new RuntimeException( "复制失败" );
        }finally {
            try {
                if (fw !=null)
                    fw.close();
            }catch (IOException ex){
                throw new RuntimeException( "释放资源失败" );
            }finally {
                try {
                    if(fr!=null)
                        fr.close();
                }catch (IOException ex){
                    throw new RuntimeException( "释放资源失败" );
                }
            }
        }
    }
}
