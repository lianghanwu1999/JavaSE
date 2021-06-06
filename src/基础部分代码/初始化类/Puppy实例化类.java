package 基础部分代码.初始化类;   //基于文件夹

public class Puppy实例化类 {    //创建一个puppy实例向描述class的初始化
    int puppyAge;
    //创建Puppy方法
    public Puppy实例化类(String name){
        //这是一个构造一个仅有一个参数：name
        //输出参数
        System.out.println("小狗名字是：" +name);
    }
//    创建setAet方法
    public void setAge(int age){
        puppyAge =age;
    }

//    创建getAge方法
    public int getAge(){
        System.out.println("小狗的年龄为：" +puppyAge);
        return puppyAge;
    }

//    程序入口
    public static void main(String[] args) {

        //创建(实例化)对象:  对象类型(方法名=类名) 对象名称（myPuppy）
        Puppy实例化类 myPuppy = new Puppy实例化类("tommy");  //Puppy对象类型  myPuppy对象名称

        //调用对象
        //通过方法来设定age
        myPuppy.setAge(2);
        //调用另外一个方法获取age
        myPuppy.getAge();
        //你也可以像下面这样访问成员变量
        System.out.println("变量值：" +myPuppy.puppyAge);
    }
}
