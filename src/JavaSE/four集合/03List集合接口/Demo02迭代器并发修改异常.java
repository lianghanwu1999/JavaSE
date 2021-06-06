package JavaSE.ElevenDay.集合.List集合接口;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo02迭代器并发修改异常 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("abc1");
        list.add("abc2");
        list.add("abc3");
        list.add("abc4");

        //对集合使用迭代器进行获取，获取时候判断集合是否存在"abc3"对象
        //如果有，添加一个元素"ABC3"
        Iterator<String> it = list.iterator();

        //在判断是否继续
        while (it.hasNext()){
            String s = it.next();
            //对获取出元素s,进行判断，是不是有"abc3"
            if (s.equals("abc3")){
                //如果是向前添加元素
                list.add("ABC3");
            }
            //打印该元素
            System.out.println(s);
        }
    }
}
