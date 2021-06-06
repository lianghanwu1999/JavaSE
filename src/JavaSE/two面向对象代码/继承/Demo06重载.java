package JavaSE.FiveDay.继承;

//被重载的方法必须改变参数列表(参数个数或类型不一样)；
//被重载的方法可以改变返回类型；
//被重载的方法可以改变访问修饰符；

public class Demo06重载 {
   /* 重载:1.必须在同一个类
          2.必须方法名相同
          3.参数与列表可以不同
          4.返回值与返回值类型可以不一样
          5.java虚拟机是通过参数的不同进行区分同名方法
     */
    public int test(){
        System.out.println("test1");
        return 1;
        }

    public void test(int a){
        System.out.println("test2");
    }

    //以下两个参数类型顺序不同
    //被重载的方法必须改变参数列表(参数个数或类型不一样)；
    //被重载的方法可以改变返回类型；
    //被重载的方法可以改变访问修饰符；
    //开始是void 改成 String
    public String test(int a,String s){

        System.out.println("test3");
        return "ReturnTest3";
    }

    public String test(String s,int a){
        System.out.println("test4");
        return "ReturnTest4";
    }

    public static void main(String[] args) {
        Demo06重载 o = new Demo06重载();
        System.out.println(o.test());
        o.test(1);
        System.out.println(o.test(1,"test3"));
        System.out.println(o.test("test4",1));
    }
}
