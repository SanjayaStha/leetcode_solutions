package combinationSumII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CombinationSum {

    public static void main(String[] args) {
       int[] candidates = new int[] {10,1,2,7,6,1,5};
        int target = 8;
        combinationSum2(candidates, target);
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> finalList = new ArrayList<>();
        Arrays.sort(candidates);
        for (int i = 0; i <candidates.length ; i++) {
            if(i>0 && candidates[i] == candidates[i - 1]){
                continue;
            }
            List<Integer> curList = new ArrayList<>();
            curList.add(candidates[i]);
            int diff = target - candidates[i];
            findSumOfCombination(candidates,i+1,diff,curList,finalList);
        }
        System.out.println(finalList.toString());
        return finalList;

    }

    private static void findSumOfCombination(int[] candidates, int index,int target, List<Integer> curList, List<List<Integer>> finalList) {

//        System.out.println("index: "+index+"\ttarget: "+target+"\tcurlist: "+curList.toString());
        if(target == 0){
            if(!finalList.contains(curList)){
                finalList.add(curList);
            }
            return;
        }
        if(target < 0){
            return;
        }
        if(index > candidates.length){
            return;
        }
        boolean isPrev = false;
        for (int j = index; j < candidates.length ; j++) {
            if(isPrev && candidates[index] == candidates[index-1]){
                continue;
            }
            List<Integer> curList2 = new ArrayList<>(curList);
            curList2.add(candidates[j]);
            int diff  = target - candidates[j];
            findSumOfCombination(candidates,j+1,diff,curList2,finalList);
            isPrev = true;
        }


    }


}
