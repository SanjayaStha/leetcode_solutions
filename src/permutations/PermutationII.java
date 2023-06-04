package permutations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationII {

    public static void main(String[] args) {
        int[] nums = new int[] {1,1,2};
        permute(nums);
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> finalList = new ArrayList<>();
        int[] newNums = new int[nums.length-1];
        Arrays.sort(nums);
        boolean isPrev = false;
        for (int i = 0; i <nums.length ; i++) {

            if(isPrev && nums[i] == nums[i-1]){
                continue;
            }

            List<Integer> current = new ArrayList<>();
            current.add(nums[i]);
            for (int j = 0; j <nums.length-1 ; j++) {
                if(j>=i){
                    newNums[j] = nums[j+1];
                }else{
                    newNums[j] = nums[j];
                }
            }
            findPermutations(newNums, i+1,current, finalList);

            isPrev = true;

        }
        System.out.println(finalList.toString());
        return finalList;
    }

    private static void findPermutations(int[] nums, int i, List<Integer> current, List<List<Integer>> finalList) {
        if(nums.length == 0){
            finalList.add(current);
            System.out.println(finalList.toString());
            return;
        }
        System.out.println(i);
        System.out.println();
        List<Integer> current2 = new ArrayList<>(current);
        int[] newNums = new int[nums.length-1];
        boolean isPrev = false;

        for (int j = 0; j <nums.length ; j++) {

            if(isPrev && nums[j] == nums[j-1]){
                continue;
            }

            current2.add(nums[j]);

            for (int j1 = 0; j1 <nums.length - 1 ; j1++) {
                if(j1>=j){
                    newNums[j1] = nums[j1+1];
                }else{
                    newNums[j1] = nums[j1];
                }
            }
            findPermutations(newNums,j+1,current2,finalList);
            current2 = new ArrayList<>(current);
            isPrev = true;
        }
    }

}
