package JavaSE.SevenDay.关键词.This关键词;

class Person{
    private int age;
    private String name;

    //无参数的构造方法
    Person(){

    }
    //给姓名初始化的构造方法
    Person(String nm){
        name = nm;
    }

    Person(String nm,int a){
        this(nm) ;  //使用this关键词，调用其他方法的值
        age = a;   //给age参数，赋值

    }
    public void printf(){
    System.out.println("我是"+name);
    }
}


public class Demo01this调用方法 {
    public static void main(String[] args) {
        //创建构造的方法，并在参数列表赋值
        Person p = new Person("张三" ,23);
        p.printf();
    }
}
