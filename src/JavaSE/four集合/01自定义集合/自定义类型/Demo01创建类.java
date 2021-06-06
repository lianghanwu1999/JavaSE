package JavaSE.TwoDay.自定义类型;

public class Demo01创建类 {
//    类的练习
/*
	    电饭锅，包含属性（品牌、容量大小、颜色等）
		定义类,描述事物,电饭锅
		  属性: 品牌,大小 ,颜色

		定义类,类名字,电饭锅
		类的范围,定义三个属性
*/
    public static class DianFanGuo{
    //定义三个属性
    String brand;
    double size;
    String color;
}
    /*
	   汽车，包含属性（品牌、排量、类型等）
	   定义类,类名 Car
	     属性 品牌 排量 类型
	 */
    public static class Car{    //默认为私有
        //定义汽车三个属性
        String brand;
        double paiLing;
        String type;
    }
    /*
	   学生，包含属性（姓名，年龄，性别等）
	   定义类,类名Student
	     三个属性: 姓名,年龄,性别 (char)
	*/
    public static class Student{
        //定义三个属性
        //String 字符串 用 ""
        String name;
        int age;
        //char 字符 用 ''
        char sex;
    }

    public static void main(String[] args) {
       /*
	   定义的测试类
	   同时测试,电饭锅,汽车,学生
	*/
    //创建电饭锅引用类型
    //创建类型变量 : 变量类型 变量名 = new 变量类型
    DianFanGuo dfg = new DianFanGuo();

    //调用属性
    dfg.brand  = "特斯拉";
    dfg.color = "红色";
    dfg.size = 30;

    System.out.println(dfg.brand+" " + dfg.color+" " +dfg.size);

    //创建汽车引用类型
    Car c = new Car();

    //调用属性
    c.brand = "压力";
    c.type = "拖拉机";
    c.paiLing = 0.5;

    System.out.println(c.brand+" " + c.type+" " +c.paiLing);

    //创建学生引用类型
    Student stu = new Student();

    //调用属性
    stu.name = "张三";
    stu.age = 20;
    stu.sex = '男';

    System.out.println(stu.name +" " +stu.age+" " + stu.sex);

    }
}
