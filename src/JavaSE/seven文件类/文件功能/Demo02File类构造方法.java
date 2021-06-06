package JavaSE.FourteenDay.文件类.文件功能;

import java.io.File;

public class Demo02File类构造方法 {
    public static void main(String[] args) {
        //传递文件路径
        function_01();
    }
    /*
     *  File(File parent,String child)
     *  传递路径,传递File类型父路径,字符串子路径
     *  好处: 父路径是File类型,父路径可以直接调用File类方法
     */
    public static void function_01(){
        //父路径
        File parent = new File("d:");
//        传递File类型父路径,字符串子路径
        File file = new File(parent,"pycharm");
        System.out.println(file );
    }
    /*
     *  File(String parent,String child)
     *  传递路径,传递字符串父路径,字符串子路径
     *  好处: 单独操作父路径和子路径
     */
    public static void function_02(){
//        传递父路径和子路径
        File file = new File("d","pycharm");
        System.out.println(file );
    }

}
