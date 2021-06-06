package JavaSE.ThirteenDay;

class PenSon{
    public String name;
    int age;

}
public class Demo03Throwable方法 {
    public static void main(String[] args) {
        PenSon i = new PenSon();
        try{
            PenSon p =null;
            if (p == null){
                throw new NullPointerException( "出现空指针异常了，请检查对象是否为null" );
            }
        }catch (NullPointerException e){
            String message = e.getMessage();  //返回该异常的详细信息字符串，即异常提示信息
            System.out.println(message );

            String result = e.toString();    //返回该异常的名称与详细信息字符串
            System.out.println(result );

            e.printStackTrace();  //在控制台输出该异常的名称与详细信息字符串、异常出现的代码位置
        }
    }
}
