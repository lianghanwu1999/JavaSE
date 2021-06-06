package JavaSE.EighteenDay.序列化流;

import java.io.Serializable;

public class Demo03序列化中自定义的序列号 {
    public static void main(String[] args) {

    }
    class Person implements Serializable{
        public String name;
        public int age;
        //类 自定义了序号 编辑器不会计算序列号
        private static final long serialVersionUID = 1478652478456L;

        public Person(String name, int age) {
            //继承父类
            super();
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
//        static long getSerialVersionUID() {
//            return serialVersionUID;
//        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }
        //无参构造类
        public Person() {
        }


        //toString 函数
        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }


}

}