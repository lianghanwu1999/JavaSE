package JavaSE.ThreeDay.循环算法;

public class Demo04英文 {
    /*
    * 定义初始化大写变量，值为’A’； 初始化小写变量，值为’a’
		* 使用for循环，进行26次循环
		* 在每次循环中，打印大写字母、小写字母。
			每次打印完成后，更新大写字母值、小写字母值
			* 后面的字母比它前面的字母，ASCII值大1
     */
    public static void main(String[] args) {
        char da = 'A';
        char xiao = 'a';
        for (int i = 0; i<26;i++){
            System.out.println("大写字母" + da +",小写字母" + xiao);
            //后面的字母比它前面的字母，ASCII值大1
            da++; //更新大写字母值
            xiao++;  //更新小写字母值
        }
    }
}
