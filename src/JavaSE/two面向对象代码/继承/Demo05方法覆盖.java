package JavaSE.FiveDay.继承;

//手机类
class Phone{
    public void SendMessage(){
        System.out.println("发短信");
    }
    public void Call(){
        System.out.println("打电话");
    }
    public void ShowNum(){
        System.out.println("来电显示号码");
    }
}

//智能手机类
//继承父类Phone
class SmartPhone extends Phone{
    //覆盖父类的来电显示号码功能，并增加自己的显示姓名和图片功能
    //从现实生活角度考虑沿用原有的showNum方法名便于用户更快熟悉和接受,而不是再起个新的名字
    //用户还需要花费大量时间慢慢接受

    public void showNum(){
        //调用父类已经存在的功能使用super
        //如果不加super这是调用子类自身的showNum(),自己调用自己,递归
        //方法不断入栈导致内存溢出
        super.ShowNum();

        //增加自己特有显示姓名和图片功能
        System.out.println("来电显示姓名");
        System.out.println("显示头像");
    }
}

public class Demo05方法覆盖 {
    public static void main(String[] args) {
        //新的方法:父类方法+子类方法的融合，所以是新的方法,加new标记
        new SmartPhone().showNum();  //调用子类方法:/来电显示  显示来电姓名 显示头像
    }
}
