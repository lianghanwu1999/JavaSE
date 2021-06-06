package JavaSE.FourteenDay.递归;

import java.io.File;

public class Demo01递归遍历全目录 {
    public static void main(String[] args) {
        File dir = new File("d:\\pycharm");
        getAllDir(dir);
    }
    /*
     *  定义方法,实现目录的全遍历
     */
    public static void getAllDir(File dir){
        System.out.println(dir );
        //调用方法listFiles()对目录,dir进行遍历
        File [] fileArr = dir.listFiles();
        for (File f : fileArr){
            //判断变量f表示的路径是不是文件夹
            if (f.isDirectory()) {  //判断是不是目录
                //是一个目录就要去遍历这个目录
                //本方法,getAllDir,就是给这个目录去遍历
                //继续调用getAllDir ,传递它目录
                getAllDir(f);
            }else {
                System.out.println(f );
            }
        }
    }
}
