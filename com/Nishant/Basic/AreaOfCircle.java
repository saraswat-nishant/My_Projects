package com.Nishant.Basic;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        System.out.println("Enter radius of circle");
        Scanner ns = new Scanner(System.in);
        float radius = ns.nextFloat();
        float pi = 3.14F;
        float Area = pi * radius * radius;
        System.out.println(Area+"   Square Units");
    }
}
