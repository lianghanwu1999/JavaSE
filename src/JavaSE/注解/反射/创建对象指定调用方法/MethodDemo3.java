package JavaSE.注解.反射.创建对象指定调用方法;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodDemo3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        //1， 获取Class对象
        Class c = Class.forName("JavaSE.注解.反射.获取并使用构造方法.Person");

        //2,获取构造方法
        //public Person(String name, int age, String address){
        Constructor con = c.getConstructor(String.class, int.class, String.class);
        //3，通过构造方法，创建对象
        Object obj = con.newInstance("小明", 23, "哈尔滨");
        //4，获取指定的方法
        //private void method5(){
        Method m5 = c.getDeclaredMethod("method5", null);
        //5,开启暴力访问
        m5.setAccessible(true);
        //6，执行找到的方法
        m5.invoke(obj, null);
    }
}

