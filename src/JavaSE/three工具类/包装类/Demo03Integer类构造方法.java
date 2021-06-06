package JavaSE.TenDay.包装类;

public class Demo03Integer类构造方法 {
    public static void main(String[] args) {
        Function02();
    }
    //Integer类构造方法
    /*
     *  Integer类构造方法
     *   Integer (String s)
     *   将数字格式的字符串,传递到Integer类的构造方法中
     *   创建Integer对象,包装的是一个字符串
     *   将构造方法中的字符串,转成基本数据类型,调用方法,非静态的, intValue()
     */
    public static void Function02(){
        //将数字格式的字符串,传递到Integer类的构造方法中
        //Integer (String s)
        Integer in = new Integer("100");
        //将构造方法中的字符串,转成基本数据类型
        int i = in.intValue();   //将包装类Integer转成基本类型 int
        System.out.println(--i); //99
    }

}
