package com.Nishant.Basic;

public class MaxAndMin {
    public static void main(String[] args) {
        // For Max ---- Math.max(a,b)
        // For Min ---- Math.min(a,b)
        System.out.println(Math.max(4,8));
        System.out.println(Math.min(503,911));

        // For Random ---- Math.random----It Give random Value B/W 0--1
        System.out.println(Math.random());
        // If we want ot print random only in integer then we will cast it
        System.out.println((int)Math.random());// It will show only 0 because it give value b/w 0-1
        //And integers Start From 0
        System.out.println((int) (Math.random()*100));
    }
}
