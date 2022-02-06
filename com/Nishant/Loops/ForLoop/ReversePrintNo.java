package com.Nishant.Loops.ForLoop;
import java.util.Scanner;
public class ReversePrintNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        int sum = 0;
        int temp ;
        temp = n ;
        int rem;
        //int rev = 0;
        while(n>0){
        rem = n % 10;
        sum = sum*10 + rem;
        n = n / 10;}
       if(temp == sum)
        {
            System.out.println("The number you entered is Palindrome");
        }
        else
        {
            System.out.println("Not palindrome");
        }

    }
}
