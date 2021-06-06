package JavaSE.ElevenDay.集合.Collection集合;

import java.util.ArrayList;

public class Demo01集合回顾 {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<Integer>();
        //给集合赋值
        list.add(111);
        list.add(222);
        list.add(333);
        list.add(444);
        list.add(555);
        //遍历集合，打印集合
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }

}
