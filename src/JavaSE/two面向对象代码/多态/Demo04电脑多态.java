package JavaSE.SixDay.多态;

//定义鼠标，键盘，笔记本三者之间的应该遵守的规则
//接口
interface USB {
    //接口方法
    void open();  //开启功能
    void close();  //关闭功能
}
//鼠标实现USB规则
class Mouse implements USB{
    public void open(){
        System.out.println("鼠标开启");
    }
    public void close(){
        System.out.println("鼠标关闭");
    }

}

//键盘实现USB规则
class KeyBoard implements USB{
    public void open(){
        System.out.println("键盘开启");
    }
    public void close(){
        System.out.println("键盘关闭");
    }
}

class NoteBook{
    //笔记本开启运行功能
    public void run(){
        System.out.println("笔记本运行");
    }
    //笔记本使用USB设备，这时当笔记本对象调用这个功能时，必须给其传递一个符合USB规则
    public void useUSB(USB usb){
        //判断是否有USB设备
        if(usb != null){
            usb.open();
            usb.close();
        }
    }
    public void shoutDown(){
        System.out.println("笔记本关闭");
    }
}

public class Demo04电脑多态 {
    public static void main(String[] args) {
        //创建笔记本实体对象
        NoteBook nb = new NoteBook();

        //笔记本开启
        nb.run();

        //创建鼠标实体对象
        Mouse m = new Mouse();

        //笔记本使用鼠标
        nb.useUSB(m);

        //创建键盘实体对象
        KeyBoard kb = new KeyBoard();

        //笔记本使用键盘
        nb.useUSB(kb);

        //笔记本关闭
        nb.shoutDown();
    }
}
