package JavaSE.ElevenDay.集合.Collection集合;

import java.util.ArrayList;
import java.util.Collection;

/*
 *  Collection接口中的方法
 *  是集合中所有实现类必须拥有的方法
 *  使用Collection接口的实现类,程序的演示
 *  ArrayList implements List
 *  List extends Collection
 *  方法的执行,都是实现的重写
 */
public class Demo02Collection方法 {
    public static void main(String[] args) {
        function_01();
        function_02();
        function_03();
    }
    /*  Collection接口方法
     *  Object[] toArray() 集合中的元素,转成一个数组中的元素, 集合转成数组
     *  返回是一个存储对象的数组, 数组存储的数据类型是Object
     */

    private static void function_01(){
        Collection<String> Coll = new ArrayList<String>();
        Coll.add("abc");
        Coll.add("itcast");
        Coll.add("itheima");
        Coll.add("money");
        Coll.add("123");

        Object[] objs = Coll.toArray();
        for (int i=0;i<objs.length;i++){
            System.out.println(objs[i]);
        }
    }
    /*
     * Collection接口方法
     * boolean contains(Object o) 判断对象是否存在于集合中,对象存在返回true
     * 方法参数是Object类型
     */
    private static void function_02(){
        Collection<String>Coll = new ArrayList<String>();
        Coll.add("abc");
        Coll.add("itCast");
        Coll.add("iteIma");
        Coll.add("money");
        Coll.add("123");

        //返回值：在集合中是否包含这个ItCast ，T/F
        boolean b = Coll.contains("itCast");
        System.out.println(b);
    }
    /*
     * Collection接口的方法
     * void clear() 清空集合中的所有元素
     * 集合容器本身依然存在
     */
    public static void function_03(){
        //接口多态法方式调用:多态方法,ArrayList对象Coll 继承父类Collection
        Collection<String>Coll = new ArrayList<String>();
        Coll.add("abc");
        Coll.add("bcd");
        System.out.println(Coll);

        Coll.clear();  //清空集合元素
        System.out.println(Coll);
    }
}
