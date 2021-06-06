package JavaSE.TwelveDay.Map接口;

import java.util.HashMap;

public class Demo04HashMap存储和遍历 {
    /*
     *  使用HashMap集合,存储自定义的对象
     *  自定义对象,作为键,出现,作为值出现
     */
      public static void main(String[] args) {
      funtion001A();
}
    /*
     * HashMap 存储自定义对象Person,作为键出现
     * 键的对象,是Person类型,值是字符串
     * 保证键的唯一性,存储到键的对象,重写hashCode equals
     */
    public static void funtion001A(){
        HashMap<Integer,String> map = new HashMap<Integer, String>();
        map.put(20,"里约热内卢");
        map.put(18,"里约热内卢");
        map.put(18,"里约热内卢");
        map.put(19,"里约热内卢");
     }

}
