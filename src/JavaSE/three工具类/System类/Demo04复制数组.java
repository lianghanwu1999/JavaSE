package JavaSE.TenDay.System类;

public class Demo04复制数组 {
//    System类方法arraycopy：
    /*
     * System类方法,复制数组
     * arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
     * Object src, 要复制的源数组
     * int srcPos, 数组源的起始索引
     * Object dest,复制后的目标数组
     * int destPos,目标数组起始索引
     * int length, 复制几个
     */
    public static void main(String[] args) {
        function05();
    }

    public static void function05(){
        int [] src = {11,22,33,44,55,66};
        int [] desc = {77,88,99};

        //将src数组的第一个位置开始(包含1位置)的两个元素，拷贝到desc的1,2位置上
        System.arraycopy(src,1,desc,1,2);
        for (int i= 0; i<desc.length;i++){
            System.out.println(desc[i]);
        }
    }
}
