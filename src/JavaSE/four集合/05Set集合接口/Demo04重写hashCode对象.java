package JavaSE.ElevenDay.集合.Set集合接口;

import java.util.HashSet;

public class Demo04重写hashCode对象 {
    public static void main(String[] args) {
        //将person对象中姓名，年龄，相同数据，看作同一个对象
        //判断对象是否重复，依赖对象自己的方法，hashCode，equals
        HashSet<Person> setPerson = new HashSet<Person>();
        setPerson.add(new Person("a",11));
        setPerson.add(new Person("b",10));
        setPerson.add(new Person("b",10));
        setPerson.add(new Person("c",25));
        setPerson.add(new Person("c",19));
        setPerson.add(new Person("e",17));
        System.out.println(setPerson);
    }
}

class Person{
    private String name;
    private int age;
    /*
     *  没有做重写父类,每次运行结果都是不同整数
     *  如果子类重写父类的方法,哈希值,自定义的
     *  存储到HashSet集合的依据
     *
     *  尽可能让不同的属性值产生不同的哈希值,这样就不用再调用equals方法去比较属性
     *
     */
    public int hashCode(){
        return name.hashCode()+age*55;
    }
    //方法equals重写父类，保证和父类相同
    //public boolean equals(Object obj){}
    public boolean equals (Object obj){
        if (this == obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        //obj的接口instanceof 为Person
        if (obj instanceof Person){
            //抽象方法
            Person p =(Person)obj;
            return name.equals(p.name) && age == p.age;
        }
        return false;
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

    public Person(String name,int age){
        super();
        this.name = name;
        this.age = age;
    }
    //无参构造方法
    public Person(){}
    public String toString(){
        return name+".."+age;
    }

}