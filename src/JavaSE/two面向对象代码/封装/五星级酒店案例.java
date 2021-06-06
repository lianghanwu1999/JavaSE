package JavaSE.EightDay;

interface VIP{
    public abstract void server();  //服务
}

/*
 * 	员工：
		 姓名 String
		 工号 String

 */
abstract class YuanGong<xingMing> {
    //成员变量
    //私有变量姓名
    private String XingMing;
    //私有变量工号
    private String gongHao;
    //构造方法
    public YuanGong(){
        super();
    }
    public YuanGong(String xingMing, String gongHao){
        super();
        this.XingMing = xingMing;
        this.gongHao = gongHao;

    }
    //抽象方法
    public abstract void work();

    //getters与setters
    public String getxingMing(){
        return XingMing;
    }
    public void setxingMing(String xingMing){
        this.XingMing = xingMing;
    }
    public String getGongHao(){
        return gongHao;
    }
    public void setGongHao(String gongHao){
        this.gongHao = gongHao;
    }
}

/*
 * 经理在员工的基础上，添加了奖金成员
 */
class JingLi extends YuanGong{
    //私有变量奖金
    private double jiangJin;
    //经理类，继承父类员工的方法
    public JingLi(){
        super();
    }
    public JingLi(String xingMing ,String gongHao,double jiangJin){
        super(xingMing,gongHao);
        this.jiangJin = jiangJin;
    }
    //获取奖金变量
    public double getJiangJin(){
        return jiangJin;
    }
    //设置奖金变量元素
    public void setJiangJin(double jiangJin){
        this.jiangJin = jiangJin;
    }

    @Override
    public void work() {
        System.out.println("那个员工让顾客不满意，我就扣钱");
    };
}

/*
 * 定义员工的子类 厨师类
 */
class ChuShi extends YuanGong implements VIP{
    public ChuShi(){
        super();
    }
    public ChuShi(String xingMing,String gongHao){
        super(xingMing,gongHao);
    }

    @Override
    public void work() {
        System.out.println("我做饭，放心吃吧，包你满意");
    }

    @Override
    public void server() {
        System.out.println("做菜加量加料");
    }
}

//public class 五星级酒店案例 {
//}
