package JavaSE.ElevenDay.集合.Set集合接口;
//字符串对象的哈希值
/*
*  对象的哈希值,普通的十进制整数
*  父类Object,方法 public int hashCode() 计算结果int整数
*/

public class Demo02字符串哈希值 {
    public static void main(String[] args) {
        Person p = new Person("a", 11);
        int i  = p.hashCode();
        System.out.println(i);

        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println("重地".hashCode());
        System.out.println("通话".hashCode());
    }
    //String 类重写hashCode()方法
    //字符串都会存储在底层的value中{'a','b','c'}
    /*public int hashCode(){

        int h = hash;  //hash初值为0
        if(h == 0 && value.length >0){
            char val[] = value;

            for (int i = 0;i < value.length;i++){
                h = 31 * h +val[i];
            }
            hash = h;
        }
        return  h;
    }*/
}

