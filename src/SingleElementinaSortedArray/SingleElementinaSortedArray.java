package SingleElementinaSortedArray;

public class SingleElementinaSortedArray {

    public static void main(String[] args) {
        System.out.println(singleNonDuplicate(new int[] {1,1,2,3,3,4,4,8,8}));
    }
    
    public static int singleNonDuplicate(int[] nums) {
        
        if(nums.length == 1) return nums[0];

        return findSingleNonDuplicate(nums);

        // return findSingleNonDuplicate(nums, 0, nums.length-1);
    }

    public static int findSingleNonDuplicate(int[] nums, int start, int end){ // 0 9
        // using recursion
        int mid = (start + end)/2; // 3
        if((end-start) == 1 && start !=0) return nums[end];
        if((end-start) == 1 && start ==0) return nums[start];
        if(mid == 0) return nums[0];
        if((nums[mid] != nums[mid-1]) && (nums[mid]!=nums[mid+1])) return nums[mid];
        
        // if((end-start) == 1) return nums[end];

        if(mid%2 == 0){
            // even index
            if(nums[mid] == nums[mid+1]){
                return findSingleNonDuplicate(nums, mid+1, end);
            }else {
                return findSingleNonDuplicate(nums, start, mid-1);
            }

        }else {
            // odd index
            if(nums[mid] == nums[mid-1]){
                return findSingleNonDuplicate(nums, mid, end);
            }else {
                return findSingleNonDuplicate(nums, start, mid-1);

            }

        }
      
    }

    public static int findSingleNonDuplicate(int[] nums){ // 0 9

        // using while loop

        int start = 0;
        int end = nums.length - 1;

        while(start < end){

            if(nums[0] != nums[1]) return nums[0];
            if(nums[nums.length - 1] != nums[nums.length - 2]) return nums[nums.length - 1];

            int mid = (start + end ) / 2;

            if(mid == 0 ) return nums[mid];
            if((end - start) == 1 && start==0) return nums[start];
            if((end - start) == 1 && start!=0) return nums[end];
            if(nums[mid] != nums[mid-1] && nums[mid] == nums[mid+1]) return nums[mid];

            if(mid%2==0){
                start = mid+1;
            }else {
                end = mid-1;
            }
        }


        // {-1,0,0,1,1}


        return 0;
    }

}
