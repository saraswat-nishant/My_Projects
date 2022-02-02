package com.Nishant.Basic;

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        System.out.println("Enter Radius Of Circle");
        Scanner ns = new Scanner(System.in);
        float Radius = ns.nextFloat();
        float pi = 3.14F;
        float Area = 2 * pi * Radius;
        System.out.println(Area+"  Unit");

    }
}
