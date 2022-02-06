package com.Nishant.Loops;
import java.util.*;
public class PrintTable {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        System.out.println("Enter Number to Print Table" );
        int t = ns.nextInt();
        System.out.println("Table Of  "+t);
        for (int i = 1; i < 11; i++){
            System.out.println(t * i);
        }
    }
}