package JavaSE.注解.反射.获取并使用构造方法;

import java.lang.reflect.Constructor;

public class ReflectDemo {
    public static void main(String[] args)  throws ClassNotFoundException,NoSuchMethodException, SecurityException{

        //获取Class对象
        Class c = Class.forName("JavaSE.注解.反射.获取并使用构造方法.Person");
        //获取所有构造类方法
        Constructor[] cons = c.getDeclaredConstructors( );

        for (Constructor con : cons){
            System.out.println(con);
        }

        System.out.println("-------------" );
        //分步获取构造方法
        //获取一个构造方法 public Person()
        Constructor con1 = c.getConstructor(null);
        System.out.println(con1);

//        获取第二个构造方法 public Person(String name)
        Constructor con2 = c.getConstructor(String.class);
        System.out.println(con2);

        //第三个构造方法 private Person(String name,int age)
        Constructor con3 = c.getDeclaredConstructor(String.class,int.class);
        System.out.println(con3);

        //第四个构造方法 public Person(String name,int age,String address)
        Constructor con4 = c.getDeclaredConstructor(String.class,int.class,String.class);
        System.out.println(con4);

    }
}
