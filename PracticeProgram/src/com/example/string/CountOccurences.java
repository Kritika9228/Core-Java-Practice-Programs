package com.example.string;

import java.util.HashMap;
import java.util.Map;


public class CountOccurences {
	public static void main(String[] args) {
		String masterValue = "The best way to complain is to make something";
		char[] masterValArr = masterValue.toCharArray();
		Map<Character, Integer> occuranceMap = new HashMap();
		System.out.println("Before"+occuranceMap );
		for(char a : masterValArr) {
			if(Character.isWhitespace(a)){
				continue;
			}else {
			if(occuranceMap.containsKey(a)) {
				//occuranceMap.replace(a, occuranceMap.get(a)+1);
				occuranceMap.put(a,occuranceMap.get(a)+1);
			}else {
				occuranceMap.put(a,1);
			}
		}}
		System.out.println("After"+occuranceMap );
	}

}

/**
 * @author Kritika Gupta
 * Key Notes
 *
 * 1) The java.lang.Character.isWhitespace() is an inbuilt method in a java that determines if the specified character (Unicode code point) is white space according to Java
 * 2) put() - This can be used to replace a value also because
 * 			  we can insert a specific key and the value it is mapping to into a particular map. If an existing key is passed then the previous value gets replaced by the new value. 
 * 			  If a new pair is passed, then the pair gets inserted as a whole
 * 3) replace() - to replace the value of the specified key only if the key is previously mapped with some value. 
 * 				  Parameters: This method accepts two parameters: key: which is the key of the element whose value has to be replaced
 * 4) Difference between put() and replace() -
 * 		This means that if there is already a mapping for the given key, both put and replace will update the map in the same way.
		Both will also return the previous value associated with the key. 
 * 		However, if there is no mapping for that key, then replace will be a no-op (will do nothing) whereas 
 * 		put will still update the map
 * 5) Return type of put() or replace() -
 * 		It returns the previous value associated with key, or null if there was no mapping for key. 
 */