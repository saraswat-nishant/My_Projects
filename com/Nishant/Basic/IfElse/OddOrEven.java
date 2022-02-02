package com.Nishant.Basic.IfElse;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        System.out.println("Enter Number");
        Scanner ns = new Scanner(System.in);
        int No = ns.nextInt();
        if (No % 2 == 0) {
            System.out.println("Number Is Even");
        }else {
            System.out.println("Number Is Odd");
        }

    }
}
