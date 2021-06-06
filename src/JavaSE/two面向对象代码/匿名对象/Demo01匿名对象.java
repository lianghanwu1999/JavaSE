package JavaSE.EightDay.匿名对象;

//匿名对象是指创建对象时，只有创建对象的语句，却没有把对象地址值赋值给某个变量

class Person{
    public void eat(){
        System.out.println();
    }
}

////创建一个普通对象
//Person p = new Person();
////创建一个匿名对象
//new Person();
//
//
////创建匿名对象直接使用，没有变量名
//new Person().eat();  //eat方法被一个由Person创造出来的对象调用了
//
////匿名对象在没有指定其引用变量时，只能使用一次
//new Person().eat();   //创建一个匿名对象，调用eat方法
//new Person().eat();   //想再次调用eat方法，重新创建一个匿名对象

class Demo{
    public static Person getPerson(){
        //普通方式
//        Person p = new Person();
//        return p;

        //匿名对象作为方法返回值
        return new Person();
    }
//    重载method方法
    public static void method(Person p){ }
}

public class Demo01匿名对象 {
    public static void main(String[] args) {
        //调用getPerson 方法，得到一个Person对象
        Person person = Demo.getPerson();

        //调用method方法
        Demo.method(person);
        //匿名对象作为方法接收的参数
        Demo.method(new Person());
    }
}
