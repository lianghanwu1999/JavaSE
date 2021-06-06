package JavaSE.TenDay.包装类;

public class Demo05自动装箱拆箱 {
    //自动装箱,拆箱的 好处: 基本类型和引用类直接运算
    //自动装箱:将int值赋值给Integer对象:基本类型 ->包装成包装类
    //自动拆箱:将Integer对象赋值给int值  :包装对象 ->基本类型数据
    public static void main(String[] args) {
        Function05();
    }
    public static void Function05(){
        //创建Integer对象
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i==j);  //false对象地址不同
        //equals() 方法用于将字符串与指定的对象比较。
        System.out.println(i.equals(j)); // true继承Object重写equals,比较的对象数据
        System.out.println("===============");
        //Integer integer=Integer.valueOf(500)
        //integer=new Integer(500);
        Integer a = 500;   //自动拆箱，将Inter对象直接赋值给int值
        Integer b = 500;   //自动拆箱，将Inter对象直接赋值给int值
        System.out.println(a==b);  //false 对象地址不同
        //equals() 方法用于将字符串与指定的对象比较。
        System.out.println(a.equals(b));  //true

        //数据在byte(-128~127)范围内，JVM不会新new对象
        //数据在byte(-128~127)范围内,short 和int被包装到固定对象中
        Integer aa = 127;  // Integer aa = new Integer(127)
        Integer bb = 127;  //Integer bb = aa;
        System.out.println(aa==bb);
        //equals() 方法用于将字符串与指定的对象比较。
        System.out.println(aa.equals(bb));

    }
}
