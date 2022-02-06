package com.Nishant.Basic;
import java.util.*;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        int N = ns.nextInt();
        for (int i = 1; i <= N; i++) {
            if (i % 3 == 0)
                System.out.println("Fizz");
             else if (i % 5 == 0)
                System.out.println("Buzz");
            else if(i%15==0)
                System.out.println("FizzBuzz");

        }
    }
}
