package generateParentheses;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(generateParenthesis(1));
		System.out.println(generateParenthesis(3));
		System.out.println(generateParenthesis(4));
	}

	public static List<String> generateParenthesis(int n) {
	      
		List<String> list = new ArrayList<String>();
		getParenthesis(n,0,0,"", list);
				return list;
		
	    }
	
	public static void getParenthesis(int n, int open, int close, String str, List list) {
		
		if(open == n && close == n) {
			list.add(str);
			return;
		}
		
		if(close > open) {
			return;
		}
		
		if(close > n) {
			return;
		}
		if(open > n) {
			return;
		}
	
		
		getParenthesis(n,open+1,close,str+"(",list);
		getParenthesis(n,open,close+1,str+")",list);
		
	}
}
