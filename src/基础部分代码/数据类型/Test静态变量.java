package 基础部分代码.数据类型;

public class Test静态变量 {
//    salary是一个静态私有变量
    private static double salary;
//    DEPARTMENT是一个常量
    public static final  String DEPARTMENT = "开发人员";
    public static void main(String[] args){
        salary =1000;
        System.out.println(DEPARTMENT +"平均工资:" +salary);
    }

}
