package com.example.string;

public class ReverseEachWordFromString {
	public static void main(String[] args) {
		String sentence = "Mercy man";
		String[] words = sentence.split(" ");
		String reverseString = "";
		for(int i=0;i<words.length;i++) {
			String reverseWord="";
			String word = words[i];
			//1st method using recursion
			reverseWord=reverse(word);
			//2nd method using brute force
//			for(int j=word.length()-1;j>=0;j--) {
//				reverseWord=reverseWord+word.charAt(j);
//			}
			reverseString = reverseString + reverseWord+" ";
		}
		System.out.println("Reverse of "+ sentence+" is = "+reverseString);
	}
	private static String reverse(String str) {
		if(str==null || str.length()<=1) {
			return str;
		}else {
			return reverse(str.substring(1))+ str.charAt(0);
		}
	}
}
/**
 * @author Kritika Gupta
 * 
 * Recursion steps
 * 1) reverse(ercy man)+ M
 * 2) reverse(rcy man) + eM
 * 3) reverse(cy man)+ reM
 * 4) reverse(y man)+ creM
 * 5) reverse( man) + ycreM
 * 6) reverse(man)+  ycreM
 * 7) reverse(an)+ m ycreM
 * 8) reverse(n)+ am ycreM
 * 9) now length is 1 so return nam ycreM
 *
 */