package JavaSE.FourteenDay.文件类.文件功能;

import java.io.File;

/*
 *  java.io.File
 *    将操作系统中的,文件,目录(文件夹),路径,封装成File对象
 *    提供方法,操作系统中的内容
 *    File与系统无关的类
 *    文件 file
 *    目录 directory
 *    路径 path
 */
public class Demo01File类的静态成员 {
    public static void main(String[] args) {
        //File类静态成员变量
        //与系统有关的路径分隔符  :  ;
        String separator = File.pathSeparator;  //与系统有关的路径分隔符
        // 是一个分号,目录的分割(window中环境变量配置各个路径用分号分割，
        // 表示一个完整的路径结束)  Linux中是冒号 :
        System.out.println(separator );

        //与系统有关的默认名称分隔符 : \
        separator = File.separator;
        System.out.println(separator );  //向右  \  目录名称分割  Linux  /
    }
}
