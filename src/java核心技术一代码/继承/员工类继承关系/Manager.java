package java核心技术一代码.继承.员工类继承关系;

public class Manager extends Employee{
    private double bonus;
    //初始化含参数构造类
    public Manager(String name,double salary ,int year,int month,int day)
    {
        super(name,salary,year,month,day);  //调用父类这些方法
        //设置自身特有方法,初始化
        bonus = 0;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double b)
    {
        bonus = b;
    }

}
