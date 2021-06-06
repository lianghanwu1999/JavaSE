package JavaSE.TwelveDay.Map接口;

import java.util.HashMap;

public class Demo05Hashtable {
    /*
     *  Map接口实现类 Hashtable
     *  底层数据结果哈希表,特点和HashMap是一样的
     *  Hashtable 线程安全集合,运行速度慢
     *  HashMap 线程不安全的集合,运行速度快
     *
     *  Hashtable命运和Vector是一样的,从JDK1.2开始,被更先进的HashMap取代
     *
     *  HashMap 允许存储null值,null键
     *  Hashtable 不允许存储null值,null键
     *
     *  Hashtable他的孩子,子类 Properties 依然活跃在开发舞台
     */
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<String,String>();
        map.put(null,null);
        System.out.println(map);
    }
}
