package reverseInteger;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			System.out.println(reverse(1056389759));
		
	}

	
	public static int reverse(int x) {
        int rev = 0;
        while(x!=0) {
        	int y = x%10;
        	x = x/10;        	
        	if((rev > Integer.MAX_VALUE/10) || (rev == Integer.MAX_VALUE/10 && y>=Integer.MAX_VALUE%10)) return 0;
            if((rev < Integer.MIN_VALUE/10) || (rev < Integer.MIN_VALUE/10 && y<=Integer.MIN_VALUE%10)) return 0;
        	rev = rev * 10 + y;

        }
        
        return rev;
    }
}
