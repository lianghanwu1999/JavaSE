package JavaSE.SevenDay.关键词.This关键词;

class Person02{
    private int age;
    private String name;

    //给姓名和年龄初始化的构造方法
    Person02(String name,int age){
        //当前需要访问成员变量时，只需要在成员变量前面加上this.即可
        this.name =name;
        this.age = age;
    }

    public void speak(){
        System.out.println("name=" +this.name+",age="+this.age);
    }

    public int equalsAge(Person02 p){
        // 使用当前调用该equalsAge方法对象的age和传递进来p的age进行比较
        // 由于无法确定具体是哪一个对象调用equalsAge方法，这里就可以使用this来代替
        return this.age = p.age;
    }
}
