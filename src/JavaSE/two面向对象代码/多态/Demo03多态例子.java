package JavaSE.SixDay.多态;

 /*
	描述毕老师和毕姥爷，
	毕老师拥有讲课和看电影功能
	毕姥爷拥有讲课和钓鱼功能
  */

class BiLaoYe{
    void JiangKe(){
        System.out.println("政治");
    }
    void DiaoYu(){
        System.out.println("钓鱼");
    }
}

// 毕老师继承了毕姥爷，就有拥有了毕姥爷的讲课和钓鱼的功能，
// 但毕老师和毕姥爷的讲课内容不一样，因此毕老师要覆盖毕姥爷的讲课功能
class BiLaoShi extends BiLaoYe {
    void JiangKe(){
        System.out.println("java");
    }

    void KanDianYing(){
        System.out.println("看电影");
    }
}

public class Demo03多态例子 {
    public static void main(String[] args) {
        //多态形式
        BiLaoYe a = new BiLaoShi();  //向上转型
        a.JiangKe(); // 这里表象是毕姥爷，其实真正讲课的仍然是毕老师，因此调用的也是毕老师的讲课功能
        a.DiaoYu();  // 这里表象是毕姥爷，但对象其实是毕老师，而毕老师继承了毕姥爷，即毕老师也具有钓鱼功能


        //当要填用毕业特有看电影功能时，就必须进行类型转换
        BiLaoShi b = (BiLaoShi) a;  //向下转型
        b.KanDianYing();
    }
}
