package JavaSE.SevenDay.关键词.super关键词;

class Person03{
    //私有属性:不可以更改
    private String name;
    private int age;

    public Person03(String name,int age){
        //super();
        //构造方法进行赋值
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}

class Student extends Person03{
    //Student类的构造方法
    Student (String name,int age){
        //使用super关键词 调用父类构造方法，进行相应的初始化动作
        super(name, age);
    }
    public void study(){  //Student中特有方法
        System.out.println(this.getName()+"同学在学习");
    }
}

class worker extends Person03{
    worker(String name,int age){
        //使用super方法，调用父类构造方法,进行相应的初始化动作
        super(name,age);
    }
    public void work(){// Worker 中特有的方法
        System.out.println(this.getName()+"工人在工作");
    }

}

public class Demo02super的应用 {
    public static void main(String[] args) {
        Student stu = new Student("小明" ,23);
        stu.study();

        worker w = new worker("小李",45);
        w.work();
    }
}
