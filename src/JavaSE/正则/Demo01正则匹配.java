package JavaSE.NineDay.正则;


public class Demo01正则匹配 {
    public static void main(String[] args) {
        checkTel();
    }
    /*
     *  检查手机号码是否合法
     *  1开头 可以是34578  0-9 位数固定11位
     */
    public static void checkTel(){
        String telNumber = "1335128005";
        //String类法方法matches
        //[abc]    a、b 或 c   [34857] 即是 34857 中其中一个
        //[0-9]    0到9的字符都包括(范围内任意一个)
        boolean b = telNumber.matches("1[34857][\\d]{9}");
        System.out.println(b);
    }
    /*
     *  检查QQ号码是否合法
     *  0不能开头,全数字, 位数5,10位
     *  123456
     *  \\d  \\D匹配不是数字
     */
    public static void checkQQ(){
        String QQ = "123456";
        //检查QQ号码和规则是匹配，String 类方法matches
        //[1-9][\d]{4,9}  翻译:1-9数字中任意一个，[\d]随机匹配0-9数字，{4,9}重复4至9次
        boolean b = QQ.matches("[1-9][\\d]{4,9}");
        System.out.println(b);
    }
}
