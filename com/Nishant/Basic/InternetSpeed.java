package com.Nishant.Basic;

import java.util.Scanner;

public class InternetSpeed {
    public static void main(String[] args) {

        Scanner ns = new Scanner(System.in);
        System.out.println("Enter File Size in Mega Bytes");
        int size = ns.nextInt();
        //Convert File Size in Mega Bits
        int File = size*8;
        System.out.println("Enter Speed In Mega Bits");
        int Speed = ns.nextInt();
        //devide File By Speed To Find Time Taken
        int Time = File/Speed;
        System.out.println("Internet Speed = "+Time+" Seconds");
    }
}
