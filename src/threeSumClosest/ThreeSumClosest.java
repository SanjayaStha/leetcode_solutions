package threeSumClosest;

import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[] args) {
        int[] nums = new int[] {4,0,5,-5,3,3,0,-4,-5};
        //[4,0,5,-5,3,3,0,-4,-5]
        //        -2
        int target = -2;
        System.out.println(threeSumClosest(nums, target));
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum = 0;
        int closest = 0;
        int maxDiff = Integer.MAX_VALUE;
        System.out.println(nums.length);
        for (int i = 0; i <nums.length-2 ; i++) {
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            for (int j = i+1; j <nums.length-1 ; j++) {
                if(j>i+1 && nums[j] == nums[j-1]){
                    continue;
                }

                for (int k = j+1; k <nums.length ; k++) {
                    if(k>j+1 && nums[k] == nums[k-1]){
                        continue;
                    }
                    sum = nums[i] + nums[j] + nums[k];
                    int diff = sum - target;
                    System.out.println(nums[i]+","+nums[j]+","+nums[k]);
                    System.out.println("Sum:\t"+sum);
                    System.out.println("diff:\t"+diff);
                    System.out.println("Closest:\t"+ closest);
                    System.out.println("maxDiff:\t"+ maxDiff);
                    System.out.println();
                    if(Math.abs(diff) < maxDiff){
                        maxDiff = Math.abs(diff);
                        closest = sum;
                    }else{
//                        break;
                    }
                }
            }
        }

        return closest;
    }

}
