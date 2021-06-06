package JavaSE.OneDay.变量;

public class Demo01<totalCount, totalMoney> {
    public static void main(String[] args) {

        //步骤二: 记录每种库存商品信息
        //苹果笔记本电脑
        String macBrand = "MacBookAir";
        double macSize = 13.3;
        double macPrice = 6988.88;
        int macCount = 5;

        //联想Thinkpad笔记本电脑
        String thinkpadBrand ="ThinkpadT450";
        double thinkpadSize = 14.0;
        double thinkpadPrice = 5999.99;
        int thinkpadCount = 10;

        //华硕ASUS笔记本电脑
        String ASUSBrand = "ASUS-FL5800";
        double ASUSSize = 15.6;
        double ASUSPrice = 4999.50;
        int ASUSCount = 18;

        //步骤三: 统计库存总个数、库存总金额
        int totalCount = macCount + thinkpadCount + ASUSCount;
        double totalMoney = (macCount * macPrice) + (thinkpadCount * thinkpadPrice) + (ASUSCount * ASUSPrice);

        //步骤四: 列表顶部
        System.out.println("------------------------------商城库存清单-----------------------------");
        System.out.println("品牌型号 \t\t 尺寸 \t\t 价格 \t\t 库存数");

        //步骤四:打印库存清单中部信息
        //列表中部
        System.out.println(macBrand+"\t\t"+macSize+"\t\t"+macPrice+"\t\t"+macCount);
        System.out.println(thinkpadBrand+"\t\t"+thinkpadSize+"\t\t"+thinkpadPrice+"\t\t"+thinkpadCount);
        System.out.println(ASUSBrand+"\t\t"+ASUSSize+"\t\t"+ASUSPrice+"\t\t"+ASUSCount);
        //打印库存清单底部信息
        //列表底部
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("总库存数："+totalCount);
        System.out.println("库存商品总金额："+totalMoney);
    }
}
