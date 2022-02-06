package com.Nishant.Loops;
import java.util.*;
public class PrintNaturalNumber {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        int n = ns.nextInt();
        int Sum = 0;

        for (int i = 1; i <= n; i++){
            Sum = Sum+i;
        }
        System.out.println(Sum);
    }
}
