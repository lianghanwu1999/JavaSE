package java核心技术一代码.继承.员工类继承关系;

import java.time.LocalDate;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    //有参构造方法
    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(year,month,day);
    }

    //无参构造方法
    public Employee() {
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    //修改器
    public void raiseSalary(double byPercent)
    {
        double raise = salary*byPercent /100;
        salary += raise;
    }
}
