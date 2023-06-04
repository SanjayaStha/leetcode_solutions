package longestValidParentheses;

import java.util.Map;
import java.util.Objects;
import java.util.Stack;

public class LongestValidParentheses {
    public static void main(String[] args) {

        String s = "(()"
                ;
        int x = longestValidParentheses(s);

        System.out.println(x);
    }

    public static int longestValidParentheses(String s) {

        Stack<Integer> stk= new Stack<>();
        stk.push(-1);
        if(Objects.equals(s, "")){
            return 0;
        }
        char[] array = s.toCharArray();
        int len = array.length;

        if(len == 0){
            return 0;
        }
        int temp = 0;
        int total = 0;
        int count = -1;
        boolean isLastOpen = false;

        for (int i = 0; i <s.length() ; i++) {
            if(array[i] == '('){
                stk.push(i);
            }else {
                stk.pop();

                if(stk.empty()){
                    stk.push(i);
                }else{
                    total = Math.max(total, i-stk.peek());
                }
            }

        }

        return total;
    }

}
