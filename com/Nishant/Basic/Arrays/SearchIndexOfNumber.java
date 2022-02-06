package com.Nishant.Basic.Arrays;
import java.util.*;
public class SearchIndexOfNumber {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        int size = ns.nextInt();
        int numbers[] = new int[size];
        //input
        for (int i = 0; i < size; i++) {
            numbers[i] = ns.nextInt();
        }
        int x = ns.nextInt();
        //output
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                System.out.println("Index of the numbers is  " + i);
            }

        }
    }
}