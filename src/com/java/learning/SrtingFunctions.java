package com.java.learning;

import com.java.palindrome.ChkPalindrome;
import com.java.repeate.RepeatingCharacters;


public class SrtingFunctions {

    public static void main(String args[]) {

		        /*String originalSrting = "manchester" ;
		        System.out.println("The original string is = " + originalSrting);
		 
		        String reverseString = com.java.reverse.Reverse.stringreverse(originalSrting);
		        System.out.println("reversed string is = " + reverseString );*/
        //com.java.reverse.ReverseWords.stringtokinizer("manchester is the best ");
        boolean chkPalindrome = com.java.palindrome.ChkPalindrome.isPalindrome(null);
        if (chkPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}

		       /* RepeatingCharacters dup = new RepeatingCharacters();
		        dup.find();*/

// System.out.println("The No of duplicates is :" + dup.count);


