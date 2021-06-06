package JavaSE.EightDay.类方法;

class MathTool{
    //求两个数的和的二倍
    public double sum2times(int number,int number2){
        return (number+number2)*2;
    }

    public double area(int number,int number2){
        return (number*number2);
    }
}

public class Demo02局部变量与成员变量 {
    //因为长与宽，在现实事物中属于事物的一部分，所以定义成员变量
    private int chang;
    private int kuan;

    //重载覆盖抽象类
    public Demo02局部变量与成员变量(int chang,int kuan){
        this.chang =chang;
        this.kuan = kuan;
    }

    //求长与宽面积
    public double MianJi(){
        return chang*kuan;
    }

    public int getChang(){
        return chang;
    }
    public void setChang(int chang){
        this.chang = chang;
    }
    public int getKuan(){
        return kuan;
    }
    public void setKuan(int kuan){
        this.kuan = kuan;
    }
}
