package JavaSE.NineDay.正则;

public class Demo03正则替换 {
    public static void main(String[] args) {
        replaceAll_1();

    }
    /*
     * "Hello12345World6789012"将所有数字替换掉
     * String类方法replaceAll(正则规则,替换后的新字符串)
     */
    public static void replaceAll_1(){
        String str = "Hello12345World6789012";
        //使用string类中的replaceAll替换方法，replaceAll("被替换字符串","替换它的字符串\字符")
        //将[//d] 数字，替换成#
        str = str.replaceAll("[\\d]+","#");
        System.out.println(str);
    }

}
