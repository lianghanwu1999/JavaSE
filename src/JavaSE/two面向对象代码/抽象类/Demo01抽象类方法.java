package JavaSE.FiveDay.抽象类;

//抽象:相当于一个模板，其他可以学它的模板，将东西重写变成现实

/*
抽象方法定义的格式：
   a:public abstract 返回值类型 方法名(参数);
     抽象类定义的格式：
	 abstract class 类名 {

	  }
 */

abstract class Develop{
    //定义方法工作方法,但是怎么工作,说不清楚了,讲不明白
    //就不说, 方法没有主体的方法,必须使用关键字abstract修饰
    //抽象的方法,必须存在于抽象的类中,类也必须用abstract修饰
    //抽象方法定义
    public abstract void work();

    }

/*
 *  定义类,JavaEE的开发人员
 *  继承抽象类Develop,重写抽象的方法
 */

class JavaEE extends Develop{
    //重写父类抽象方法
    //去掉abstract修饰符，加上方法主体
    //将抽象方法，变成现实方法
    public void work(){
        System.out.println("javaEE 工程师在开发B/S 软件");
    }
}

/*
 *  定义Android类,继承开发人员类
 *  重写抽象方法
 */
class Android extends Develop{
    public void work(){
        System.out.println("Android工程师开发手机软件");
    }
}

/*
 *  测试抽象类
 *    创建他的子类的对象,使用子类的对象调用方法
 */

class Demo抽象类方法 {
    public static void main(String[] args) {
        //创建子类对象
//        JavaEE01 ee = new JavaEE01();
        //调用子类对象方法
        Android and  = new Android();
        and.work();  //Android工程师开发手机软件
    }
}
