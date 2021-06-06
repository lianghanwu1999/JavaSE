package JavaSE.FourteenDay.文件类.文件功能;

import java.io.File;

/*
创建目录
* public boolean mkdir():创建文件夹 如果存在这样的文件夹，就不创建了
* public boolean mkdirs():创建文件夹,如果父文件夹不存在，会帮你创建出来
 */
public class Demo03File创建目录 {
    public static void main(String[] args) {
        function_03();
    }
    /*
     *  File创建文件夹功能
     *  boolean mkdirs() 创建多层文件夹
     *  创建的路径也在File构造方法中给出
     *  文件夹已经存在了,不在创建
     */
    public static void function_03(){
        File file = new File("c:\\abb\\bcc");
        boolean b = file.mkdirs();  //创建目录 ，与linux相似
        System.out.println(b );
    }
}
