package com.Nishant.Basic.IfElse;

import java.util.Scanner;

public class AdultNotAdult {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        float age = ns.nextFloat();
        if (age > 18) {
            System.out.println("You Are Adult");
        } else {
            System.out.println("You Are Not Adult");
        }

    }
}
