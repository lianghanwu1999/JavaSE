package JavaSE.ElevenDay.迭代器;

public class Demo02增强For循环 {
   /*
        for( 数据类型  变量名 : 数组或者集合 ){
      *         sop(变量);
      *      }
      */
    public static void main(String[] args) {
        FunctionA();
        FunctionB();
    }
    public static void FunctionA(){
        //for对于对象数组遍历的时候，能否调用对象方法
        String [] str = {"abc" ,"itCast","cn"};
        for (String s : str){
            //方便对整个集合遍历(获取整体数据)
            //缺点:没有索引，不能对集合/数组内部某个数据操作
            System.out.println(s.length());
        }
    }
    /*
     *  实现for循环,遍历数组
     *  好处: 代码少了,方便对容器遍历
     *  弊端: 没有索引,不能操作容器里面的元素
     */
    public static void FunctionB(){
        int [] arr = {3,1,9,0};
        for (int i : arr){
            System.out.println(i+1);
        }
        System.out.println(arr[0]);
    }


}
