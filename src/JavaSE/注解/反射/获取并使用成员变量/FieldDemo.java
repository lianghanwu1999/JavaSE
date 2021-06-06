package JavaSE.注解.反射.获取并使用成员变量;

import java.lang.reflect.Field;

public class FieldDemo {
    public static void main(String[] args) throws ClassNotFoundException,NoSuchFieldException,SecurityException{
        //获取Class对象
        Class c = Class.forName("JavaSE.注解.反射.获取并使用构造方法.Person");

        //获取多个成员变量
        Field[] fields = c.getDeclaredFields( );
        for (Field field :fields)
        {
            System.out.println(field);
        }
        System.out.println("------------");
        //一个变量
        Field ageField = c.getField("age");
        System.out.println(ageField );

        //private String address
        Field addressesField = c.getDeclaredField("address");
        System.out.println(addressesField);
    }
}
