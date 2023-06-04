package MaximumDifferenceByRemappingDigit;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MaximumDifferenceByRemappingDigit {

    private int min = 0;
    private int max = 0;
    private int num = 0;


    public static void main(String[] args) {
        System.out.println(minMaxDifference(867));
    }
    
    
    
    
    public static int minMaxDifference(int num) {
       
        String nums = String.valueOf(num);
        System.out.println(nums);
       
        Set<Character> uniqueLetters = new HashSet<>();
        
        // Loop through each character in the string and add it to the set if it hasn't been seen before
        for (int i = (nums.length()-1); i >=0 ; i--) {
            char c = nums.charAt(i);
            if (!uniqueLetters.contains(c)) {
                uniqueLetters.add(c);
            }
        }

        int max = Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;

        for (Character ch : uniqueLetters) {
            nums = String.valueOf(num);
            nums = nums.replace(ch+"", "9");
            System.out.println("ch:\t"+ch);
            int max2 = Integer.parseInt(nums);
            System.out.println("max2:\t"+nums);

            nums = String.valueOf(num);

            nums = nums.replace(ch+"", "0");
            int min2 = Integer.parseInt(nums);

            System.out.println("min2:\t"+nums);

            if(max < max2)max = max2;
            if(min2 < min)min = min2;

            System.out.println("max:\t"+max);
            System.out.println("min:\t"+min);


        }


        return max - min;
    }


    public static int maxDiff(int num) {
        String s = String.valueOf(num); // convert num to a string
        int max = num, min = num;
        char from = ' ', to = ' ';
        
        // find the first non-zero digit and set it as 'from'
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '0') {
                from = s.charAt(i);
                break;
            }
        }
        
        // remap 'from' to '9' and set it as 'to'
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == from) {
                s = s.substring(0, i) + '9' + s.substring(i + 1);
            }
        }
        to = '9';
        max = Integer.parseInt(s);
        
        // reset the string to its original value
        s = String.valueOf(num);
        
        // find the first non-one digit and set it as 'from'
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '1') {
                from = s.charAt(i);
                break;
            }
        }
        
        // remap 'from' to '1' if it's not the first digit, otherwise remap it to '0'
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == from) {
                if (i == 0) {
                    s = '0' + s.substring(1);
                } else {
                    s = s.substring(0, i) + '1' + s.substring(i + 1);
                }
            }
        }
        to = (from == s.charAt(0)) ? '0' : '1';
        min = Integer.parseInt(s);
        
        return max - min;
    }
}
