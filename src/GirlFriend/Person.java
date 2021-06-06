package GirlFriend;

public class Person {
    private String name;
    private int age;
    private int tall;
    private int tizhong;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTall() {
        return tall;
    }

    public void setTall(int tall) {
        this.tall = tall;
    }

    public int getTizhong() {
        return tizhong;
    }

    public void setTizhong(int tizhong) {
        this.tizhong = tizhong;
    }

    public Person(String name, int age, int tall, int tizhong) {
        this.name = name;
        this.age = age;
        this.tall = tall;
        this.tizhong = tizhong;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", tall=" + tall +
                ", tizhong=" + tizhong +
                '}';
    }
    //吃饭
    public void eat(){
        System.out.println("吃饭" );
    }
    public void sheep(){
        System.out.println("睡觉" );
    }

}
