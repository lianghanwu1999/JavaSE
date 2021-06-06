package JavaSE.SixDay.接口;

interface 缉毒{
    //抽象方法
    public abstract void 缉毒();
}

//定义犬科的这个提醒的共性功能  //抽象类
abstract class 犬科{
    public abstract void 吃饭();
    public abstract void 吼叫();
}

//缉毒犬属于犬科一种，让其继承犬科，获取的犬科的特性
//由于缉毒犬具有缉毒功能，那么它要实现缉毒犬接口即可，这样既保证缉毒犬具备犬科的特性
class 缉毒犬 extends 犬科 implements 缉毒 {
    public void 缉毒(){
    }
    public void 吃饭(){
    }
    public void 吼叫(){
    }
}
//创建子类缉毒猪，也获取缉毒犬科的接口
class 缉毒猪 implements 缉毒{
    //重写缉毒的抽象方法，将其可以使用
    public void 缉毒(){
    }
}