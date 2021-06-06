package 基础部分代码.初始化类;

//演示import 导入

public class Employee {
    String name;  //使用String字符串
    int age;
    String designation;
    double salary;

    //Employee 类的构造器
    public Employee(String name, int i, int i1, int i2, int i3){
        this.name = name;
    }

    //设置age 的值
    public void empAge(int empAge){
        age = empAge;
    }

    //设置designation的值
    public void empDesignation(String empDesig){
        designation = empDesig;
    }

    //设置salary的值
    public void empSalary(double empSalary){
        salary = empSalary;
    }

//    程序入口
//    打印信息
    public void printEmployee(){
        System.out.println("名字：" + name);
        System.out.println("年龄：" + age);
        System.out.println("职位：" + designation);
        System.out.println("薪水：" + salary);
    }
}

