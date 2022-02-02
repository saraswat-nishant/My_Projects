package com.Nishant.Basic.String;

public class ReplaceChar {
    public static void main(String[] args) {
        String x = "Nishant";
        //Replace String And Characters*/
        String y = x.replace('i' , 'b');// Only Change 2nd Result will change
        //original String will Not change
        System.out.println(y);
        System.out.println(x);// Original String Is Not Changed
        String z = x.replaceAll("Nishant","Saraswat");// replace a word
        System.out.println(z);
        //Replace all Character of a Sentence
        String a = "My Name Is Nishant Saraswat";
        String b = a.replaceAll("a","e");// Replace all "a" with "e"
        System.out.println(b);
        //Remove Space Between Words
        String c = a.replaceAll("\\s","");/*   Remove all The Space
        Between Words   */
        System.out.println(c);
        // To Return A small Part Of a Long String
        System.out.println(a.substring(8,10));// give 8-9 part of String
    }
}
