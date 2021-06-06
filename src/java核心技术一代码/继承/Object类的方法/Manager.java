package java核心技术一代码.继承.Object类的方法;

import java.util.Objects;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name,double salary ,int year,int month ,int day)
    {
        super(name,salary,year,month,day);
        bonus =0;
    }

    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manager)) return false;
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
        return Double.compare(manager.bonus, bonus) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode( ), bonus);
    }

    @Override
    public String toString() {
        return super.toString() + "[bouns=" + bonus+"]";
    }
}


