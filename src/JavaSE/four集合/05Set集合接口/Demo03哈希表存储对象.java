package JavaSE.ElevenDay.集合.Set集合接口;

import java.util.HashSet;

public class Demo03哈希表存储对象 {
    /*
     *  HashSet集合的自身特点:
     *    底层数据结构,哈希表
     *    存储,取出都比较快
     *    线程不安全,运行速度快
     */
    public static void main(String[] args) {
        //将Person 对象中的姓名 年龄，相同数据，看作同一个对象
        //判断对象是否重复,依赖对象自己的方法 hashCode,equals
        HashSet<Person001> setPerson = new HashSet<Person001>();
        setPerson.add(new Person001("a",11));
        setPerson.add(new Person001("b",10));
        setPerson.add(new Person001("b",10));
        setPerson.add(new Person001("c",25));
        setPerson.add(new Person001("d",19));
        setPerson.add(new Person001("e",17));
        System.out.println(setPerson);
    }
}
class Person001{

    private String name;
    private int age;

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
        //super();
        this.name = name;
        this.age = age;
    }
    public Person001(String a, int i){}
    public String toString(){
        return name+" .." +age;
    }
}
