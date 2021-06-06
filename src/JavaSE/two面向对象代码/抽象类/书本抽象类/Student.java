package JavaSE.two面向对象代码.抽象类.书本抽象类;

public class Student extends Person {
    private String major;

    //学生方法
    public Student(String name,String major){
        super(name);   //继承父类的name成员变量
        this.major = major;
    }

    public String getDescription()
    {
        return "a Student majoring in"+ major;
    }

}
