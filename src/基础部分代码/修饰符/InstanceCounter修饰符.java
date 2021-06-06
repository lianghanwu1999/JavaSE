package 基础部分代码.修饰符;

public class InstanceCounter修饰符 {
    //私有变量修饰符:private : 在同一类内可见
    private static int numInstances = 0;

    //保护变量:对同一包内的类和所有子类可见
    protected static int getCount() {
        return numInstances;
    }

    //私有变量修饰符:private : 在同一类内可见
    private static void addInstance() {
        numInstances++;
    }

    //默认修饰符:在同一包内可见，不使用任何修饰符
    InstanceCounter修饰符() {
        InstanceCounter修饰符.addInstance();
    }

    public static void main(String[] args) {
        System.out.println("Starting with " + InstanceCounter修饰符.getCount() +
                " instances");   //java使用+号连接，""里面是字符串，没有的是函数变量
        for (int i = 0; i < 500; ++i) {
            new InstanceCounter修饰符();  //numInstances ++
        }
        System.out.println("Created " + InstanceCounter修饰符.getCount() + " instances");
    }
}
/*
final 方法
public class Test{
        //final变量
        final int value = 10;
        public static final int BOXWIDTH = 6;
        //final方法:变量一旦赋值后，不能被重新赋值,必须显式指定初始值。
        static final String TITLE = "Manager";

        public void changeValue(){
            value = 12;
     }
     }
 */
/*

 */
