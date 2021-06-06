package JavaSE.two面向对象代码.抽象类.书本抽象类;

public  abstract class Person {  //创建一个抽象类 Person
    public abstract String getDescription();   //创建一个抽象方法 getDescription()  相当于模板，供子类模仿使用
    private String name;

    public Person(String name)    //方法1
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
