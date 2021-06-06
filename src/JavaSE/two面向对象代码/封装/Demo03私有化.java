package JavaSE.FourDay.面向对象;

public class Demo03私有化 {
    // 当定义了一个私有的成员变量的时候，如果需要访问或者获取这个变量的时候，
    // 就可以编写set或者get方法去调用。
    /*
	 *   类描述人:
	 *     属性: 姓名和年龄
	 *     方法: 说话
	 *
	 *   私有化所有的属性 (成员变量) ,必须写对应的get/set方法
	 *   凡是自定义的类,自定义成员变量,应该私有化,提供get/set
	 *
	 *   this关键字:
	 *     区分成员变量和局部变量同名情况
	 *     方法中,方位成员变量,写this.
	 */


    //定义私有化属性:z只有在本类中访问，其他类不能访问
    private String name;  //私有化属性String name
    private int age;      //私有化属性 age

    //定义的为私有化变量，只能在本类使用，其他类不能使用
    //要想其他类也可以使用，就要使用set/get方法设置值和获取值
    //set方法，在私有化属性中使用set方法设置值
    public void setAge(int age){
        //当类中存在成员变量和局部变量同名的时候为了区分，就需要使用this关键字
        this.age = age;   //成员变量.age ,局部变量age
    }

    //使用set方法，设置私有化属性 name
    public void setName(String name){
        this.name =name;
    }

    //get方法:获取私有化变量name,age值
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }

    public void speak(){
        String name = "哈哈";
        int age = 16;

        System.out.println("人在说话 "+ this.name +"..."+this.age);
    }

    //标准测试代码
    public static class PersonTest {
        public static void main(String[] args) {
            //创建对象:类名  变量名 = new 类名();
            Demo03私有化 p = new Demo03私有化();
            //set方法，对成员变量赋值
            p.setAge(18);
            p.setName("旺财");
            p.speak();

            //调用get方法,获取成员变量的值
            System.out.println(p.getName());
            System.out.println(p.getAge());
        }
    }
}
