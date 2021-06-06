package JavaSE.TwoDay.集合容器;

import java.util.ArrayList;

public class Demo02创建集合 {
    //创建集合引用变量:ArrayList :ArrayList 类是一个可以动态修改的数组，与普通数组的区别就是它是没有固定大小的限制
    /*
    创建引用类型的变量
		数据类型< 集合存储的数据类型>  变量名 = new 数据类型<集合存储的数据类型>();
     */
    public static void main(String[] args) {
        //创建集合容器，指定存储的数据类型
        //存储字符串
        //数据类型< 集合存储的数据类型>  变量名 = new 数据类型<集合存储的数据类型>();
        ArrayList<String > array = new ArrayList<String >();

        //创建集合容器，存储整数
        ArrayList<Integer> array2 = new ArrayList<Integer>();

        //创建集合容器，存储自定义类型(手机类型)
//        ArrayList<Phone> array3 = new ArrayList<Phone>();
    }
}
