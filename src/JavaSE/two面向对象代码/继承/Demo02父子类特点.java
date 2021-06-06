package JavaSE.FiveDay.继承;

//定义fu为父类
class Fu{
    //fu中的成员变量
    int num = 5;
}

//定义zi 为fu的子类,同时继承父类Fu
class Zi extends Fu{
    //Zi中的成员变量
    int num2 = 6;
    //Zi 中的成员方法
    public void show(){
        //访问父类中的num
        System.out.println("Fu num = " + num);  //num = 5
        //访问子类中的num2
        System.out.println("Zi num2 = " +num2);  //num2 = 6
    }
}
public class Demo02父子类特点 {
    public static void main(String[] args) {
        Zi z = new  Zi();  //创建子类对象
        z.show();  //调用子类中的show方法
    }
}
