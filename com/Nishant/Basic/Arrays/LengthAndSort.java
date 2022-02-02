package com.Nishant.Basic.Arrays;
import  java.util.Arrays;
public class LengthAndSort {
    public static void main(String[] args) {
        int[] marks = new int [3];
        marks[0] = 45;
        marks[1] = 41;
        marks[2] = 43;
        System.out.println(marks.length); // shows the no. of blocks or length of array
        // Sort
        // Result Before Sort
        // Note :- Sort means it print in Ascending Order
        System.out.println(marks[0]);
        // Result After Sort
        Arrays.sort(marks);
        System.out.println(marks[0]);

    }

}
