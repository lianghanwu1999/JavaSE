package JavaSE.TenDay.System类;

public class Demo02退出方法 {
    public static void main(String[] args) {
        Function02();
    }
    public static void Function02(){
        while (true){
            System.out.println("hello");
            //返回值：0 表示退出
           /* exit（0）：正常运行程序并退bai出程序。
            exit（1）：非正常运行导致du退出程序zhi；*/
            System.exit(0);//该方法会在以后的finally代码块中使用
        }
    }

}
