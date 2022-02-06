package com.Nishant.Basic;
import java.util.*;
public class Function {
    public static void printMyName(String name){
        System.out.print(name);
    }

    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        System.out.println("Type Your Name");
        String name = ns.next();
        printMyName(name);
    }
}
