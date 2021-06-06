package JavaSE.TwoDay.自定义类型;
/*
	   随机点名器,集合改进 (学生的姓名和年龄)
	   现实中有学生这个事物,使用定义类的形式,描述学生事物
	   属性: 姓名,年龄

	   姓名存储了数组, 将容器换成是集合
	   String[] s = {"",""};
	   集合中,存储的是学生的姓名吗?  应该存储Student类型

	   存储学生:
	      学生类型,存储到集合中
	   总览: 遍历集合
	   随机: 随机数,作为索引,到集合中找到元素
	   三个功能,共享的数据,集合容器,
	   定义三个方法,必须参数传递集合
	*/

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Demo05集合与类 {
    //点名器:类与集合应用
    public static void main(String[] args) {
        //定义集合,存储是StudentName类型变量
        ArrayList <StudentName> array = new ArrayList<StudentName>();
        int choose = chooseFunction();
        //调用添加方法 :添加用户信息
        add(array);
        switch (choose){
            case 1:
                //调用遍历集合:查看用户信息
                printArrayList(array);
                break;
            case 2:
                //随机点名:随机数抽取
                randomStudentName(array);
                break;
            case 3:
                //退出系统
                return;
            default:
                System.out.println("重新输入");
                break;
        }
//        //调用添加方法 :添加用户信息
//         add(array);
//        //调用遍历集合:查看用户信息
//        printArrayList(array);
//        //随机点名:随机数抽取
//        randomStudentName(array);
}
    //显示菜单
    public static int chooseFunction(){
        System.out.println("-------------库存管理------------");
//        System.out.println("1.添加用户信息");
        System.out.println("1.查看用户信息");
        System.out.println("2.随机数抽取");
        System.out.println("3.退出系统");
        System.out.println("请输入要执行的操作序号：");
        //接受键盘输入
        Scanner sc = new Scanner(System.in);
        int chooseNumber = sc.nextInt();
        return chooseNumber;
    }
    //随机数，当做集合的索引，到集合中找到元素
    public static void randomStudentName(ArrayList<StudentName> array){
        Random ran = new Random();
        int number = ran.nextInt(array.size());  //接收一个随机整数
        //随机数，索引到集合中get
        StudentName s = array.get(number);
        System.out.println(s.name +" " +s.age);
    }

    public static void printArrayList(ArrayList<StudentName> array){
//        Scanner i = new Scanner(System.in);
        for (int i =0 ; i< array.size(); i++){
            //存储集合的时候，集合.add(sn1) sn1 是StudentName 类型变量
            //获取的时候，集合。get方法，获取出来的是什么,还是StudentName 类型变量
            StudentName s = array.get(i); //获取集合元素
            System.out.println(s.name + " " +s.age);
        }
    }
    public static void add (ArrayList<StudentName> array){
        //创建StudentName 类型变量
        StudentName sn1 = new StudentName();
        StudentName sn2 = new StudentName();
        StudentName sn3 = new StudentName();
        StudentName sn4 = new StudentName();
        StudentName sn5 = new StudentName();

        sn1.name = "张三1";
        sn1.age = 201;

        sn2.name = "张三2";
        sn2.age = 201;

        sn3.name = "张三3";
        sn3.age = 201;

        sn4.name = "张三4";
        sn4.age = 201;

        sn5.name = "张三5";
        sn5.age = 201;

        //将StudentName变量，存储到集合array中
        array.add(sn1);
        array.add(sn2);
        array.add(sn3);
        array.add(sn4);
        array.add(sn5);

    }

}
