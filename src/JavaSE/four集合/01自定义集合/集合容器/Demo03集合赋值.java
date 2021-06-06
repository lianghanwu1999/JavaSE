package JavaSE.TwoDay.集合容器;

import java.util.ArrayList;

public class Demo03集合赋值 {
    //ArrayList的常见方法
    /*
    ArrayList的常见方法
	* a: add(参数) 向集合中添加元素
	* b: get(int index) 取出集合中的元素,get方法的参数,写入索引
	* c: size() 返回集合的长度, 集合存储元素的个数
    */
    public static void main(String[] args) {
        //定义集合，存储字符串元素
        //ArrayList :是一个不局限大小动态的数组
        ArrayList<String> array = new ArrayList<String>();
        //调用集合方法add 存储元素
        //添加元素 add方法
        array.add("abc");
        array.add("cast");
        array.add("love");
        array.add("java");      //调用 add()方法:添加元素
        array.remove(2);  //调用 remove()方法:删除元素
        array.set(2,"lhw");     //调用 set()方法 :修改元素(索引，"填换的字符串")
        //array.get(2);           //用 get()方法 : 通过索引。获取元素
        System.out.println(array);  //打印集合
        //输出集合的长度，调用集合方法size,size方法的返回值类型 int
        int size = array.size();
        System.out.println(size);  //打印集合容器长度

        //例子:
        //获取出集合中的一个元素，获取1索引的元素
        //集合的方法get,获取元素后后果数据类型
        //使用get 方法，获取（访问）元素
        String s = array.get(1);     //索引1，位于数组位置第二位，访问第二位元素
        System.out.println(s);      //输出，访问到的第二个元素
        System.out.println("\n");

        //get 方法 ，通过索引访问获取元素
        System.out.println(array.get(0));
        System.out.println(array.get(1));
        System.out.println(array.get(2));
//        System.out.println(array.get(3));

        //调用 remove()方法:删除元素
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        sites.remove(3); // 删除第四个元素
        System.out.println(sites);

    }
}
