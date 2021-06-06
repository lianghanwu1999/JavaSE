package JavaSE.EighteenDay.序列化流;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{
    public String name;
    public int age;

    //有参构造方法
    public Person(String name ,int age){
        super();
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //无参构造方法
    public Person() {

    }

    //格式输出：重写Object类toString()方法
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
public class Demo01ObjectOutputStream流写对象 {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
//        readObject();
//        writeObject();
    }
    /*
     * ObjectOutputStream
     * 构造方法: ObjectOutputStream(OutputSteam out)
     * 传递任意的字节输出流
     * void writeObject(Object obj)写出对象的方法
     */
    public static void writeObject() throws IOException{
        //创建字节输出流 封装文件
        FileOutputStream fos = new FileOutputStream("D\\ceshi\\abc.txt");
        //创建写入对象的序列化流 对象 构造方法传递字节输出流
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Person p = new Person( "list",25 );
        //调用序列化流 的方法 writeObject写出对象
        oos.writeObject(p);
        oos.close();
    }
}
