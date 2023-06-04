package romanToInteger;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(romanToInt("III"));
		System.out.println(3);
		
	}

		
	public static int romanToInt(String s) {
	        
//		int[] romanNumber = new int[] {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String[] romanLetter = new String[] {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		int num = 0;
		
		map.put("M", 1000);
		map.put("CM", 900);
		map.put("D", 500);
		map.put("CD", 400);
		map.put("C", 100);
		map.put("XC", 90);
		map.put("L", 50);
		map.put("XL", 40);
		map.put("X", 10);
		map.put("IX", 9);
		map.put("V", 5);
		map.put("IV", 4);
		map.put("I", 1);
		
		for (int i = 0; i<s.length(); i++) {
			
			String key = "";
			
			if(i<s.length()-1)
				key = s.substring(i,i+2);
			
			if(Arrays.asList(romanLetter).contains(key)) {
				i++;
			}else {
				key = s.substring(i,i+1);
			}
			
			num = num+map.get(key);
//			System.out.println(num);
		}
		
		return num;
    }
}
