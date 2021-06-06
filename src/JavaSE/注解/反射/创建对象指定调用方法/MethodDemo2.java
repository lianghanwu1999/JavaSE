package JavaSE.注解.反射.创建对象指定调用方法;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
            InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        //获取Class对象
        Class c = Class.forName("JavaSE.注解.反射.获取并使用构造方法.Person");

        //获取构造方法
        Constructor con = c.getConstructor(String.class,int.class,String.class);


        System.out.println(con);

        System.out.println("---------------" );

        //获取指定的方法 创建对象
        Object obj = con.newInstance("小明",23,"哈尔滨");
        //获取指定方法
        //public void method1()  没有返回值没有参数的方法
        Method m1 = c.getMethod("method1", null);

        //public String method4(String name)
        Method m4 = c.getMethod("method4", String.class);

        //执行找到方法
        m1.invoke(obj,null);

        Object result = m4.invoke(obj,"lhw");
        System.out.println("result="+result);

    }
}
