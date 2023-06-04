package longestCommonPrefix;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = new String[] {"c","acc","ccc"};
		
		System.out.println(longestCommonPrefix(strs));
		System.out.println("");

	}

	
		public static String longestCommonPrefix(String[] strs) {
		        
			if(strs.length ==1) {
				return strs[0];
			}
			if(strs.length ==0) {
				return "";
			}
			
			if(Arrays.asList(strs).contains("")) {
				return "";
			}
			
			String subString = strs[0];
			
			for (int i = 0; i < strs.length; i++) {
				if(strs[i].length() <= subString.length()) {
					if(subString.equals(strs[i])) {
						subString = strs[i];
					}else {
						int j = strs[i].length();
						while(!strs[i].substring(0, j).equals(subString.substring(0, j) )&& j>=0) {
							j--;
						}
						if(j<0) {
							return "";
						}
						
						subString = subString.substring(0, j); 
					}
				}else {
					if(strs[i].equals(subString)) {
//						subString = strs[i];
					}else {
						int j = subString.length();
						while(!strs[i].substring(0, j).equals(subString.substring(0, j) )&& j>=0) {
							j--;
						}
						if(j<0) {
							return "";
						}
						
						subString = subString.substring(0, j); 
					}
				}
			}
			
			
			return subString;
		}
}
