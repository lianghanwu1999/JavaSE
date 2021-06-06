package JavaSE.ThreeDay.循环算法;

public class Demo02水仙花 {
    //水仙花数是指一个3位数（100-999之间），其每位数字立方之和等于该3位数本身
    //如153 = 1*1*1 + 3*3*3 + 5*5*5，即 3位数本身 = 百位数立方 + 十位数立方 + 个位数立方;
    public static void main(String[] args) {
        for (int i = 100;i<1000; i++){
            int bai = i /100%10;     //挑选百位上的数
            int shi = i /10%10;      //挑选十位上的数
            int ge  = i %10 ;       //挑选个位上的数

            if(i == bai*bai* +shi*shi*shi* + ge*ge*ge){
                System.out.println(i);
            }
        }
    }
}
