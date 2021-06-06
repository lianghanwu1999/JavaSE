package JavaSE.FiveDay.继承;

//继承格式: class 子类  extends  父类{}
/*
 * 定义员工类Employee
 */
class Employee{
    String name ; //定义name属性

    public void work(){  //定义员工的工作方法
        System.out.println("尽心尽力地工作");
    }
}

/*
 * 定义研发部员工类Developer 继承 员工类Employee
 * 继承了父类中所有非private修饰的成员变量
 */
//研发类继承员工类:关键词 extends
class Developer extends Employee{
    //定义一个打印name的方法
    public void printName(){
        System.out.println("name= "+name);
    }
}

//主类
public class Demo01继承格式 {
    public static void main(String[] args) {
        Developer d = new Developer(); // 创建一个研发部员工类对象
        //子类对象既可以调用自身的非private修饰的成员,
        // 也可以调用父类的非private修饰的成员
        d.name = "小明";  //为该员工类name 属性进行赋值
        d.printName(); //调用该员工的printName()方法
        d.work();  //调用Developer 类继承来的work()方法
    }







}
