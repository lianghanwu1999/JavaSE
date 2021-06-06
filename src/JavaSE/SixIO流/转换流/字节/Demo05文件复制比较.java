package JavaSE.SixteenDay.转换流.字节;

import java.io.*;

public class Demo05文件复制比较 {
    public static void main(String[] args)  throws IOException {
        //开始时间
        long s  = System.currentTimeMillis();
        copy_4(new File("D:\\ceshi\\abc.txt"),
                new File("D:\\ceshi\\molu"));
        //结束时间
        long e = System.currentTimeMillis();
        //过程耗时
        System.out.println(e-s );
    }

    /*
     * 方法,实现文件复制
     *  4. 字节流缓冲区流读写字节数组
     */

    public static void copy_4(File src,File desc) throws IOException{
        //缓冲输入流功能：写入字节数组
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
        //缓冲输出流功能:读取字节数组
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(src));

        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = bis.read(bytes)) !=-1){
            bos.write(bytes,0,len);
        }
        //关闭写入缓冲流
        bos.close();
        //关闭读取缓冲流
        bis.close();
    }


    /*
     * 方法,实现文件复制
     *  3. 字节流缓冲区流读写单个字节
     */

    public static void copy_3(File src , File desc) throws IOException{
        //写入字节数组到缓冲区
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
        //在缓冲区中读取字节数组
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(src));
        //数组长度
        int len = 0;
        //判断字节数组是否为空
        while ((len = bis.read())!=-1){
            bos.write(len);
        }
        //关闭读取缓冲区流
        bos.close();
        //关闭写入缓冲区流
        bis.close();
    }

    /*
     * 方法,实现文件复制
     *  2. 字节流读写字节数组
     */

    public static void copy_2(File src ,File desc) throws IOException{
        //写入字节数组
        FileInputStream fis = new FileInputStream(src);
        //读取字节数组
        FileOutputStream fos  = new FileOutputStream(desc);
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fis.read( bytes )) !=-1){
            fos.write(bytes,0,len);
        }
        //关闭读取字节流资源
        fos.close();
        //关闭写入字节流资源
        fis.close();
    }

    /*
     * 方法,实现文件复制
     *  1. 字节流读写单个字节
     */
    public static void copy_1(File src,File desc) throws IOException{
        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(src);
        int len = 0;
        while ((len = fis.read(  )) !=-1){
            fos.write(len);
        }
        fos.close();
        fis.close();
    }
}
