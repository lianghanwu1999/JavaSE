package JavaSE.注解.反射.反射配置;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectTest3 {
    public static void main(String[] args) throws Exception {
        //不改动代码的情况下，创建任意对象，可以执行任意方法
//        1.加载配置文件
//        1.1 创建Properties 对象 获取配置对象
        Properties pro = new Properties();
        //1.2加载配置文件，转换为一个集合
        //1.2.1 获取class目录的配置文件
        ClassLoader classLoader = ReflectTest3.class.getClassLoader();  //getClassLoader 类加载器 获取要配置文件的信息
        InputStream is = classLoader.getResourceAsStream("pro.properties");  //获取配置文件的字节流 路径不能要中文
        pro.load(is);

        //获取配置文件定义的数据
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

        //加载该类进内存
        Class  cls = Class.forName(className);
        //创建对象
        Object obj = cls.newInstance( );
        //获取方法
        Method method = cls.getMethod(methodName);
        //执行方法
        method.invoke(obj);
    }
}
