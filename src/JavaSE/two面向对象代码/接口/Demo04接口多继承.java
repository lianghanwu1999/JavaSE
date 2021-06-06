package JavaSE.SixDay.接口;
/*
接口多继承
类与类之间可以通过继承产生关系
接口和类之间可以通过实现产生关系
多个接口之间可以使用extends进行继承
 */
interface Ful01{
    void show();
}

interface Ful02{
    void show1();
}

interface Ful03{
    void show2();
}

//多个接口之间可以使用extends进行继承
interface Zil01 extends Ful01 ,Ful02,Ful03{
    void show3();
}