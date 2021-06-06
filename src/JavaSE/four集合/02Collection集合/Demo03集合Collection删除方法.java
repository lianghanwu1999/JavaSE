package JavaSE.ElevenDay.集合.Collection集合;

import java.util.ArrayList;
import java.util.Collection;

public class Demo03集合Collection删除方法 {
    /*
     * Collection接口方法
     * boolean remove(Object o)移除集合中指定的元素
     */
    public static void main(String[] args) {
        function_003();
    }

    private static void function_003(){
        Collection<String>coll = new ArrayList<String>();
        coll.add("abc");
        coll.add("money");
        coll.add("itCast");
        coll.add("ITheIma");
        coll.add("123");
        System.out.println(coll);

        boolean b = coll.remove("money");
        System.out.println(b);
        System.out.println(coll);
    }
}
