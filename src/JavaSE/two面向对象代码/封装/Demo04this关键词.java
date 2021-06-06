package JavaSE.FourDay.面向对象;

public class Demo04this关键词 {
    /* 当类中存在成员变量和局部变量同名的时候为了区分，
    就需要使用this关键字,一般配合set方法使用。
    */
    private int age;
    private String name;

    public int getAge(){

        return age;
    }

    //获取setAge
    public void setAge(int age){

        this.age =age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public void speak(){
        System.out.println("name=" + this.name +",age" +this.age);
    }

    //判断是否为同龄人
    public boolean equalsAge(Demo04this关键词 p){
        //使用当前调用该equalsAge方法的Age和传递进来p的age进行比较
        //由于无法确定具体是那个一个对象调用equalsAge方法，之类就可以使用this来代替
        /*
        if(this.age == p.age) {
            return true;
        }
         return false;
         */
        speak();
        return this.age == p.age;

    }
}
