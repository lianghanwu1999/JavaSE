package JavaSE.FourDay.面向对象;
/*
 * 对于基本类型形式参数改变不会影响到实际参数(相当于传值，不会改变值)
 * 对于引用类型形式参数改变会影响到实际参数(相当于传指针，改变值类型)
 */

public class Demo02类型对比 {
    //基本类型
    /*
    基本类型作为参数传递时，其实就是将基本类型变量x空间中的值复制了一份传递给调用的方法show()，
    当在show()方法中x接受到了复制的值，
    再在show()方法中对x变量进行操作，这时只会影响到show中的x。
    当show方法执行完成，弹栈后，程序又回到main方法执行，main方法中的x值还是原来的值。

     */
    static class Demo{
        public static void main(String[] args) {
            int x= 4;
            show(x);
            System.out.println("x="+x);
        }
        public static void show(int x){
            x = 5;
        }
    }

    //引入类型
    /*
    当引用变量作为参数传递时，这时其实是将引用变量空间中的内存地址(引用)复制了一份传递给了show方法的d引用变量。
    这时会有两个引用同时指向堆中的同一个对象。
    当执行show方法中的d.x=6时，会根据d所持有的引用找到堆中的对象，并将其x属性的值改为6.show方法弹栈。
	由于是两个引用指向同一个对象，不管是哪一个引用改变了引用的所指向的对象的中的值，其他引用再次使用都是改变后的值。
     */
    static class Demo1{   //设置为公共静态类型
        int x;

        public static void main(String[] args) {
            //创建 d对象
            Demo1 d = new Demo1();
            //对象赋值
            d.x = 5;
            show(d);
            System.out.println("x="+d.x);
        }
        public static void show(Demo1 d){
            //对象赋值
            d.x = 6;
        }

    }
}
