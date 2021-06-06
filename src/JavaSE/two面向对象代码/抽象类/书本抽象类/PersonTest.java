package JavaSE.two面向对象代码.抽象类.书本抽象类;

public class PersonTest {
    public static void main(String[] args) {
        Person[] people = new Person[2];

        //创建people对象
        people[0] = new Employee("Harry Hacker",50000,1989,10,1);
        people[1] = new Employee("Maria Morris",5000,1999,11,2);

        for (Person p : people)
            System.out.println(p.getName()+","+p.getDescription() );
    }
}
