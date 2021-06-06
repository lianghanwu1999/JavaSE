package JavaSE.FourteenDay.文件类.文件功能;

import java.io.File;

public class Demo07File类List {
    public static void main(String[] args) {
        function_A02();
    }
    public static void function_A02(){
        //获取系统中的所有跟目录
        File[] filesArr = File.listRoots();
        for (File f:filesArr){
            System.out.println(f );
        }
    }
    /*
     *  File类的获取功能
     *  File[] listFiles()
     *  获取到,File构造方法中封装的路径中的文件和文件夹名 (遍历一个目录)
     *  返回的是目录或者文件的全路径
     */
    public static void function_A03(){
        File file = new File("d:\\pycharm");
        File [] fileArr = file.listFiles();
        for (File f: fileArr){
            System.out.println(f );
        }
    }
    /*
     *  File类的获取功能
     *  String[] list()
     *  获取到,File构造方法中封装的路径中的文件和文件夹名 (遍历一个目录)
     *  返回只有名字
     */

    public static void function_A04(){
        File file = new File("c:");
        String [] strArr = file.list();
        System.out.println(strArr.length );
        for (String str: strArr){
            System.out.println(str );
        }
    }

}
