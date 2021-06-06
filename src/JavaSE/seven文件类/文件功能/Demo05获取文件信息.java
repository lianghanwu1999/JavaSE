package JavaSE.FourteenDay.文件类.文件功能;

import java.io.File;

/*
 * String getName(): 返回路径中表示的文件或者文件夹名
 * 获取路径中的最后部分的名字
 * long length(): 返回路径中表示的文件的字节数
 * String getAbsolutePath(): 获取绝对路径,返回String对象
 * File   getAbsoluteFile() : 获取绝对路径,返回File对象
 * eclipse环境中,写一个相对路径,绝对位置工程根目录
 * String getParent(): 获取父路径,返回String对象
 * File getParentFile(): 获取父路径,返回File对象
 */
public class Demo05获取文件信息 {
    public static void main(String[] args) {
        funtion_05();
        function_06();
        function_07();
        function_08();
    }
    /*
     * File类的获取功能
     * String getParent() 返回String对象
     * File getParentFile()返回File对象
     * 获取父路径
     */
    public static void funtion_05(){
        File file = new File("d:\\pycharm\\pycharm.exe");
        File parent = file.getParentFile();  //获取父路径
        System.out.println(parent );
    }
    /*
     * File类获取功能: 获取绝对路径
     * String getAbsolutePath() 返回String对象
     * File   getAbsoluteFile() 返回File对象
     * eclipse环境中,写的是一个相对路径,绝对位置工程根目录
     */
    public static void function_06(){
        File file = new File("src");
        File absolute = file.getAbsoluteFile();  //获取绝对路径
        System.out.println(absolute );
    }
    /*
     * File类获取功能
     * long length()
     * 返回路径中表示的文件的字节数
     */
    public static void function_07(){
        File file = new File("d:\\pycharm\\pycharm.exe");
//        获取路径文件的字节数
        long length = file.length();  //返回路径中表示的文件的字节数
        System.out.println(length );
    }
    /*
     *  File类的获取功能
     *  String getName()
     *  返回路径中表示的文件或者文件夹名
     *  获取路径中的最后部分的名字
     */

    public static void function_08(){
        File file = new File("d:\\pycharm\\pycharm.exe");
        //获取路径中的最后部分名字
        String name = file.getName();
        System.out.println(name );

//        String path = file.getPath();
//        System.out.println(path );
//        System.out.println(file );
    }


}
