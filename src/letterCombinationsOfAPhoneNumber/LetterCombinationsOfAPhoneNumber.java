package letterCombinationsOfAPhoneNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(letterCombinations(""));
		System.out.println("[\"ad\",\"ae\",\"af\",\"bd\",\"be\",\"bf\",\"cd\",\"ce\",\"cf\"]");
	}
	
	
	public static List<String> letterCombinations(String digits) {
		
		if(digits.length()==0 || digits == "") return new ArrayList<String>();
		
		
		List<String> list = new ArrayList<String>();  
		List<String> list2 = new ArrayList<String>();  
		
		String[] alphalStrings = new String[] {"","","abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		
		if(digits.length() == 1) {
			return  new ArrayList<String>(Arrays.asList(alphalStrings[Integer.parseInt(digits)].split("")));
					
		}
		list.add("");
		
		for (String dig : digits.split("")) {
			int id = Integer.parseInt(dig);
			String[] str = alphalStrings[id].split("") ;
			
			list.forEach((s)->{
				for (String si : str) {
					list2.add(s+si);
//					System.out.println(s+si);
				}
			});
			
			list = new ArrayList<>(list2);
			
			list2.clear();
		}
		
		return list;
		
	        
	    }

}
