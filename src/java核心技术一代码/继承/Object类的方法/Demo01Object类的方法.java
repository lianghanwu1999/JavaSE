package java核心技术一代码.继承.Object类的方法;

import JavaSE.two面向对象代码.抽象类.书本抽象类.Employee;

public class Demo01Object类的方法 {
    public static void main(String[] args) {

        Employee alice1 = new Employee("Alice Adams",75000,1987,12,15);
        Employee alice2 = alice1;
        Employee alice3 = new Employee("Alice Adams",75000,1987,12,15);
        Employee bob = new Employee("Bob BrandSon",50000,1989,10,1);

        //判断是否相等
        System.out.println("alice1 == alice2:" +(alice1 == alice2));
        System.out.println("alice1 == alice3:" +(alice1 == alice3));
        //使用equals方法，判断两个对象是否相同与一个类
        System.out.println("alice1 equals(alice3)" +alice1.equals(alice3));
        System.out.println("alice1.euqals(bob):"+alice1.equals(bob));
//      //获取bob的字符串
        System.out.println("bob.toString():"+bob);

        Manager carl = new Manager("Carl Cracker",80000,1987,12,15);
        Manager boss = new Manager("Carl Cracker",80000,1987,12,15);
        //获取
        boss.setBonus(5000);
        System.out.println("boss.toString():" +boss);
        System.out.println("carl.equals(boss):"+carl.equals(boss));
        //获取散列表
        System.out.println("alice1.hashCode():" + alice1.hashCode());
        System.out.println("alice3.hashCode():" + alice3.hashCode());
        System.out.println("bob.hashCode():" + bob.hashCode());
        System.out.println("Carl.hashCode():" +carl.hashCode());


    }

}
