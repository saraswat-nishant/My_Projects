package com.Nishant.Basic.Switch;

import java.util.Scanner;

public class MonthNumber {
    public static void main(String[] args) {
        System.out.println("Enter Any Number 1 To 12");
        Scanner ns = new Scanner(System.in);
        int button = ns.nextInt();
        switch (button) {
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("November");
            case 11 -> System.out.println("October");
            default -> System.out.println("December");
        }

    }
}
