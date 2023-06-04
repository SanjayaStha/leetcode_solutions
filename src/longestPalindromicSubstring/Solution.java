package longestPalindromicSubstring;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println(longestPalindrome("zudfweormatjycujjirzjpyrmaxurectxrtqedmmgergwdvjmjtstdhcihacqnothgttgqfywcpgnuvwglvfiuxteopoyizgehkwuvvkqxbnufkcbodlhdmbqyghkojrgokpwdhtdrwmvdegwycecrgjvuexlguayzcammupgeskrvpthrmwqaqsdcgycdupykppiyhwzwcplivjnnvwhqkkxildtyjltklcokcrgqnnwzzeuqioyahqpuskkpbxhvzvqyhlegmoviogzwuiqahiouhnecjwysmtarjjdjqdrkljawzasriouuiqkcwwqsxifbndjmyprdozhwaoibpqrthpcjphgsfbeqrqqoqiqqdicvybzxhklehzzapbvcyleljawowluqgxxwlrymzojshlwkmzwpixgfjljkmwdtjeabgyrpbqyyykmoaqdambpkyyvukalbrzoyoufjqeftniddsfqnilxlplselqatdgjziphvrbokofvuerpsvqmzakbyzxtxvyanvjpfyvyiivqusfrsufjanmfibgrkwtiuoykiavpbqeyfsuteuxxjiyxvlvgmehycdvxdorpepmsinvmyzeqeiikajopqedyopirmhymozernxzaueljjrhcsofwyddkpnvcvzixdjknikyhzmstvbducjcoyoeoaqruuewclzqqqxzpgykrkygxnmlsrjudoaejxkipkgmcoqtxhelvsizgdwdyjwuumazxfstoaxeqqxoqezakdqjwpkrbldpcbbxexquqrznavcrprnydufsidakvrpuzgfisdxreldbqfizngtrilnbqboxwmwienlkmmiuifrvytukcqcpeqdwwucymgvyrektsnfijdcdoawbcwkkjkqwzffnuqituihjaklvthulmcjrhqcyzvekzqlxgddjoir"));
	
	System.out.println(longestPalindromeExpand("zudfweormatjycujjirzjpyrmaxurectxrtqedmmgergwdvjmjtstdhcihacqnothgttgqfywcpgnuvwglvfiuxteopoyizgehkwuvvkqxbnufkcbodlhdmbqyghkojrgokpwdhtdrwmvdegwycecrgjvuexlguayzcammupgeskrvpthrmwqaqsdcgycdupykppiyhwzwcplivjnnvwhqkkxildtyjltklcokcrgqnnwzzeuqioyahqpuskkpbxhvzvqyhlegmoviogzwuiqahiouhnecjwysmtarjjdjqdrkljawzasriouuiqkcwwqsxifbndjmyprdozhwaoibpqrthpcjphgsfbeqrqqoqiqqdicvybzxhklehzzapbvcyleljawowluqgxxwlrymzojshlwkmzwpixgfjljkmwdtjeabgyrpbqyyykmoaqdambpkyyvukalbrzoyoufjqeftniddsfqnilxlplselqatdgjziphvrbokofvuerpsvqmzakbyzxtxvyanvjpfyvyiivqusfrsufjanmfibgrkwtiuoykiavpbqeyfsuteuxxjiyxvlvgmehycdvxdorpepmsinvmyzeqeiikajopqedyopirmhymozernxzaueljjrhcsofwyddkpnvcvzixdjknikyhzmstvbducjcoyoeoaqruuewclzqqqxzpgykrkygxnmlsrjudoaejxkipkgmcoqtxhelvsizgdwdyjwuumazxfstoaxeqqxoqezakdqjwpkrbldpcbbxexquqrznavcrprnydufsidakvrpuzgfisdxreldbqfizngtrilnbqboxwmwienlkmmiuifrvytukcqcpeqdwwucymgvyrektsnfijdcdoawbcwkkjkqwzffnuqituihjaklvthulmcjrhqcyzvekzqlxgddjoir"));
	}
	
	 public static String longestPalindrome(String s) {
		 
//		 if(s.length()<=1) return s;
		 String palString = "";
		 int window_size = 0;
		 for (int i = 0; i < s.length(); i++) {
			 if(palString.length()==0) {
				 palString = s.charAt(i)+"";
				 window_size++;
			 }
			 
			for (int j = window_size; j < s.length(); j++) {
				if((i+j+2)>s.length())break;
//				System.out.println("i\t"+i+"\tj\t"+j);
				 String subString = s.substring(i,i+j+2);
				 StringBuilder sb=new StringBuilder(subString);  
				    sb.reverse();  
				  String revString = sb.toString();
						  if(revString.equals(subString)) {
						if(palString.length() < subString.length()) {
							palString = subString;
							window_size = subString.length();
						}	
					}				
			}
		}
		 return palString;
	        
	    }

	 
	 public static String longestPalindromeExpand(String s) {
		 
		 if(s.length() <=1 ) return s;
		 
		 if(s.length() == 2 ) {
			 if(s.charAt(0) == s.charAt(1)) return s;
			 else return s.charAt(0)+"";
		 }
		 
		 String palString = "";
		 for (int i = 0; i < s.length(); i++) {
			
			 // for odd string
			int left = i;
			int right = i;
			String string = s.charAt(i)+"";

			while (left>=0 && right<s.length() && s.charAt(right) == s.charAt(left) ) {
				System.out.println("left="+left+"mid="+i+"right="+right);
//				System.out.println("left="+s.charAt(left)+"mid="+s.charAt(i)+"right="+s.charAt(right));
				// check left and right string
				string = s.substring(left,right+1);
				if(string.length() > palString.length()) palString = string;
				System.out.println(string);
				left--;
				right++;
				
			}
			
			left = i;
			right = i+1;
			while (left>=0 && right<s.length() && s.charAt(right) == s.charAt(left) ) {
				System.out.println("left="+left+"mid="+i+"right="+right);
//				System.out.println("left="+s.charAt(left)+"mid="+s.charAt(i)+"right="+s.charAt(right));
				// check left and right string
				string = s.substring(left,right+1);
				if(string.length() > palString.length()) palString = string;
				System.out.println(string);

				left--;
				right++;
				
			}
			
			
			
		}
		 
		 return palString;
	 }
}
