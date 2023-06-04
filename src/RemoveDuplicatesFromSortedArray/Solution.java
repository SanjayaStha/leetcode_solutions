package RemoveDuplicatesFromSortedArray;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {

        int[] nums = new int[] {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }

    public static int removeDuplicates(int[] nums) {

        int temp = 1;
        for (int i = 1; i < nums.length ; i++) {
            if(nums[i] == nums[i-1]){
            }else{
                nums[temp] = nums[i];
                temp++;
            }
        }

        return temp;
    }
}
