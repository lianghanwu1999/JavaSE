package JavaSE.OneDay.方法;

import java.util.Scanner;  //引用方法类:一般调用系统的输入IO接口

public class Demo04 {
    //实现商品的库存管理
    public static void main(String[] args) {
        //使用数组,保存商品的信息
        //品名,尺寸，价格，库存数，定义5个数组
        String[] brand = {"MacBookAir" ,"ThinkPadT450"};   //字符串数组类型
        double[] size = {13.3,15.6};
        double[] price = {9888.98,6777.85};
        int [] count = {0,0};
        while (true){
            int choose = chooseFunction();
            switch (choose){
                case 1:
                    //调用查看库存清单方法
                    printStore(brand,size,price,count);
                    break;
                case 2:
                    //调用修改库的方法
                    update(brand,count);
                    break;
                case 3:
                    return; //退出
                default:
                    System.out.println("没这个功能");
                    break;
            }

        }

}
    /*
		  定义方法,实现用户的选择功能,功能的需要返回来
		  返回值, int
		  参数, 没有
		  方法在另一个方法内无效
		*/
    private static int chooseFunction() {
        System.out.println("-------库存管理-------");
        System.out.println("1.查看库存清单");
        System.out.println("2.修改商品库存数量");
        System.out.println("3.退出");
        System.out.println("请输入要执行的操作序号:");
        //接受键盘输入
        Scanner sc = new Scanner(System.in); //接受输入:相当于input /scanf
        int chooseNumber = sc.nextInt();
        return chooseNumber;
    }
    /*
		  定义方法,修改所有商品的库存
		    用户输入1个,修改1个
			返回值,没有
			参数, 库存数的数组, 品名数组
		*/

    //更新修改
    public static void update(String[] brand,int[] count){
        //遍历数组，遍历到一个，修改一个
        //接受键盘输入
        Scanner sc = new Scanner(System.in);
        //遍历数组
        for (int i = 0; i< brand.length;i++){
            System.out.println("请输入"+brand[i] +"的库存数");
            //键盘输入，录入库存，存储到库存数组中
            int newCount = sc.nextInt();  //调用键盘输入
            count[i] = newCount;     //修改相应的数
        }
    }
    /*
         定义方法,展示所有的库存清单,遍历
         返回值,没有
         参数, 数组
      */

    //展示
    public static void printStore(String[] brand,double[] size,
                                  double[] price,int[] count){
        System.out.println("----------商场库存清单----------");
        System.out.println("品牌型号    尺寸    价格    库存数");
        //定义变量，计算总库存数，和总价格
        int totalCount = 0;
        int totalMoney = 0;
        // 遍历数组，将数组中所有的商品信息打印出来
        for(int i =0 ;i < brand.length;i++){
            System.out.println(brand[i] +" " +size[i] +" "+price[i]+" " +count);
            totalCount += count[i];
            totalMoney += count[i] *price[i];
        }
        System.out.println("总库存数:" + totalCount);
        System.out.println("商品库存总金额:" +totalMoney);
    }
}
