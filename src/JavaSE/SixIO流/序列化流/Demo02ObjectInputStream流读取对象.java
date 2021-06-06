package JavaSE.EighteenDay.序列化流;

import java.io.*;

public class Demo02ObjectInputStream流读取对象 {
//    传递任意的字节输入流,输入流封装文件,必须是序列化的文件
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        readObject();

}
    public static void readObject() throws IOException,ClassNotFoundException{
        FileInputStream fis = new FileInputStream("D:\\ceshi\\abc.txt");
        //创建反序列化流 构造方法中，传递字节输入流
        ObjectInputStream ois = new ObjectInputStream(fis);
        //调用反序列化流方法 readOject()读取对象
        Object obj = ois.readObject();
        System.out.println(obj);
        ois.close();
    }
}
