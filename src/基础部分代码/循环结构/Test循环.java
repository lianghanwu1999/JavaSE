package 基础部分代码.循环结构;

import java.util.Scanner;

public class Test循环 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How much money will you need to retire?");
        double goal = in.nextDouble();

        System.out.print("How much money will you contribute every year?");
//        读取并转换下一个浮点数列
        double payment = in.nextDouble() ;

        System.out.print("Interest rate in %:");
        double interestRate = in.nextDouble();

        double balance = 0;
        int years = 0;

        while (balance <goal)
        {
            balance += payment;
            double interest = balance * interestRate /100;
            balance += interest;
            years ++;
        }
    }
}
