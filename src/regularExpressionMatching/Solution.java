package regularExpressionMatching;

public class Solution {

	public static void main(String[] args) {
		System.out.println(isMatch("aa","a*"));
		System.out.println("true");
	}
//	"mississippi"
//	"mis*is*p*."

	 public static boolean isMatch(String s, String p) {
	     
		 return check(s,p);
	    }
	 
	public static boolean check(String text, String pattern) {
		
		if(pattern.isEmpty()) return text.isEmpty();
		
		boolean first_match = (!text.isEmpty() && (pattern.charAt(0) == text.charAt(0) || pattern.charAt(0) == '.'));
		if(pattern.length() >=2 && pattern.charAt(1) == '*') {
			return (isMatch(text, pattern.substring(2)) || (first_match && isMatch(text.substring(1), pattern)) );
		} else {
			return first_match && isMatch(text.substring(1), pattern.substring(1));
		}
		
//		return false;
	}
}
