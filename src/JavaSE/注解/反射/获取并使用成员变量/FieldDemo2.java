package JavaSE.注解.反射.获取并使用成员变量;

import sun.management.counter.perf.InstrumentationException;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class FieldDemo2 {
    public static void main(String[] args) throws ClassNotFoundException,NoSuchMethodException,
            SecurityException, InstrumentationException,IllegalAccessException,IllegalArgumentException,
            InvocationTargetException,NoSuchFieldException {
        //1.获取Class对象
        Class c = Class.forName("JavaSE.注解.反射.获取并使用构造方法.Person");

        //获取构造方法
        //public Person(String name)
        Constructor con = c.getConstructor(String.class);

        //3.通过构造方法，创建对象
        //public String name;
        Object obj = null;
        try {
            obj = con.newInstance("小明");
        } catch (InstantiationException e) {
            e.printStackTrace( );
        }

        //获取指定成员变量
        //public String name;
        Field nameField = c.getField("name");

        //public String age;
        Field ageField = c.getField("age");

        //private String address;
        Field addressField = c.getDeclaredField("address");
        addressField.setAccessible(true);   //取消java语言的访问机制

        //5，通过方法，给指定对象的指定成员变量赋值或者获取值
        System.out.println("name="+nameField.get(obj) );
        System.out.println("age =" + ageField.get(obj) );
        System.out.println("address=" + addressField.get(obj));

        //赋值
        ageField.set(obj,23);
        addressField.set(obj,"凯利广场");

        System.out.println("-------------" );
        System.out.println("name =" + nameField.get(obj));
        System.out.println("age= "+ageField.get(obj) );
        System.out.println("address ="+ addressField.get(obj));
    }
}
