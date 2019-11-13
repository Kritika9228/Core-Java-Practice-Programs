package com.example.string;

import java.util.Arrays;



/**
 * @author Kritika Gupta
 * Take a reference from https://javaconceptoftheday.com/anagram-program-in-java/
 *
 */
public class AnagramProgram {

	public static void main(String[] args) {
		isAnagram("Mother In Law", "Hitler Woman");
		 
        isAnagram("keEp", "peeK");
 
        isAnagram("SiLeNt CAT", "LisTen AcT");
 
        isAnagram("Debit Card", "Bad Credit");
 
        isAnagram("School MASTER", "The ClassROOM");
 
        isAnagram("DORMITORY", "Dirty Room");
 
        isAnagram("ASTRONOMERS", "NO MORE STARS");
 
        isAnagram("Toss", "Shot");
 
        isAnagram("joy", "enjoy");

	}
	private static void isAnagram(String s1, String s2) {
		boolean status = true;
		//Clean the input
		String copyOfs1 = s1.replaceAll("\\s", "");
		String copyOfs2 = s2.replaceAll("\\s", "");
		//Check the length
		if(copyOfs1.length() != copyOfs2.length()) {
			status=false; 
		}else {
			//Convert to char array
			char[] c1 =copyOfs1.toLowerCase().toCharArray();
			char[] c2 =copyOfs2.toLowerCase().toCharArray();
			//Use Arrays in built method to sort char array
			Arrays.sort(c1);
			Arrays.sort(c2);
			//use Arrays in-built method to check equality
			status =Arrays.equals(c1, c2);
		}
		if(status)
        {
            System.out.println(s1+" and "+s2+" are anagrams");
        }
        else
        {
            System.out.println(s1+" and "+s2+" are not anagrams");
        }
	}
}
