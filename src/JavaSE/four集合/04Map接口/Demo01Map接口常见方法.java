package JavaSE.TwelveDay.Map接口;

import java.util.HashMap;
import java.util.Map;

/*
 *  Map接口中的常用方法
 *    使用Map接口的实现类 HashMap
 */
public class Demo01Map接口常见方法 {
    public static void main(String[] args) {
        function01A();
    }
    public static void function01A(){
        Map<Integer,String>map = new HashMap<Integer, String>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        System.out.println(map);

        String value = map.remove(33);
        System.out.println(value );
        System.out.println(map);
    }
    /*
     * 通过键对象,获取值对象
     * V get(K)
     * 如果集合中没有这个键,返回null
     */
    public static void function02A(){
        //创建集合对象,作为键的对象整数,值的对象存储字符串
        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        System.out.println(map);

        String vlaue = map.get(4);
        System.out.println(vlaue);
    }
    /*
     *  将键值对存储到集合中
     *  V put(K,V) K 作为键的对象, V作为值的对象
     *  存储的是重复的键,将原有的值,覆盖
     *  返回值一般情况下返回null,
     *  存储重复键的时候,返回被覆盖之前的值
     */

    public static void function03A(){
        //创建集合对象,HashMap,存储对象,键是字符串,值是整数
        Map<String ,Integer> map = new HashMap<String, Integer>();
        //put方法，存储数据到集合中，通过键的存储到特定位置上
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);

        System.out.println(map);
    }

}
