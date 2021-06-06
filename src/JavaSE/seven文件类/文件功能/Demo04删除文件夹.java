package JavaSE.FourteenDay.文件类.文件功能;

import java.io.File;

public class Demo04删除文件夹 {
    public static void main(String[] args) {
        funtion_04();
    }
    /*
     *  File类的删除功能
     *  boolean delete()
     *  删除的文件或者是文件夹,在File构造方法中给出
     *  删除成功返回true,删除失败返回false
     *  删除方法,不走回收站,直接从硬盘中删除
     *  删除有风险,运行需谨慎
     */
    public static void funtion_04(){
        File file = new File("c:\\a.txt");
        //返回布尔类型的，成功true ,失败 False
        boolean b = file.delete();
        System.out.println(b );
    }
}
