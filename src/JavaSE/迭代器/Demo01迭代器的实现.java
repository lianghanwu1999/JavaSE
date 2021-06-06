package JavaSE.ElevenDay.迭代器;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo01迭代器的实现 {
    //迭代器:获取集合中的元素方式
    /*
    Collection集合元素的通用获取方式：在取元素之前先要判断集合中有没有元素，
    如果有，就把这个元素取出来，继续在判断，如果还有就再取出出来。一直把集合中的所有元素全部取出。
    这种取出方式专业术语称为迭代
    */
    public static void main(String[] args) {
        //创建存储String类型的集合对象
        Collection<String> coll = new ArrayList<String>();
        coll.add("abc1");
        coll.add("abc2");
        coll.add("abc3");
        coll.add("abc4");

        //迭代器，对集合ArrayList中的元素进行取出
        //调用集合的方法iterator()获取出，Iterator接口的实现类对象
        Iterator<String> it = coll.iterator();
        //接口实现类对象，调用方法hasNext()判断集合中是否有元素
        boolean b = it.hasNext();
        //如果有返回true
        System.out.println(b);
        //接口的实现类对象。调用方法next()取出集合中的元素
        String s = it.next();   // next() 取出集合中的下一个元素
        System.out.println(s);

        //迭代是反复内容，使用循环实现，循环条件，集合中没有元素，hasNext()返回了false
        while (it.hasNext()){
            String sa = it.next();
            System.out.println(sa);
        }
    }

}
