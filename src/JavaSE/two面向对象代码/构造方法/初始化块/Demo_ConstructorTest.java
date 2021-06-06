package JavaSE.two面向对象代码.构造方法.初始化块;

import java.util.Random;

public class Demo_ConstructorTest {
    public static void main(String[] args) {
        //创建员工对象
        Employee1[] staff = new Employee1[3];

        staff[0] = new Employee1("Harry",4000);
        staff[1] = new Employee1(60000);
        staff[2] = new Employee1();

        //打印获取的结果
        for (Employee1 e : staff)
        {
            System.out.println("name="+e.getName() +",id="+e.getId()+",salary="+e.getSalary());
        }

    }
}


class Employee1
{
    private static int nextId;

    private int id;
    private String name = "";  //初始化name 为null值
    private double salary;

    //创建静态代码块
    static {
        Random r = new Random();
        //设置随机范围 0 到 9999 之间
        nextId = r.nextInt( 1000 );  //获取一个整数，范围在0 ——9999 之间 包括0和9999
    }
//    初始化对象代码块
    {
        id = nextId;
        nextId ++;
    }
    //重载构造函数：实例初始化
    public Employee1(String n, double s)
    {
        name = n;
        salary = s;
    }
    public Employee1(double s)
    {
        //使用this 隐函数调用s值
        this("Employee #"+nextId,s);
    }
    //无参构造（器）类
    public Employee1() {
    }


    public static int getNextId() {
        return nextId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

