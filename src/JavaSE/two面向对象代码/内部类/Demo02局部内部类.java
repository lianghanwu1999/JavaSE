package JavaSE.EightDay.内部类;

/*
class 外部类 {
	修饰符 返回值类型 方法名(参数) {
    class 内部类 {
            //其他代码
        }
    }
}

访问方式
	在外部类方法中，创建内部类对象，进行访问
	创建内部类对象，然后再创建外部对象调用所在内部对象的类
 */

public class Demo02局部内部类 {
    public void puffBall(){
        class Ball{
            public void puff(){
                System.out.println("气球膨胀了");
            }
        }
        //创建内部类对象，调用puff方法
        new Ball().puff();
    }
    //访问内部类
    public static void main(String[] args) {
        //创建外部类对象
        Demo02局部内部类 p = new Demo02局部内部类();
        //调用外部类中的puffBall方法
        p.puffBall();
    }
}
