package JavaSE.注解.Junit测试.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    /*
     *初始化方法：
     * 申请资源，所有测试方法在执行前都会先执行该方法
     * */
    @Before
    public void init(){
        System.out.println("初始化方法" );
    }

    /*
     *释放资源方法：
     * 申请资源，所有测试方法在执行前都会先执行该方法
     * */
    @After
    public void close(){
        System.out.println("释放资源方法");
    }


    @Test
    public  void testadd(){
        System.out.println("testAdd" );
        //创建计数器对象
        Calculator c = new Calculator();
        //调用add方法
        int result = c.add(1,2);

        //断言，将结果与预想结果比较，正确时，则程序无bug
//        预想结构 3  程序结构 result
        Assert.assertEquals(3,result);

    }



}
