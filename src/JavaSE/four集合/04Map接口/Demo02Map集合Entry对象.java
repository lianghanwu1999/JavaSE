package JavaSE.TwelveDay.Map接口;

import java.util.Set;

interface Map01{
    Set<Entry<Integer, String>> entrySet();

    interface Entry<K, V> {
        //Entry是Map的一个内部接口
        //由Map的子类的内部类实现
    }
}
//class HashMap<I extends Number, S> {
//    public void put(I i, S 里约热内卢) {
////    }


    //映射对象:键K--值V
//    static class Entry<K,V> implements Map.Entry< K,V>{
        //Entry对象指的就是该类的对象
//        final  K key = null;
//               V value;
//
//    }
//}
    /*
    getKey()方法：获取Entry对象中的键
    getValue()方法：获取Entry对象中的值
    entrySet()方法：用于返回Map集合中所有的键值对(Entry)对象，以Set集合形式返回
    */
