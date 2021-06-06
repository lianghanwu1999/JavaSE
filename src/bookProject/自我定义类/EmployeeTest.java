package bookProject.自我定义类;

import java.time.LocalDate;

public class EmployeeTest {
    public static void main(String[] args) {
        //创建一个静态数组类存放员工信息
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Carl Cracker",70000,1987,12,15);
        staff[1] = new Employee("Harry Hacker",50000,1989,10,1);
        staff[2] = new Employee("Tony Tester",40000,1990,3,15);

        //打印数组employee
        for(Employee e:staff)
            e.raiseSalary(5);

        for (Employee e:staff)
            System.out.println("name="+e.getName() +",salary="+e.getSalary()+",hireDay="+e.getHireDay() );
    }
}

class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String carl_cracker, int i, int i1, int i2, int i3) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void setHireDay(LocalDate hireDay) {
        this.hireDay = hireDay;
    }

    public void raiseSalary(double byPercent){
        double raise = salary*byPercent /100;
        salary += raise;
    }

}





