package JavaSE.ThirteenDay;

public class Demo01异常处理 {
    public static void main(String[] args) {
        double d = getArea(1);
        System.out.println(d );
    }
    /*
     *  定义方法,计算圆形的面积
     *  传递参数0,或者负数,计算的时候没有问题
     *  但是,违反了真实情况
     *  参数小于=0, 停止程序,不要在计算了
     */
    public static double getArea(double r){
        if (r <= 0)
            //如果出现RuntimeException 异常，返回括号内容到终端窗口
            throw new RuntimeException( "圆形不存在" );
        return r*r*Math.PI;
    }

    public static void function(){
        int [] arr = {1,2,3};
        //对数组的5索引进行判断，如果5索引大于100，请将5索引的数据/2,否则除以3
        //索引根本就没有
        if(arr[5] >100){
            arr[5] = arr[5]/2;
        }
        else {
            arr[5] = arr[5]/3;
        }
    }
}
