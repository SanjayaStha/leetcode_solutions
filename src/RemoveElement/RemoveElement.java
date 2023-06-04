package RemoveElement;

import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {
        int[] nums = new int[] {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(nums, 2));
        System.out.println(Arrays.toString(nums));

//        [0,1,2,2,3,0,4,2]
//        2

    }
    public static int removeElement(int[] nums, int val) {

        int idx = 0;
        int counter = 0;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i] == val){
                counter++;
            }else {
                nums[idx] = nums[i];
                idx++;
            }
        }

        return idx;
    }
}
