package JavaSE.ElevenDay.集合.List集合接口;

import java.util.ArrayList;
import java.util.List;

public class Demo01List接口特有方法 {
    //List是循序集合:元素按循序存储
    //List接口子类:
    /*ArrayList集合
    LinkedList集合*/
    public static void main(String[] args) {
        functionA001();
    }
    /*
    add(Object e)：向集合末尾处，添加指定的元素
    add(int index, Object e)   向集合指定索引处，添加指定的元素，原有元素依次后移
     *  add(int index, E)
     *  将元素插入到列表的指定索引上
     *  带有索引的操作,防止越界问题
     *  java.lang.IndexOutOfBoundsException
     *     ArrayIndexOutOfBoundsException
     *     StringIndexOutOfBoundsException
     */
    public static void functionA001(){
        List<String> list = new ArrayList<String>();
        //添加元素
        list.add("abc1");
        list.add("abc2");
        list.add("abc3");
        list.add("abc4");
        System.out.println(list);

        //List接口的特有方法:向集合指定索引处，添加指定的元素，原有元素依次后移
        list.add(1,"itCast");
        System.out.println(list);

        //删除元素
        //将指定索引处的元素，从集合中删除，返回值为被删除的元素,String类型变量b接收
        String b = list.remove(0);
        System.out.println("被删除的元素:"+b);
        //再打印list值
        System.out.println(list);

        //通过索引值替换元素
        //将指定索引处的元素，替换成指定的元素，返回值为替换前的元素
        String i = list.set(2,"abc");
        System.out.println("被替换的元素:"+i);
        System.out.println(list);

        //通过索引查找元素
        String l = list.get(2);
        System.out.println("被查找的元素:"+l);
        System.out.println(list);
    }
}
