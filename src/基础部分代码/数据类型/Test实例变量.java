package 基础部分代码.数据类型;

public class Test实例变量 {

    //创建方法
    //这个实例变量对于子类可见
    public String name;

    //私有变量，仅在该类可见
    private double salary;

    //构造器对name赋值
    public Test实例变量 (String empName){
        name = empName;
    }

    //设定salary的值
    public void setSalary(double empSal){
        salary = empSal;
    }

    //打印信息
    public void printEmp(){
        System.out.println("名字：" +name);
        System.out.println("薪水：" +salary);
    }

//    程序入口
    public static void main(String[] agrs){

        //创建对象：对象名为empOne
        // new:在原有类中new,创建新的对象
        Test实例变量 empOne = new Test实例变量("RUNOOB");

        //调用对象实例方法
        empOne.setSalary(1000.0);
        empOne.printEmp();
    }
}

