package JavaSE.two面向对象代码.抽象类.书本抽象类;

import java.time.LocalDate;

public class Employee  extends Person{    //继承抽象类也是抽象类
    private double salary;
    private LocalDate hireDay;

    public Employee(String name,double salary, int year,int month,int day)
    {
        super(name);
        this.salary = salary;
        hireDay = LocalDate.of(year,month,day);
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }
    public String getDescription(){
        return String.format("an employee with a salary of $ %.2f",salary);
    }

    //继承抽象类，要重写他的抽象方法
    public void raiseSalary(double byPercent){
        double raise = salary*byPercent /100;
        salary += raise;
    }


}
