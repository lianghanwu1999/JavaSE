package JavaSE.ElevenDay.集合.List集合接口;

import java.util.LinkedList;

/*
LinkedList集合的自身特点
        底层采用链表结构,每次查询都要从链头或链尾找起,查询相对数组较慢
        但是删除直接修改元素记录的地址值即可,不要大量移动元素

        LinkedList的索引决定是从链头开始找还是从链尾开始找
        如果该元素小于元素长度一半,从链头开始找起,如果大于元素长度的一半,则从链尾找起
        */
public class Demo03List特有方法 {
//    LinkedList(链表集合)特有方法:获取,添加,删除
    /*
     *  LinkedList 链表集合的特有功能
     *    自身特点: 链表底层实现,查询慢,增删快
     *
     *  子类的特有功能,不能多态调用
     */
    public static void main(String[] args) {
        functionA002();
        functionA003();
        functionA004();
        functionA005();
    }

    /*
     *  E removeFirst() 移除并返回链表的开头
     *  E removeLast() 移除并返回链表的结尾
     */
    //删除
    public static void functionA002(){
        LinkedList<String> link = new LinkedList<String>();
        link.add("1");
        link.add("2");
        link.add("3");
        link.add("4");

        //返回链头
        String first = link.removeFirst();
        //返回链尾
        String last = link.removeLast();
        System.out.println(first);
        System.out.println(last);

        System.out.println(link);

    }
    /*
     * E getFirst() 获取链表的开头
     * E getLast() 获取链表的结尾
     */
    public static void functionA003(){
        LinkedList<String> link = new LinkedList<String>();
        link.add("1");
        link.add("2");
        link.add("3");
        link.add("4");

        if(!link.isEmpty()){  //判断集合中是否有元素，非空。
            //getFirst() 获取链表的开头
            String first = link.getFirst();
            //getLast() 获取链表的结尾
            String last = link.getLast();
            System.out.println(first);
            System.out.println(last);
        }
    }

    public static void functionA004(){
        LinkedList<String> link = new LinkedList<String>();
        //直接添加到链表集合的链尾
        link.addLast("a");
        link.addLast("b");
        link.addLast("c");
        link.addLast("d");

        //直接添加到链表集合的链头:最后一个会排在前一个的前面
        link.addFirst("1");
        link.addFirst("2");
        link.addFirst("3");

        System.out.println(link);
    }
    /*
     *  addFirst(E) 添加到链表的开头
     *  addLast(E) 添加到链表的结尾
     */
    public static void functionA005(){
        LinkedList<String> link = new LinkedList<String>();
        //直接插入链表集合的链尾
        link.addLast("heiMa");
        //正常循序插入元素
        link.add("abc");
        link.add("bcd");

        //直接插入链表集合的链头
        link.addFirst("lhw");
        System.out.println(link);
    }



}
