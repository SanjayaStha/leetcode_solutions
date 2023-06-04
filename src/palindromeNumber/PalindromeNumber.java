package palindromeNumber;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println(isPalindrome(121));
	}

	public static boolean isPalindrome(int x) {
        
		boolean isNeg = x<0?true:false;
		int org = x;
		if(isNeg) return false;
		int rev = 0;
		while(x>0) {
			rev = rev*10 + x%10;
			x /= 10;
		}
		
		if(rev == org) return true;
		
		return false;
    }
}
