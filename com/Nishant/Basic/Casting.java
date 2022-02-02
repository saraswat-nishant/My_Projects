package com.Nishant.Basic;

public class Casting {
    public static void main(String[] args) {
        // print Big data in small units of data
        double price = 100.0;
        double finalprice = price +18;
        System.out.println(finalprice);
        int p = 100;
        int fp = p + (int) 18.89;// Here we want to print value in integer then we
                                // use (int) 18.99
        System.out.println(fp);
    }
}
