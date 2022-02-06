package com.Nishant.Basic;
import java.util.*;
import java.lang.Math;
public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double P = sc.nextDouble();
        double R = sc.nextDouble();
        double Tm = sc.nextDouble();
        /* Calculate compound interest */
        float CI = (float) (P*(Math.pow((1 + R / 100),Tm)));


        System.out.println("Compound Interest is "+ CI);
    }
}
