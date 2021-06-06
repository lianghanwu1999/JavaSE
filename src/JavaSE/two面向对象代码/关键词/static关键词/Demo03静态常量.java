package JavaSE.SevenDay.关键词.static关键词;
//定义静态常量
//public static final 数据类型 变量名 = 值;

class Company{
    public static final String COMPANY_NAME  = "传智播客";
    public static void method(){
        System.out.println("一个静态方法");
        //当我们想使用类的静态成员时，不需要创建对象，直接使用类名来访问即可
        System.out.println(Company.COMPANY_NAME);  //打印传智播客
        Company.method();    //调用静态方法
    }
}

interface Inter{
    public static final int COUNt = 100;
}
//访问接口中的静态变量
//Inter.COUNT

public class Demo03静态常量 {
}
