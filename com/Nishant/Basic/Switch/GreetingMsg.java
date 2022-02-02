package com.Nishant.Basic.Switch;

import java.util.Scanner;

public class GreetingMsg {
    public static void main(String[] args) {
        System.out.println("Press Any Button");
        Scanner ns = new Scanner(System.in);
        int button = ns.nextInt();
        switch (button) {
            case 1 -> System.out.println("Namaste");
            case 2 -> System.out.println("Good Morning");
            case 3 -> System.out.println("Good Evening");
            case 4 -> System.out.println("Lage-Rah");
            default -> System.out.println("Invalid Button");
        }

    }
}
