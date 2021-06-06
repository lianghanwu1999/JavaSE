package JavaSE.EightDay.内部类;

/*
//格式
class 外部类 {
    修饰符 class 内部类 {
        //其他代码
    }
访问方式:外部类名.内部类名 变量名 = new 外部类名().new 内部类名();

 */

public class Demo01成员内部类格式 {  //外部类，身体

    private boolean life = true;  //生命状态
    //内部类
    public class Heart {
        public void jump(){
            System.out.println("心脏扑通扑通的跳");
            System.out.println("生命状态"+life);  //访问外部类成员变量
        }
    }
    //访问内部类
    public static void main(String[] args) {
        //创建内部类对象
        //外部类名.内部类名 变量名 = new 外部类名().new 内部类名();
        Demo01成员内部类格式.Heart bh =  new Demo01成员内部类格式().new Heart();
        //调用内部类中的方法
        bh.jump();
    }
}
