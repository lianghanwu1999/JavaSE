package JavaSE.FiveDay.继承;

//当子父类中出现了同名成员变量
class Fu01{
    //Fu中的成员变量。
    int num = 5;
}

class Zi01 extends Fu01{
    //Zi01中的成员变量
    int num = 6;
    void show(){
        //子类变量的局部变量
        int num = 7;   //将值修改
        //直接访问，执遵循就近原则
        System.out.println(num);    //num = 7

        //子类中出现同名的成员变量时
        //在子类需要访问父类非私有成员对象时，需要使用super关键词
        //访问父类中的num
        System.out.println("Fu num = " +super.num);  //num =5

        //访问子类中的num2
        System.out.println("Zi num2=" +this.num);  //num =6
    }
}

public class Demo03父子同名 {
    public static void main(String[] args) {
        Zi01 z = new Zi01();  //创建子类对象
        z.show();        //调用子类中的show方法
    }
}
