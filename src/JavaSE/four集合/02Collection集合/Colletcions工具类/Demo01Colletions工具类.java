package JavaSE.TwelveDay.Colletcions工具类;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo01Colletions工具类 {
    /*
     *  集合操作的工具类
     *    Collections
     */
    public static void main(String[] args) {
        function002A();
        function005A();
        function006A();
        function003A();
        function004A();
    }
    /*
     * Collections.shuffle方法
     * 对List集合中的元素,进行随机排列
     */
    public static void function002A(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(5);
        list.add(9);
        list.add(11);
        list.add(8);
        list.add(10);
        list.add(15);
        list.add(20);
        System.out.println(list );
        //调用工具类方法shuffle对集合随机排列
//        Collection.shuffle(list);
        System.out.println(list); 
    }
    /*
     * Collections.binarySearch静态方法
     * 对List集合进行二分搜索,方法参数,传递List集合,传递被查找的元素
     */
    public static void function003A(){
        List<Integer>list = new ArrayList<Integer>();
        list.add(1);
        list.add(5);
        list.add(8);
        list.add(10);
        list.add(15);
        list.add(20);
        //调用工具类静态方法binarySearch
        int index = Collections.binarySearch(list,16);
        System.out.println(index);
    }
    /*
     *  Collections.sort静态方法
     *  对于List集合,进行升序排列
     */
    public static void function004A(){
        //创建List集合
        List<String> list = new ArrayList<String>();
        list.add("ewrew");
        list.add("qewesd");
        list.add("Qwesd");
        list.add("bv");
        list.add("wer");
        System.out.println(list);
        //调用集合工具类的方法sort
        Collections.sort(list);
        System.out.println(list);
    }
    /*
     * Collections.binarySearch静态方法
     * 对List集合进行二分搜索,方法参数,传递List集合,传递被查找的元素
     */
    public static void function005A(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(5);
        list.add(8);
        list.add(10);
        list.add(15);
        list.add(20);
        //调用工具类静态方法binarySearch
        int index = Collections.binarySearch(list,16);
        System.out.println(index);

    }
    /*
     *  Collections.sort静态方法
     *  对于List集合,进行升序排列
     */
    public static void function006A(){
        //创建List集合
        List<String> list = new ArrayList<String>( );
        list.add("ewrew");
        list.add("qwesd");
        list.add("Qwesd");
        list.add("bv");
        list.add("wer");
        System.out.println(list);
        //调用集合工具类法方法
        Collections.sort(list );
        System.out.println(list);
    }
}
