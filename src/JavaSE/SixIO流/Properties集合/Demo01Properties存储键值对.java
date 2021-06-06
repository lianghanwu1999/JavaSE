package JavaSE.EighteenDay.Properties集合;

import java.util.Properties;
import java.util.Set;

//可以和IO对象结合使用,实现数据的持久存储
public class Demo01Properties存储键值对 {
    public static void main(String[] args) {
        function_1();
    }
    public static void function_1(){
        Properties pro = new Properties( );
        pro.setProperty("a","1");
        pro.setProperty("b","2");
        pro.setProperty("c","3");
        System.out.println(pro);

        //以键取值
        String value = pro.getProperty("c");
        System.out.println(value );

        //方法StringPropertyNames，将集合中的键存储到set集合，类似于Map接口的方法keySet
        Set<String> set = pro.stringPropertyNames();
        for (String key:set){
            System.out.println(key+"...."+pro.getProperty(key) );
        }
    }
}
