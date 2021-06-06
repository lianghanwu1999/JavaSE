package JavaSE.FourDay;

import java.util.ArrayList;
import java.util.Scanner;


public class Demo01超市管理系统 {
    /*
     *   超市管理系统主
     *   实现:
     *     1. 商品数据的初始化
     *     2. 用户的菜单选择
     *     3. 根据选择执行不同的功能
     *       3.1 Read    查看商品
     *       3.2 Create  添加商品
     *       3.3 Delete  删除商品
     *       3.4 Update  修改商品
     *
     *
     *   所有功能 ,必须定义方法实现
     *   主方法main  调用作用
     */
    //创建集合类
    public static class FruitItem {
        int ID;         //商品编号
        String name;    //商品名额
        double price;   //商品单价
        double number;  //商品数量
        double money;   //商品金额
    }
    public static void main(String[] args) {
        //创建ArrayList 集合，存储商品类型，存储数据类型FruitItem类型
        ArrayList<FruitItem> array = new ArrayList<FruitItem>();
        //调用商品初始化方法，传递集合
        init(array);
        while (true) {
            //调用菜单方法
            mainMenu();
            //接收键盘输入
            int choose = chooseFunction();
            switch (choose) {
                case 1:
                    //调用1:货物 清单
                    showFruitList(array);
                    break;
                case 2:
                    //调用2:添加货物
                    addFruit(array);
                    break;
                case 3:
                    //调用3:删除货物
                    deleteFruit(array);
                    break;
                case 4:
                    //调用4:修改货物
                    updateFruit(array);
                    break;
                case 5:
                    //退出系统
                    return;
                default:
                    System.out.println("输入的序号没有");
                    break;

            }
        }

    }

    public static void init(ArrayList<FruitItem> array) {
        //添加原始元素类
        //创建出多个FruitItem 类型对象
        FruitItem f1 = new FruitItem();
        f1.ID = 9527;
        f1.name = "少林寺酥饼核桃";
        f1.price = 12.7;

        FruitItem f2 = new FruitItem();
        f2.name = "尚康杂粮牡丹饼";
        f2.price = 5.6;

        FruitItem f3 = new FruitItem();
        f3.ID = 9879;
        f3.name = "新疆原产哈密瓜";
        f3.price = 599.6;

        //将创建的3个FruitItem类型对象变量,存储到集合中
        array.add(f1);
        array.add(f2);
        array.add(f3);

    }

    //实现接收用户键盘输入
    //返回编号
    public static int chooseFunction() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();  //返回一个整数
    }

    //主菜单
    public static void mainMenu() {
        System.out.println();
        System.out.println("============欢迎光临ItCast超市============");
        System.out.println("1: 货物 清单   2: 添加货物   3: 删除货物   4: 修改货物  5: 退出");
        System.out.println("请您输入要操作的功能序号");
    }

    public static void showFruitList(ArrayList<FruitItem> array) {
        System.out.println();
        System.out.println("=======商品库存清单========");
        System.out.println("商品编号     商品名称     商品单价");
        //遍历集合:打印信息
        for (int i = 0; i < array.size(); i++) {  //范围在集合的长度为顶
            //集合get方法，获取出每个集合FruitItem变量，可以使用FruitItem 接收get结果
            FruitItem item = array.get(i);  //获取集合元素
            //变量item 调用类中属性
            System.out.println(item.ID + " " + item.name + " " + item.price);
        }
    }

    //添加商品功能
    public static void addFruit(ArrayList<FruitItem>array){
        System.out.println("选择的是添加商品功能");
        //创建Scanner变量:给下来元素提供接收元素功能
        Scanner sc = new Scanner(System.in);
        System.out.println("输出新商品的编号:");
        //输入商品的名称
        int ID = sc.nextInt();  //接收一个整数
        //输入商品的名称
        System.out.println("请输入新商品的名称:");
        String name = sc.next();  //接收一段字符串
        //输入商品的单价
        System.out.println("输入新商品的单价:");
        double price = sc.nextDouble();//接收一个浮动数

        //创建FruitItem变量:存储在FruitItem集合内
        FruitItem item = new FruitItem();
        //item 属性赋值
        item.ID = ID;  //调用接收商品输入的ID信息
        item.name = name; //调用接收商品输入的name信息
        item.price = price;  //调用接收商品输入的price信息
        //显示刚输入集合item里面信息
        array.add(item);
        //提醒输入成功
        System.out.println("商品添加成功!");
    }

    //商品删除功能
    public static void deleteFruit(ArrayList<FruitItem> array){
        System.out.println("选择的是删除功能");
        System.out.println("请输入商品的编号:");
        //创建Scanner变量，给下面通过输入功能
        Scanner sc = new Scanner(System.in);

        //接收要删除商品ID:
        int ID = sc.nextInt();
        //遍历集合
        //查找集合元素
        for(int i = 0; i<array.size();i++){
            //获取到每一个FruitItem变量
            FruitItem item = array.get(i);
            //变量，调用属性ID 和用户输入的编号进行比较
            if(item.ID == ID){
                //移除集合中的元素
                //集合的方法remove实现
                array.remove(i);  //移除查找到元素ID 的集合
                System.out.println("删除成功!");
                return;  //退出循环
            }
        }
        System.out.println("你输入的编号不存在");
    }
    //修改商品功能
    public static void updateFruit(ArrayList<FruitItem> array){
        System.out.println("选择的是修改功能");
        System.out.println("请输入您要修改的商品的编号:");
        //创建Scanner变量，给下面通过输入功能
        Scanner sc = new Scanner(System.in);
        int ID = sc.nextInt();
        //遍历集合，获取每个FruitItem变量
        for (int i = 0;i<array.size();i++){
            //获取集合的所有元素值
            FruitItem item = array.get(i);
            //获取FruitItem的属性ID,和用户输入的ID比较
            if(item.ID == ID){   //如果输入的编号与集合里用户相同
                System.out.println("输入新的商品编号:");
                item.ID  = sc.nextInt();

                System.out.println("输入新的商品名称:");
                item.name = sc.next();

                System.out.println("输入新的商品价格:");
                item.price = sc.nextDouble();

                System.out.println("商品修改成功");
                return;
            }
        }
        System.out.println("输入编号不存在!");
    }


}
