package JavaSE.ElevenDay.集合.Set集合接口;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo01Set集合接口 {
    /*
     *  Set接口,特点不重复元素,没索引
     *
     *  Set接口的实现类,HashSet (哈希表)
     *  特点: 无序集合,存储和取出的顺序不同,没有索引,不存储重复元素
     *  代码的编写上,和ArrayList完全一致
     */
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("cn");
        set.add("heiMa");
        set.add("java");
//        set.add("java");   //set集合，不重复，无序
        set.add("lhw");

        //迭代
        //调用集合的方法iterator()获取出集合元素
        Iterator<String> it = set.iterator();
        while (it.hasNext()){  //设置默认集合有元素，不为空
            System.out.println(it.next());//获取下一个元素

        }
        System.out.println("==============");

        for (String s:set){  //遍历名为set的集合
            System.out.println(s);
        }
    }

}
