package com.java.palindrome;
import

public class ChkPalindrome {
	 public static boolean isPalindrome(String original)
	    {
		 int i = original.length()-1;
		    int j=0;
		    while(i > j){
		        if(original.charAt(i) != original.charAt(j)){
		        return false;
		        }
		        i--;
		        j++;
		    }
		  return true;
		}
}
