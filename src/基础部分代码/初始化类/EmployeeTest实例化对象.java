package 基础部分代码.初始化类;

public class EmployeeTest实例化对象 {
//    程序入口
    public static void main(String[] args) {
        //使用构造器创建两个对象
        Employee empOme = new Employee("RUNOOB1", 7000, 1987, 12, 15);
        Employee empTow = new Employee("RUNOOB2", 7000, 1987, 12, 15);

        //调用这两个对象的成员方法
        empOme.empAge(26);
        empOme.empDesignation("高级程序员");
        empOme.empSalary(1000);
        empOme.printEmployee();

        empTow.empAge(21);
        empTow.empDesignation("菜鸟程序员");
        empTow.empSalary(500);
        empTow.printEmployee();
    }
}
