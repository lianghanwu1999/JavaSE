package JavaSE.TwelveDay.集合嵌套;

import java.util.HashMap;

public class Demo01集合嵌套 {

    public static void main(String[] args) {
        //定义基础班集合
        HashMap<String,String> javaSe = new HashMap<String, String>(  );
        //定义就业班集合
        HashMap<String,String> javaee = new HashMap<String, String>();
        //向班级集合中，储存学生信息
        javaSe.put("001","张三");
        javaee.put("002","李四");

        javaee.put("001","王五");
        javaSe.put("002","赵五");
        //定义传智播客集合容器，键时班级名字，值是两个班级容器
        HashMap<String,HashMap<String,String>> czbk =
                new HashMap<String,HashMap<String,String>>( );
        czbk.put("基础班",javaSe);
        czbk.put("就业班",javaee);

//        keySet(czbk);
        System.out.println(czbk );

    }
}
