package JavaSE.TwoDay.集合容器;

import java.util.ArrayList;

public class Demo04集合重构 {
    //集合容器:补充方法
    /*
    ArrayList补充方法
	* a: add(int 索引,存储的元素) 	将元素添加到指定的索引上
	* b: set(int 索引,修改后的元素) 	将指定索引的元素,进行修改
	* c: remove(int 索引) 			删除指定索引上的元素
	* d: clear() 					清空集合中的所有元素
 */
    public static void main(String[] args) {
        //创建集合容器，存储整数
        ArrayList<Integer> array1 = new ArrayList<Integer>();
        array1.add(1);  //调用add方法，添加整数1
        array1.add(2);
        array1.add(3);
        array1.add(4);

        //在索引2上，添加元素7
        array1.add(2,7);

        //将0索引上，修改成10
        array1.set(0,10);

        //将4索引上的元素，删除
        array1.remove(4);

        //清空集合中的所有元素
//        array1.clear();

        //使用方法 size + get 组合进行遍历
        for (int i = 0; i<array1.size();i++){
            System.out.println(array1.get(i));
        }



    }
}
