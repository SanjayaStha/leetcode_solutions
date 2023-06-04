package medianOfTwoSortedArrays;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {1,3};
		int[] b = new int[] {2};
System.out.println(findMedianSortedArrays(a ,b));
	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
       
		int n1 = nums1.length;
		int n2 = nums2.length;
		float median = 0.0f;
		int[] nums = new int[n1+n2];
		
		System.arraycopy(nums1, 0, nums, 0, n1);
        System.arraycopy(nums2, 0, nums, n1, n2);
        
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
		if((n1+n2)%2 == 0) {
			int n = (n1+n2)/2;
			
			median = ((float) nums[n-1] + (float) nums[n])/2;
			
		}else {
			int n = (n1+n2)/2;
			 median = (float) nums[n];
		}
		
		return median;
    }
}
