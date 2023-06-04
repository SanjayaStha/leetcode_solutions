package logestSubstringWithoutRepeating;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.HashMap;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaa";
		System.out.println(lengthOfLongestSubstring(str));
		System.out.println(lengthOfLongestSubstringUsingSet(str));
	}
	
	public static int lengthOfLongestSubstring(String s) {
	      
		int max = 0;
		if(s.length() == 0) return 0;
		String string = new HashSet<String>(Arrays.asList(s.split(""))).toString();
		
		if(string.length() == 1 || string.length() == 2  ) return string.length();
		
		String strings = "";
		for (String st : s.split("")) {
			if(strings.contains(st)) {
				if(max<strings.length()) {
					max = strings.length();
				}
				String[] strs = strings.split(st);
				if(strs.length <= 1) {
					strings = st;
				}else {
					strings = strs[1]+st;
				}
			}else {
				strings += st;

			}
			System.out.println(strings);
		}
		if(max<strings.length()) {
			max = strings.length();
		}
		return max;
	    }


	public static int lengthOfLongestSubstringUsingSet(String s) {

		if(s.length() == 0) return 0;
		
		String string = new HashSet<String>(Arrays.asList(s.split(""))).toString();
		if(string.length() == 1 || string.length() == 2  ) return string.length();
		
		HashSet<Character> set = new HashSet<Character>();
	     int front = 0;
	     int rear = 0;
		int max = 0;
		
		while(front < s.length()) {
			if(!set.contains(s.charAt(front))) {
				set.add(s.charAt(front));
				max = Math.max(max, set.size());
				front++;
			}else {
				set.remove(s.charAt(rear));
				rear++;
			}
		}
		
		return max;
	    }


}
