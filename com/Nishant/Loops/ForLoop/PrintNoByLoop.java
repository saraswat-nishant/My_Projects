package com.Nishant.Loops.ForLoop;

public class PrintNoByLoop {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            // Short-circuit operator is used
            if (i % 3 == 0) {
                System.out.println("*");
            } else if (i % 5 == 0){
                System.out.println("$");
            } else if (i % 4 == 0) {
                System.out.println("&");
            }

        }
    }
}
