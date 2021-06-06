package JavaSE.TwelveDay.Map接口;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo03遍历entrySet方法 {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<Integer,String>( );
        map.put(1, "abc");
        map.put(2, "bcd");
        map.put(3, "cde");
        //1. 调用map集合方法entrySet()将集合中的映射关系对象,存储到Set集合
        Set<Map.Entry<Integer, String>> set = map.entrySet( );
        //2. 迭代Set集合
        for (Map.Entry<Integer, String> entry : set) {
            //  3. 获取出的Set集合的元素,是映射关系对象
            // it.next 获取的是什么对象,也是Map.Entry对象
            //4. 通过映射关系对象方法 getKet, getValue获取键值对
            Integer key = entry.getKey( );
            String value = entry.getValue( );
            System.out.println(key + "...." + value);
        }
    }
}