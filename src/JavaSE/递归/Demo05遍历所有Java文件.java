package JavaSE.FourteenDay.递归;

import java.io.File;
import java.io.FileFilter;

class MyJavaFilter implements FileFilter{
    public boolean accept(File pathname){
        //判断获取的是目录，直接返回true
        if(pathname.isDirectory())
            return true;
        //获取小写的文件，且文件名后缀为小写java
        return pathname.getName().toLowerCase().endsWith(".java");
    }
}


public class Demo05遍历所有Java文件 {
    public static void main(String[] args) {
        getAllJava(new File("c:\\demo"));
        new File("c:\\demo").delete();
    }
    /*
     * 定义方法,实现遍历指定目录
     * 获取目录中所有的.java文件
     */
    public static void getAllJava(File dir){
        //调用File对象方法 listFiles(）获取，加入过滤器
        File[] fileArr = dir.listFiles(new MyJavaFilter());
        for (File f : fileArr){
            //对f路径，判断是不是文件夹
            if(f.isDirectory()){
                //递归进入文件夹遍历
                getAllJava(f);
            }else {
                System.out.println(f );
            }
        }
    }
}
