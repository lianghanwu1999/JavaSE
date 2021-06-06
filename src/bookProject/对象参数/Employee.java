package bookProject.对象参数;

public class Employee {
   //标准构造类
    private String name;
    private double Salary;

    //构造函数
    public Employee(String name, double salary) {
        this.name = name;
        Salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", Salary=" + Salary +
                '}';
    }

    public void raiseSalary(double byPercent)
    {
        double salary = 0;
        double raise = salary* byPercent/100;
        salary += raise;
    }

}
