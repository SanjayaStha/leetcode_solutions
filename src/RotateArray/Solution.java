package RotateArray;

import java.util.Arrays;

class Solution {
    /**
     * @param int[] nums - List of numbers to be rotated
     * @param int k - steps by which the array should be rotated
     * @return int[] - Return the rotated array
     */
    public static void main(String[] args) {
        int[] num = rotate(new int[] {-1, -100, 3, 99}, 2);
        System.out.println(Arrays.toString(num));
    }
    public static int[] rotate(int[] nums, int k) {
        int[] result = new int[nums.length];
        for (int i = 0; i <nums.length ; i++) {
            int idx = (i+k)%nums.length;
            result[idx] = nums[i];
            System.out.println(Arrays.toString(result));

        }

        return result;
    }
}