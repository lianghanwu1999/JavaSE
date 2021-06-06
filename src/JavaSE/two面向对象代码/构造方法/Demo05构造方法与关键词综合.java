package JavaSE.SevenDay.构造方法;

//class Employee{
//    String name ; //定义name属性
//
//    public void work(){  //定义员工的工作方法
//        System.out.println("尽心尽力地工作");
//    }
//}

abstract class Employee {
//    私有化属性设置:变量封闭在了类内部，这样就提高了数据的安全性
    private String id;  //员工编号
    private String name;  //员工姓名


    //空参数构造方法
    public Employee() {
        //直接调用父类无参构造方法
        super();    //继承中默认调用父类无参构造方法
    }

    //参数构造方法
    public Employee(String id, String name) {
        //直接调用父类无参构造方法
        super();   //public Employee()  //继承中默认调用父类无参构造方法
        this.id = id;
        this.name = name;
    }
    //获取Id值:获取私有属性，通过return 进行一个返回值的动作
    public String getId(){
        return id;
    }
    //将Id进行设置(赋值)
    public void setId(String id){
        this.id = id;
    }
    //获取name值 获取私有属性，通过return 进行一个返回值的动作
    public String getName(){
        return name;
    }
    //将name进行设置(赋值)
    public void setName(String name){
        this.name = name;
    }

    //工作方法(抽象方法)
    public abstract void work();

    public static class Developer {
    }
}

//定义研发部员工类Developer 继承 员工类Employee
abstract class Developer extends Employee {
    //空参数构造方法
    public Developer(){
        //调用父类Employee的无参构造方法
        super();
    }
    //有参数构造方法
    public Developer(String id, String name){
        //调用父类Employee的有参构造方法
        super(id,name);
    }
}

//定义维护部员工类Maintainer 继承 员工类Employee
abstract class Maintainer extends Employee{
    //空参数构造方法
    public Maintainer(){
        //调用父类Employee的构造方法
        super();
    }
    //参数构造方法
    public Maintainer(String id ,String name){
        //调用父类Employee的构造方法
        super(id,name);
    }
}

//定义JavaEE工程师 继承 研发部员工类，重写工作方法
class JavaEE extends Developer {
    //空参数构造方法
    public JavaEE(){
        super();   //调用无参数构造方法
    }
    //有参数构造方法
    public JavaEE(String id,String name){
        super(id,name);
    }

    @Override   //重写工作方法
    public void work() {
        System.out.println("员工号为"+getId()+"的"+getName()+"员工，正在研发淘宝手机客户端软件");

    }
}

//定义Hardware硬件维护工程师 继承 维护部员工类，重写工作方法
class Hardware extends Maintainer{
    //空参数构造方法
    public Hardware(){
        super();
    }
    //有参数构造方法
    public Hardware(String id,String name){
        super(id,name);
    }

    @Override   //重写工作方法
    public void work() {
        System.out.println("员工号为 " + getId() + " 的 " + getName() + " 员工，正在修复打印机");
    }
}
public class Demo05构造方法与关键词综合 {
    public static void main(String[] args) {
        //创建JavaEE工程员工对象，该员工的编号是0000015，员工是姓名小明
        JavaEE ee = new JavaEE("0000015","小明");
        //调用该员工的工作方法
        ee.work();
    }
}
