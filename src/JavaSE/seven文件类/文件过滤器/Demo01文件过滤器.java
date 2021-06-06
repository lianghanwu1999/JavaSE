package JavaSE.FourteenDay.文件类.文件过滤器;

import java.io.File;
import java.io.FileFilter;

//自定义文件过滤器
//实现FileFiter接口，重写抽象方法
class MyFilter implements FileFilter{
    public boolean accept(File pathname){
        /*
         * pathname 接受到的也是文件的全路径
         * c:\\demo\\1.txt
         * 对路径进行判断,如果是java文件,返回true,不是java文件,返回false
         * 文件的后缀结尾是.java
         */
        //String name = pathname.getName();
        return pathname.getName().endsWith(".java");
    }
}

/*
 *  File类的获取,文件获取过滤器
 *  遍历目录的时候,可以根据需要,只获取满足条件的文件
 *  遍历目录方法 listFiles()重载形式
 *  listFiles(FileFilter filter)接口类型
 *  传递FileFilter接口的实现类
 *  自定义FileFilter接口实现类,重写抽象方法,
 *  接口实现类对象传递到遍历方法listFiles
 */
public class Demo01文件过滤器 {
    public static void main(String[] args) {
        File file = new File("c:\\demo");
        File[] filesArr = file.listFiles(new MyFilter());
        for(File f:filesArr){
            System.out.println(f );
        }
    }
}
