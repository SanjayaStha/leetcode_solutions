package subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(subsets(new int[]{1,2,2}).toArray()));

    }

    public static List<List<Integer>> subsets(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> finalList = new ArrayList<>();
        finalList.add(new ArrayList<>());
        for (int i = 0; i <nums.length ; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(nums[i]);
            if(!finalList.contains(temp)){
                finalList.add(temp);
            }
            generateSubsets(nums, temp, finalList, i+1);
        }



        return finalList;
    }

    public int getSum(List<List<Integer>> finalList){

        return 0;
    }
    public static List<List<Integer>> generateSubsets(int[] nums, List<Integer> numsl, List<List<Integer>> finalList, int index){
        for (int i = index; i <nums.length ; i++) {
            List<Integer> temp = new ArrayList<>(numsl);
            temp.add(nums[i]);
            Collections.sort(temp);

            if(!finalList.contains(temp)){
                finalList.add(temp);
            }
            generateSubsets(nums, temp, finalList, i+1);
        }
        return null;
    }


}
