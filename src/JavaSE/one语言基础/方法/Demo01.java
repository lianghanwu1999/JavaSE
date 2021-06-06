package JavaSE.OneDay.方法;

//构造方法:体验
public class Demo01 {
    //定义方法计算面积
    public static void main(String[] args) {
        //调用方法，方法执行起来
        //在方法main中，调用方法 grtArea

        int area = getArea(5,6);  //长,宽
        System.out.println("面积是:" +area);
    }
    /*
		   要求: 计算一个长方形的面积
		   定义方法解决这个要求
		   分析方法定义过程:
		      1.明确方法计算后的结果的数据类型 int  定义格式对应的就是返回值类型
			  2.方法计算过程中,有没有未知的数据, 宽和长, 未知数据的数据类型 int
			      未知数的变量,定义在方法的小括号内
	*/

    //创建方法
    /*
    修饰符 返回值类型 方法名(参数类型 参数名1,参数类型 参数名2...) {
        方法体语句;
        return 返回值;
    }
    */
    //构造方法
    public static int getArea(int w,int h){
        //实现方法的主体
        int area = w *h;
        return w * h;
    }
}
