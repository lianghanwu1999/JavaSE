package java核心技术一代码.继承.枚举类;

import java.util.Scanner;

public class EnumTest {
    public static void main(String[] args) {
        //获取键盘输入
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a size: (SMALL MEDIUM,LARGE,EXTRA_LARGE)" );
        //将输入的元素转换为小写
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class,input);
        System.out.println("size="+size);
        System.out.println("abbreviation="+size.getAbbreviation());
        if (size == Size.EXTRA_LARGE)
            System.out.println("Good job--you paid attention to the _." );
    }
enum Size
{
    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");
    private String abbreviation;
    private Size(String abbreviation)
    {
        this.abbreviation = abbreviation;
    }
    public String getAbbreviation()
    {
        return abbreviation;
    }
    }
}
