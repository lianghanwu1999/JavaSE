package JavaSE.TwelveDay.集合嵌套;

import java.util.HashMap;

public class Demo03entrySet集合遍历 {
    public static void main(String[] args) {
        //定义基础班集合
        HashMap<String,String> javaSE = new HashMap<String, String>();
        //定义就业班集合
        HashMap<String,String> javaEE = new HashMap<String, String>();
        //向班级集合中，存储学生的信息
        javaSE.put("001","张三");
        javaSE.put("002","李四");

        javaEE.put("001","王五");
        javaEE.put("002","赵六");

        //定义传智播客集合容器，键是班级名字，值是两个班级容器
        HashMap<String,HashMap<String,String>>czbk =
                new HashMap<String, HashMap<String, String>>();
        czbk.put("基础班",javaSE);
        czbk.put("就业班",javaEE);

//        entrySet(czbk, classNameIt);
    }

    /*public static void entrySet(HashMap<String, HashMap<String, String>> czbk, LexicalContext.NodeIterator<LexicalContextNode> classNameIt){
        //调用czbk集合方法entrySet方法，将czbk集合的键值对对象，存储到Set集合
        Set<Map.Entry<String,HashMap<String,String>>> classNameSet = czbk.entrySet();
        //迭代器迭代Set集合
        while (classNameIt.hasNext()){
            //classNameIt。next方法 取出的是czbk 集合的键值对关系
            Map.Entry<String,HashMap<String,String>>classNameEntry = classNameIt.next();
            //classNameEntry 方法 getKey ,getValue
            String classNamekey = classNameEntry.getKey();
            //获取值，值是一个Map集合
            HashMap<String,String> classMap = classNameEntry.getValue();
            //调用班级集合classMap方法entrySet ,键值对关系对象存储Set集合
            Set<Map.Entry<String,String>> studentIt = studentSet.itrartor();
            String nameValue = studentEntry.getValue();
            System.out.println(classNamekey+".."+numkey+".."+nameValue);
        }
    }*/
//    System.out.println("=================");

  /*  for(Map.Entry<String,HashMap<String,String>> me :czbk.entrySet()){
        String classNameKey = me.getKey();
        HashMap<String ,String>numNameValue = me.getValue();
        for (Map.Entry<String,String> nameMapEntry :numNameValue.entrySet()){
            String numKey = nameMapEntry.getKey();
            String nameValue = nameMapEntry.getValue();
            System.out.println(classNameKey+".."+numKey+".."+nameValue );
        }*/

    }
//}
