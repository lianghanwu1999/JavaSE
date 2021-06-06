package bookProject.对象参数;

public class ParmaTest {
    public static void main(String[] args) {
        System.out.println("Testing tripleValue:" );
        double percent=10;
        System.out.println("Before: percent=" + percent );
        tripleValue(percent);
        System.out.println("After:percen=" + percent );

        System.out.println("\n Testing tripleSalary:" );
        Employee harry = new Employee("Harry",50000);
        System.out.println("Before:salary=" + harry.getSalary());
        tripleSalary(harry);
        System.out.println("After: salary=" +harry.getSalary() );

        System.out.println("\n Testing swap:" );
        //创建对象a
        Employee a = new Employee("ALice",7000);
        //创建对象b
        Employee b = new Employee("Bob",6000);
        System.out.println("Before: a=" +a .getName() );
        System.out.println("Before: b=" +b .getName() );
        swp(a,b);
        System.out.println("After : a="+a.getName() );
        System.out.println("After : b="+b.getName() );



    }

    public static void tripleValue(double x){
        x =3 * x;
        System.out.println("End of method x=" +x );
    }
    public static void tripleSalary(Employee x)
    {
        x.raiseSalary(200);
        System.out.println("End of ,method:salary="+x.getSalary() );
    }

    public static void swp(Employee x,Employee y)
    {
        Employee temp =x;
        x =y;
        y= temp;
        System.out.println("End of method x=" + x.getName() );
        System.out.println("End of method y=" + y.getName() );
    }
}
