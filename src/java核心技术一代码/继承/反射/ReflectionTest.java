package java核心技术一代码.继承.反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class ReflectionTest {

    public static void main(String[] args) {
        String name;
        if (args.length >0)
            name =args[0];
        else
        {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter class name(e.g.java.util.Date):");
            name = in.next();
        }
        try
        {
            Class cl =Class.forName(name);
            Class supercl = cl.getSuperclass();
            String modifiers = Modifier.toString(cl.getModifiers());
            if (modifiers.length()>0)
                System.out.println(modifiers+" ");
            System.out.println("class "+name);
            if (supercl != null && supercl != Object.class)
                System.out.println(" extends" + supercl.getName() );
            System.out.println("\n{\n" );
            printConstructor(cl);
            System.out.println( );  //占位
            printConstructor(cl);
            System.out.println( );
            printFields(cl);
            System.out.println("}" );
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();  // printStackTrace 方法打印出栈的轨迹 输出搭配标准错误流
//            System.out.println("异常");
        }
        System.exit(0);    //打印异常

    }

    /**
     * @param cl 参数
     */
    public static void printConstructor(Class cl)
    {
        Class clazz;
        Constructor[] constructors = cl.getDeclaredConstructors();  //获取Class的构造器数组

        for (Constructor c : constructors)
        {
            String name = c.getName();  //获取项目名称
            System.out.println("  " );
            String modifier = Modifier.toString(c.getModifiers());  //获取修饰符类型情况
            if (modifier.length() >0)
                System.out.println(modifier+" ");
            System.out.println(name+"(");

            Class[] paramsTypes = c.getParameterTypes();
            for (int j =0; j<paramsTypes.length;j++)
            {
                if (j>0)
                    System.out.println(paramsTypes[j].getName());
            }
            System.out.println(");");
        }
    }

    public static void printMethod(Class cl)
    {
        Method[] methods = cl.getDeclaredMethods();  //获取类中的所有方法

        for (Method m: methods) {
            Class retType = m.getReturnType();
            String name = m.getName();  //获取类的名称

            System.out.println("  ");
            String modifies = Modifier.toString(m.getModifiers());
            if (modifies.length()>0)
                System.out.println(modifies+" ");
            System.out.println(retType.getName()+" "+name+"(");
            Class[] paramTypes =m.getParameterTypes();
            for (int j =0; j<paramTypes.length;j++)
            {
                if (j>0)
                    System.out.println(" , ");
            }
            System.out.println(");");
        }
    }

    public static void printFields(Class cl)
    {
        Field[] fields =cl.getDeclaredFields();
        for (Field f: fields) {
            Class type = f.getType();
            String name = f.getName();
            System.out.println("  ");
            String modifiers = Modifier.toString(f.getModifiers());
            if (modifiers.length()>0)
                System.out.println(modifiers+"");
            System.out.println(type.getName()+" "+name+";");
        }
    }

}
