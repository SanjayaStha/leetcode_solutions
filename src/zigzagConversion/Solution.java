package zigzagConversion;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("PAYPALISHIRING");

		System.out.println(convert("PAYPALISHIRING",4));
//		PAHNAPLSIIGYIR
		System.out.println("PINALSIGYAHRPI");
	}
	
	
	public static String convert(String s, int numRows) {
	        
		int len = s.length();
		if(len == 1 || numRows == 1) return s;
		String string = "";
		for (int i = 0; i < numRows; i++) {
				int next = 2 * (numRows-1);
				for (int j = i; j < len; j+=next) {
					string += s.charAt(j);
					if(i>0 && i<numRows-1 && (j+next-2*i) < len) {
						string += s.charAt(j+next-2*i);
					}
				}
			}
	return string;
	}

}
