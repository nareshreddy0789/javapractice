package com.java.reverse;

public class Reverse {
	static int i, c = 0, res;

	public static String stringreverse(String s) {
		char[] ch = new char[s.length()];
		for (i = 0; i < s.length(); i++){
			ch[i] = s.charAt(i);	
		}
		String s1 = new String(ch);
		return new String(ch);
	}
}