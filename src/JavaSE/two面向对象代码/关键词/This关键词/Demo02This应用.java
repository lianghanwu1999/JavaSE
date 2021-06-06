package JavaSE.SevenDay.关键词.This关键词;

class Person01{
    private int age;
    private String name;

    //给姓名和年龄的初始化的构造方法
    Person01(String name ,int age){
        //当需要访问成员变量时，只需要在成员变量前加this.即可
        this.name  = name;
        this.age = age;
    }
    //普通方法 speak
    public void speak(){
        //调用成员变量时，只需要在成员变量前加this.即可
        System.out.println("name="+this.name+"age="+this.age);
    }
}

public class Demo02This应用 {
    public static void main(String[] args) {
        Person01 p = new Person01("张三",23);
        p.speak();
    }
}
