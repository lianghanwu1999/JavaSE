package JavaSE.TenDay.System类;

class Person{
    public void finalize(){
        System.out.println("垃圾收取了");
    }
}

public class Demo03垃圾回收 {
    public static void main(String[] args) {
        Function03();
    }

    /*
     *  JVM在内存中,收取对象的垃圾
     *  当没有更多引用指向该对象时,会自动调用垃圾回收机制回收堆中的对象
     *  同时调用回收对象所属类的finalize方法()
     *  static void gc()
     * */
    public static void Function03(){
        //创建多个对象，产生不必要的内存
        new Person();
        new Person();
        new Person();
        new Person();
        new Person();
        new Person();
        new Person();
        new Person();
        new Person();
        System.gc();  //调用系统垃圾回收机制
    }
}
