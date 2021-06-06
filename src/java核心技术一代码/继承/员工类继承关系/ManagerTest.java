package java核心技术一代码.继承.员工类继承关系;

public class ManagerTest {
    public static void main(String[] args) {
        //创建一名经理
        Manager boss = new Manager("Carl Cracker",8000,1987,12,15);
        boss.setBonus(5000);

        Employee[] staff = new Employee[3];

        staff[0] = boss;
        staff[1] = new Employee( "Harry Hacker",50000,1980,10,1 );
        staff[2] = new Employee( "Tommy Tester",40000,1990,3,15 );


        //打印数据
        for(Employee e : staff)
        {
            System.out.println("name="+e.getName()+",salary="+e.getSalary() );
        }
    }
}
