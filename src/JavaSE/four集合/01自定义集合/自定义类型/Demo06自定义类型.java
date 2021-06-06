package JavaSE.TwoDay.自定义类型;

import java.util.ArrayList;
import java.util.Scanner;
class Goods{
    //定义商品名字
    String brand;
    //大小属性
    double size;
    //价格属性
    double price;
    //库存属性
    int count;
}
public class Demo06自定义类型 {
    //商品库存:类与方法使用
    public static void main(String[] args) {
        //创建ArrayList 集合，存储Goods类型
        ArrayList<Goods> array = new ArrayList<Goods>();
        //调用添加商品信息的方法
        addGoods(array);
        //进入死循环
        while (true) {
            //调用选择功能的方法，获取到用户输入的功能序号
            int number = chooseFunction1();
            /*
            对序号判断，如果=1 进入查看库存功能， = 2 进入修改库存功能  =3 结束
             */
            switch (number) {
                case 1:
                    //进入查看库存，调用查看库存的方法，传递商品信息的集合
                    printStore(array);
                    break;
                case 2:
                    //进入修改库存功能，调用修改库存法方法，传递集合
                    update(array);
                    break;
                case 3:
                    return;
                default:
                    System.out.println("查无此功能!");
                    break;

            }
        }
    }
        /*
        方法定义，修改库存
        键盘输入，将Goods中的属性值，修改
         */
        public static void update(ArrayList<Goods> array){
            Scanner sc = new Scanner(System.in);
            //遍历集合，获取集合中的每一个元素
            for(int i = 0; i<array.size();i++){
                //集合方法get 获取的是集合的元素，元素类型Goods
                Goods g = array.get(i);  //获取遍历的集合元素
                System.out.println("请输入"+g.brand+"的库存数");
                //goods属性，count进行修改
                g.count = sc.nextInt();
            }
        }

        //定义方法，实现选择菜单，用户根据功能选择菜单
        public static int chooseFunction1(){
            System.out.println("-----库存管理--------");
            System.out.println("1.查看库存清单");
            System.out.println("2.修改商品库存数量");
            System.out.println("3.退出系统");
            System.out.println("请输入要执行的操作序号:");
            //引用键盘输入功能
            Scanner sc = new Scanner(System.in);
            int chooseNumber = sc.nextInt();
            return chooseNumber;
        }

        //定义方法。查看库存清单，遍历集合
        public static void printStore (ArrayList<Goods> array){
            //输出表头
            System.out.println("------商场库存清单-------");
            System.out.println("品牌型号    尺寸    价格     库存数");
            //定义变量，保存总库存数，和总金额
            int totalCount = 0;
            double totalMoney = 0;

            //遍历集合
            for (int i= 0; i< array.size(); i++){
                //get(索引)获取出集合中的元素，存储的是Goods类，获取的也是Goods类型
                //使用Goods类型变量，接受get方法结果
                Goods g = array.get(i);
                System.out.println(g.brand+ " " +g.size+" " +g.price +" " +g.count);
                totalCount = totalCount + g.count;
                totalMoney = totalMoney +g.count*g.price;
            }
            System.out.println("总库存数:" +totalCount);
            System.out.println("商品库存总金额:" +totalMoney);
        }
        /*
		   定义方法,将商品的信息存储到集合中
		   集合是所有方法的共享数据,参数传递
		*/

        public static void addGoods (ArrayList<Goods>array){
            //创建商品类型变量 Goods 类型的变量
            Goods g1 = new Goods();
            Goods g2 = new Goods();

            //初始化属性
            g1.brand = "MacBook";
            g1.size = 13.3;
            g1.price =9999.99;
            g1.count = 3;

            g2.brand = "ThinkPad";
            g2.size = 15.6;
            g2.price = 7999.99;
            g2.count = 1;

            //Goods 类型的变量，存储到集合中
            array.add(g1);
            array.add(g2);
        }




}


