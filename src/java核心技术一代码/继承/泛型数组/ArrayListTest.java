package java核心技术一代码.继承.泛型数组;

import java核心技术一代码.继承.Object类的方法.Employee;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        //创建泛型数组
        ArrayList<Employee> staff = new ArrayList<>();

        //往数组添加元素
        staff.add(new Employee( "Cal Craker",75000,1987,12,15 ));
        staff.add(new Employee( "Harry Hacker",50000,1989,10,1 ));
        staff.add(new Employee( "Tony Tester",40000,1990,3,15 ));

        //遍历获取元素
        for (Employee e: staff) {
            e.raiseSalary(5);
        }
        //打印输出所有元素
        for (Employee e: staff) {
            System.out.println("name=" + e.getName()+",salary="+e.getSalary()+",hireDay="+e.getHireDay());
        }
    }
}
