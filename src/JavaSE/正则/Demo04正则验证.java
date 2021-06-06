package JavaSE.NineDay.正则;
//matches 检查是否合法，输出类型boolean类型

public class Demo04正则验证 {
    public static void main(String[] args) {
        //检查email地址是否合法
        checkMail();
    }
    /*
     *  检查邮件地址是否合法
     *  规则:
     *   1234567@qq.com
     *   mym_ail@sina.com
     *   nimail@163.com
     *   wodemail@yahoo.com.cn
     *
     *   @: 前  数字字母_ 个数不能少于1个
     *   @: 后  数字字母     个数不能少于1个
     *   .: 后面 字母
     */
    public static void checkMail(){
        String email = "abc123@sina.com";
        //[a-zA-Z0-9_]匹配从0-9 a-z 和A-Z 的所有字符
        boolean b = email.matches("[a-zA-Z0-9_]+@[0-9a-z]+(\\.[a-z]+)+");
        System.out.println(b);  //输出验证信息是否正确:T/F
    }


}
