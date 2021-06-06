package JavaSE.FiveDay.抽象类;

public abstract class Demo04员工继承案例 {
    private String id;  //私有化员工ID
    private String name; //员工姓名

    //获取员工id
    public String getId(){
        return id;
    }

    //设置员工的id值，避免与局部变量混淆
    public void setId(String id){
        this.id = id;
    }

    //获取员工的姓名
    public String getName(){
        return name;
    }
    //设置员工的name值，避免与局部变量混淆
    public void setName(String name){
        this.name = name;
    }

    //工作方法（抽象方法）
    public abstract void work();    //抽象方法需要重写才能在现实使用

    public static void main(String[] args) {
        JavaEE01 ee = new JavaEE01();
        ee.work();
        NetWork nw = new NetWork();
        nw.work();
        Android01 and = new Android01();
        and.work();
    }

}

/*
 *  定义研发员工类
 *    属于员工中的一种, 继承员工类
 *    抽象类Develop 给自己的员工定义自己有的属性
 */


//开发类Develop 完全继承员工类的所有公开属性方法
abstract class Develop01 extends Demo04员工继承案例{

}
/*
 *  描述JavaEE开发工程师类
 *    工号,姓名 工作方法
 *  其他的员工,也具备这些共性,抽取到父类中,自己就不需要定义了
 *  是研发部员工的一种,继承研发部类
 */

//开发JavaEE类 继承开发类
class JavaEE01 extends Develop01{
    //重写父类(Develop01)的父类(Demo04员工继承案例)的抽象方法
    //重写:方法与参数名必须相同
    public void work(){
        //调用父类的get方法，获取name id值
        //调用父类方法要使用super.方法名();
        System.out.println("JavaEE的工程师开发淘宝"+super.getName()+".."+super.getId());
    }
}

/*
 *定义Android工程师 继承 研发部员工类，重写工作方法
 */

class Android01 extends Develop01{
    @Override//用于表示被标注的方法是一个重写方法。(不写也可以，建议写上，提醒是重新方法)
    public void work() {
        System.out.println("员工为 "+getId()+"的" +getName()+"员工，正在开发...");
    }
}

/*
 *   定义维护员工类,属于员工中的一种
 *   继承员工类
 *   抽象类Maintainer 给自己的员工定义自己有的属性
 */

//抽象类 Maintainer完全继承员工类的公开方法
abstract class Maintainer extends Demo04员工继承案例{

}

/*
 *  描述的是网络维护工程师
 *  属于维护部的员工,继承维护部类
 */

class NetWork extends Maintainer{
    public void work(){
        System.out.println("网络工程师在检查网络是否畅通"+super.getName()+"...."+super.getId());
    }
}

/*
 *定义Hardware硬件维护工程师 继承 维护部员工类，重写工作方法
 */
//Hardware 继承 维护部员工类
class Hardware extends Maintainer{
    //重写工作方法
    @Override  //用于表示被标注的方法是一个重写方法。(不写也可以，建议写上，提醒是重新方法)
    public void work() {
        System.out.println("员工号为"+getId()+"的" +getName()+"员工，正在修复打印机");
    }
}



