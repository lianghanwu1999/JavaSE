package 基础部分代码;
/*
程序演示创建class 和 调用class 的对象
 */

//创建class
class FreshJuice {
    //枚举类型使用
    enum FreshJuiceSize{ SMAll,MEDIUM ,LARGE}
    FreshJuiceSize size;
}

public class FreshJuiceTest {
    //枚举类型
    public static void main(String[] args){   //public:公共  static:静态
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.MEDIUM;  //juice这个实例，调用枚举函数中的MEDIUM
    }
}
