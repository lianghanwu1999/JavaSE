package JavaSE.SevenDay.构造方法;

public class Demo04构造相互调用 {
    //Demo04构造相互调用类的成员属性
    private int age;
    private String name;

    //无参数的构造方法
    Demo04构造相互调用(){
    }   //系统使用无参数构造方法，创建对象，所以系统会默认调用无参数构造方法

    //给姓名初始化的构造方法
    Demo04构造相互调用(String nm){
        name = nm;
    }

    //给姓名和年龄初始化的构造方法
    Demo04构造相互调用(String nm ,int a){
        //由于已经存在姓名进行初始化方法的构造方法，name = nm;因此只需要调用即可
        //调用其他构造方法，需要通过this 关键词来调用
        this(nm);  //调用其他构造方法，只需要this关键词即可
        //给年龄初始化
        age = a;
    }
}
