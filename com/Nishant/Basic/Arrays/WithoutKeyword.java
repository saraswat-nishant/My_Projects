package com.Nishant.Basic.Arrays;

public class WithoutKeyword {
    public static void main(String[] args) {
        // For Single Array for Single User
        int [] marks = {95,87,59};
        // For double Array for Two User
        int[][] finalmarks = {{95,87,59}, {82,88,55}};
        System.out.println(finalmarks[0][0]);// 1st student marks of 1st subject
        System.out.println(finalmarks[0][1]);
        System.out.println(finalmarks[0][2]);
        System.out.println(finalmarks[1][0]);
        System.out.println(finalmarks[1][1]);
        System.out.println(finalmarks[1][2]);


    }
}
