package JavaSE.FourteenDay.文件类.文件功能;

import java.io.File;

public class Demo06File判断功能 {
    public static void main(String[] args) {
        function_A01();
    }
    /*
     *  File判断功能
     *  boolean isDirectory()
     *  判断File构造方法中封装的路径是不是文件夹
     *  如果是文件夹,返回true,不是文件返回false
     *
     *  boolean isFile()
     *  判断File构造方法中封装的路径是不是文件
     */
    public static void function_A01(){
        File file = new File("d:\\pycharm\\pycharm.exe");
        if (file.exists()){  //判断文件是否存在
            //判断File构造方法中封装的路径是不是文件夹
            boolean b = file.isDirectory();
            System.out.println(b );
        }
    }
    /*
     *  File判断功能
     *  boolean exists()
     *  判断File构造方法中封装路径是否存在
     *  存在返回true,不存在返回false
     */
    public static void function(){
        File file = new File("src");
        //判断File构造方法中封装路径是否存在
        boolean b = file.exists();
        System.out.println(b );
    }
}
