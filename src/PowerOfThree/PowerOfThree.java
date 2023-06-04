package PowerOfThree;

import java.math.BigDecimal;

public class PowerOfThree {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree2(1162261467));
    }
    public static boolean isPowerOfThree(int n) {

        try {
            String baseChange = Long.toString(n, 3);
            BigDecimal actual = new BigDecimal(baseChange);
            int len = baseChange.length();
            BigDecimal value = new BigDecimal(String.valueOf(Math.pow(10,len-1)));
            int check = value.divide(actual).intValue();
            return check == 1;
        }catch (Exception ex){
            System.out.println(ex);
            return false;
        }
    }

    public static boolean isPowerOfThree2(int n) {

        try {
            String baseChange = Long.toString(n, 3);
           return  baseChange.matches("^10*$");
        }catch (Exception ex){
            System.out.println(ex);
            return false;
        }
    }


}
