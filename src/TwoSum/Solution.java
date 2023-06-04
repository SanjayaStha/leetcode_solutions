package TwoSum;
import java.util.Arrays;
import java.util.HashMap;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {2,7,11,15};
		int target = 9;
		System.out.println(Arrays.toString(twoSumHashmap(nums, target)));
	}
	
    public static int[] twoSum(int[] nums, int target) {
        int[] results = null;
        
        int size = nums.length;
        for(int i=0;i<size-1;i++) {
        	for(int j=i+1;j<size;j++) {
        		if((nums[i]+nums[j]) == target) {
            		System.out.println(i+"->"+j);
        			results[0] = i;
        			results[1] = j;
        			return results;
        		}
        	}
        }
    	
    	return results;
    	
    	/**
    	 * Runtime: 58 ms, faster than 39.03% of Java online submissions for Two Sum.
		* Memory Usage: 45.9 MB, less than 30.18% of Java online submissions for Two Sum.
    	 */
    	
    	
    }
    
    // using hashmap
    public static int[] twoSumHashmap(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i=0;i< nums.length;i++) {
        	if(map.containsKey(nums[i])) {
        		return new int[] {map.get(nums[i]), i};
        	}
        		map.put(target-nums[i] , i);
		}
        
        return null;
        
        /**
         * Runtime: 4 ms, faster than 75.63% of Java online submissions for Two Sum.
		* Memory Usage: 45.6 MB, less than 41.48% of Java online submissions for Two Sum.
         */
        
//        Runtime: 4 ms, faster than 75.63% of Java online submissions for Two Sum.
//        Memory Usage: 45.2 MB, less than 55.22% of Java online submissions for Two Sum.
    }

}
