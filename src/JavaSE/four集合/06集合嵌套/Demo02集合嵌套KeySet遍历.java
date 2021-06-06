package JavaSE.TwelveDay.集合嵌套;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Demo02集合嵌套KeySet遍历 {
    public static void main(String[] args) {
        //定义基础班的集合
        HashMap<String,String> javaSE = new HashMap<String, String>(  );
        //定义就业班集合
        HashMap<String,String>javaEE = new HashMap<String, String>(  );
        //向班级集合中，存储学生信息
        javaSE.put("001","张三");
        javaEE.put("002","李四");

        javaEE.put("001","王五");
        javaEE.put("002","赵六");
        //定义传智播客集合容器，键是班级名字，值是两个班级容器
        HashMap<String,HashMap<String,String>>czbk=
                new HashMap<String, HashMap<String, String>>();
        czbk.put("基础班",javaSE);
        czbk.put("就业班",javaEE);
        keySet(czbk);
    }
    public static void keySet(HashMap<String,HashMap<String,String>>czbk){
        //调用czbk集合方法，KeySet将键存储到Set集合
        Set<String>classNameSet = czbk.keySet();
        //迭代Set集合
        Iterator<String>classNameIt = classNameSet.iterator();
        while (classNameIt.hasNext()){
            //classNameIt.next 获取出来的Set集合元素，czbk集合的键
            String classNameKey = classNameIt.next();
            //czbk集合的方法get获取值，值是一个HashMap集合
            HashMap<String,String> classMap = czbk.get(classNameKey);
            //调用classMap集合方法keySet，键存储到Set集合
            Set<String> studentNum = classMap.keySet();
            Iterator<String>studentIt = studentNum.iterator();
        while (studentIt.hasNext()){
                //studentIt.next 获取出来的是classMap 键，学号
                String numKey = studentIt.next();
                //调用classMap集合中的get方法获取值
                String nameValue = classMap.get(numKey);
                System.out.println(classNameKey+".."+ numKey+".."+nameValue);
            }
        }
        System.out.println("======================" );
        for (String className:czbk.keySet()){
            HashMap<String,String> hashMap = czbk.get(className);
            for (String numkey : hashMap.keySet()){
                String nameValue = hashMap.get(numkey);
                System.out.println(className+".."+numkey+".."+nameValue );
            }
        }
    }
}
