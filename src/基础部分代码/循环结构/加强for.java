package 基础部分代码.循环结构;
/*
for(声明语句(声明的变量) : 表达式)
{
   //代码句子
}
声明语句：声明新的局部变量，该变量的类型必须和数组元素的类型匹配。
其作用域限定在循环语句块，其值与此时数组元素的值相等。

表达式：表达式是要访问的数组名，或者是返回值为数组的方法。
 */
public class 加强for {
    public static void main(String[] args) {
        int [] numbers = {10,20,30,40,50};

        //for(声明语句(声明的变量) : 表达式)
        for (int x : numbers){
            System.out.print(x);
            System.out.print(",");
        }
        System.out.print("\n");
        String [] names = {"james" ,"Larry" ,"Tom" ,"Lacy"};
        //for(声明语句(声明的变量) : 表达式)
        for (String name :names){
            System.out.print(name);
            System.out.print(",");
        }
    }
}