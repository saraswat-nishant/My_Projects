package com.Nishant.Basic.Switch;
import java.util.Scanner;
public class SimpleCalc {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        System.out.println("Enter Any Two Number");
        int a = ns.nextInt();
        int b = ns.nextInt();
        int button = ns.nextInt();
        switch (button){
            case 1 -> System.out.println(a + b);
            case 2 -> System.out.println(a - b);
            case 3 -> System.out.println(a * b);
            case 4 -> System.out.println(a / b);
            default -> System.out.println(a % b);
        }

    }
}
