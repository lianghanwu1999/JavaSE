package JavaSE.FourDay.面向对象;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
程序结构: 1.定义类{ }
主类{
    定义类
    程序入口main(){
        方法调用
    }
}
 */

//学生信息类
class Student{
    //定义私有属性
    private String name;  //私有属性名字
    private int age;  //年龄

    //定义方法
    public String getName(){
        return name;  //返回获取的值
    }

    public void SetName(String name){
        this.name = name;   //使用this避免成员变量与局部变量同名
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
}

public class Demo05点名器私有方法 {
    public static void addStudent(ArrayList<Student> list){
        //创建Scanner类，引用键盘输入，输入多个同学名字存储到容器中
        Scanner sc = new Scanner(System.in);
        for (int i =0;i <3 ;i++){
            //创建学生对象
            Student s = new Student();
            System.out.println("存储第"+ i + "个学生姓名:");
            String name = sc.next();
            s.SetName(name);  //接收输入的name属性变量
            System.out.println("存储第"+i+"个学生年龄：");
            int age = sc.nextInt();
            s.setAge(age);
            //添加学生到集合
            list.add(s);

        }
    }

    //打印全部同学每一个人的信息(姓名  年龄)
    public static void printStudent(ArrayList<Student> list){
        for (int i = 0; i<list.size();i++){
            Student s = list.get(i);  //获取集合所有元素
            System.out.println("姓名:" + s.getName()+",年龄:"+s.getAge());

        }
    }

//    3.随机对学生点名，打印学生信息
    public static void randomStudent(ArrayList<Student> list){
        //班级总人数范围内，随机产生一个随机数
        int index = new Random().nextInt(list.size());
        //在容器(ArrayList 集合)中，查找该随机数所对应的同学信息(姓名 年龄)
        Student s = list.get(index);
        System.out.println("被随机点名的同学："+s.getName() + "，年龄:" + s.getAge());
    }
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();//1.1创建一个可以存储多个同学名字的容器
        //1.存储全班信息
        addStudent(list);
        //2.打印全班同学每一个人的信息(姓名 年龄)
        printStudent(list);
        //3.随机对学生点名，打印学生信息
        randomStudent(list);
    }


}
