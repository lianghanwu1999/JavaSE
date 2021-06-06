package JavaSE.注解.反射.创建对象指定调用方法;

import java.lang.reflect.Method;

public class MethodDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException,SecurityException {
        //获取Class对象
        Class c = Class.forName("JavaSE.注解.反射.获取并使用构造方法.Person");

        //获取多个方法
        Method[] m = c.getDeclaredMethods( );   //获得多个方法
        for (Method ms : m){                    //打印方法
            System.out.println(ms);
        }

        System.out.println("------------" );
        //获取一个方法
        //public void method1()
        Method method = c.getMethod("method1", null);
        System.out.println(method);

        //public String method4(String name)
        Method method4 = c.getMethod("method4", String.class);
        System.out.println(method);

        //私有方法
        method = c.getDeclaredMethod("method5",null);
        System.out.println(method );

    }
}
