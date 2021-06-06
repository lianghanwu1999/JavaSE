package JavaSE.EightDay.匿名对象;

//匿名内部类案例
abstract class Animal{
    public abstract void eat();
    public abstract void sleep();
}
/*
测试代码
 *    new Animal(){
			public void eat(){
				System.out.println("在吃饭");
			}
			public void sleep(){
				System.out.println("在睡觉");
			}
		 };
	以上代码,就是Animal的子类的对象
	多态性, 父类引用 = 子类的对象

 */

public class Demo02匿名对象02 {
    public static void main(String[] args) {
        Animal a = new Animal() {
            @Override  //重写eat
            public void eat() {
                System.out.println("在吃饭");
            }

            @Override  //重写sleep
            public void sleep() {
                System.out.println("在睡觉");

            }
        };
        a.eat();
        a.sleep();
    }
}
