package 基础部分代码.数据类型;

public class Test类型默认值 {
    //输出各类型的默认值
    //都设定为静态类型
    static boolean bool;
    static byte by;
    static char ch;
    static double d;
    static float f;
    static int i;
    static long l;
    static short sh;
    static String str;

    public static void main(String[] args) {
        //输出函数：+要输出的值
        System.out.println("Bool:" +bool);
        System.out.println("Byte:" +by);
        System.out.println("Character:" +ch);
        System.out.println("Double:" +d);
        System.out.println("Float:" +f);
        System.out.println("Integer:" +i);
        System.out.println("Long:" +l);
        System.out.println("short:" +sh);
        System.out.println("String:" +str);
    }

    public static class PrimitiveTypeTest基本数据类型 {
        public static void main(String[] args) {
            //byte
            System.out.println("基本类型:byte 二进制位数：" + Byte.SIZE);
            System.out.println("包装类：java.lang.Byte" );
            //调用最小值
            System.out.println("最小值：Byte.MAX_VALUE= " + Byte.MIN_VALUE);
            //调用最大值
            System.out.println("最大值：Byte.MAX_VALUE= " + Byte.MAX_VALUE);
            System.out.println();

            //short
            System.out.println("基本类型:short 二进制位数：" + Short.SIZE);
            System.out.println("包装类：java.lang.short" );
            //调用最小值
            System.out.println("最小值：short.MAX_VALUE= " + Short.MIN_VALUE);
            //调用最大值
            System.out.println("最大值：short.MAX_VALUE= " + Short.MAX_VALUE);
            System.out.println();

            //int
            System.out.println("基本类型:Integer 二进制位数：" + Integer.SIZE);
            System.out.println("包装类：java.lang.Integer" );
            //调用最小值
            System.out.println("最小值：Integer.MAX_VALUE= " + Integer.MIN_VALUE);
            //调用最大值
            System.out.println("最大值：Integer.MAX_VALUE= " + Integer.MAX_VALUE);
            System.out.println();

            //Long
            System.out.println("基本类型:Long 二进制位数：" + Long.SIZE);
            System.out.println("包装类：java.lang.Long" );
            //调用最小值
            System.out.println("最小值：Long.MAX_VALUE= " + Long.MIN_VALUE);
            //调用最大值
            System.out.println("最大值：Longe.MAX_VALUE= " + Long.MAX_VALUE);
            System.out.println();

            //float
            System.out.println("基本类型:Float 二进制位数：" + Float.SIZE);
            System.out.println("包装类：java.lang.Float" );
            //调用最小值
            System.out.println("最小值：Float.MAX_VALUE= " + Float.MIN_VALUE);
            //调用最大值
            System.out.println("最大值：Float.MAX_VALUE= " + Float.MAX_VALUE);
            System.out.println();

            //double
            System.out.println("基本类型:Double 二进制位数：" + Double.SIZE);
            System.out.println("包装类：java.lang.Double" );
            //调用最小值
            System.out.println("最小值：Double.MAX_VALUE= " + Double.MIN_VALUE);
            //调用最大值
            System.out.println("最大值：Double.MAX_VALUE= " + Double.MAX_VALUE);
            System.out.println();

            //char
            System.out.println("基本类型：char 二进制位数：" + Character.SIZE);
            System.out.println("包装类：java.lang.Character");
            //以数值形式而不是字符串形式将Character .MIN_VALUE 输入到控制台
            System.out.println("最小值：Character.MIN_VALUE= "
            +(int) Character.MIN_VALUE);
            //以数值形式而不是字符串形式将Character .MAX_VALUE 输入到控制台
            System.out.println("最小值：Character.MAXVALUE= "
                    +(int) Character.MAX_VALUE);

        }
    }
}

