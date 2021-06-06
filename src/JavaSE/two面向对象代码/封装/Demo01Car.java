package JavaSE.FourDay.面向对象;
//描述小汽车类
class Car {
		String color;
		int number;
		void run() {
			System.out.println(color + ":" + number);
		 }
}
public class Demo01Car {
    //测试汽车类
    //创见对象的格式
    //* a: 类名 变量名 = new 类名();
    public static void main(String[] args) {
        //创建Car对象，给对象起名字
        Car c = new Car();    //c是类类型的变量,c指向了一个具体的Car类型的对象
        // 2,通过已有的对象调用该对象的功能。格式：对象.对象成员;
        // 3,可以该对象的属性赋值
        c.color = "red";
        c.number = 4;
        c.run();
    }
}
