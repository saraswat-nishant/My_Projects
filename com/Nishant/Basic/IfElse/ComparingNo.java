package com.Nishant.Basic.IfElse;

import java.util.Scanner;

public class ComparingNo {
    public static void main(String[] args) {
        System.out.println("Enter Numbers");
        Scanner ns = new Scanner(System.in);
        double a = ns.nextDouble();
        double b = ns.nextDouble();
        if (a == b) {
            System.out.println("Numbers Are Equal");
        } else {
            if (a > b) {
                System.out.println("First Number Is Greater");
            }
            else {
                System.out.println("Second Number Is Greater");
            }
        }

    }
}
