package validParentheses;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(isValid("[]"));
System.out.println(false);
	}
	
	 public static boolean isValid(String s) {
	     
		 Stack<String> stack = new Stack<String>();
		 HashMap<String, String> map = new HashMap<String, String>();
		 
		 map.put("]", "[");
		 map.put(")", "(");
		 map.put("}", "{");
		 
		 String[] st = s.split("");
//		 System.out.println(map.keySet());
		 for (String ss : st) {
			if(map.keySet().contains(ss)) {
				String a = stack.pop();
				String b = map.get(ss);
				if(a.equals(b)) {
					continue;
				}else {
					return false;
				}
			}else {
				stack.push(ss);
			}
		}
		 
		 if(stack.isEmpty()) {
			 return true;
		 }
		 
		 return false;
	    }

}
