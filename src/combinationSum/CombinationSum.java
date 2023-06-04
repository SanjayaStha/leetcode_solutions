package combinationSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CombinationSum {

    public static void main(String[] args) {
        int[] data = new int[] {2,7,6,3,5,1};
        int target = 9;
        combinationSum(data, target);
        System.out.println("[[1,1,1,1,1,1,1,1,1],[1,1,1,1,1,1,1,2],[1,1,1,1,1,1,3],[1,1,1,1,1,2,2],[1,1,1,1,2,3],[1,1,1,1,5],[1,1,1,2,2,2],[1,1,1,3,3],[1,1,1,6],[1,1,2,2,3],[1,1,2,5],[1,1,7],[1,2,2,2,2],[1,2,3,3],[1,2,6],[1,3,5],[2,2,2,3],[2,2,5],[2,7],[3,3,3],[3,6]]\n");
//[2,7,6,3,5,1]
//        9
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> finalList = new ArrayList<>();
        Arrays.sort(candidates);
        for (int i=0; i<candidates.length; i++){
            int curr = candidates[i];
            System.out.println(curr);

            List<Integer> in = new ArrayList<>();
            int diff = target - curr;
            in.add(curr);

            if(findCombination(candidates,i, diff, in, finalList)){
                if(in.size() != 0){
                    Collections.sort(in);
                    if(!finalList.contains(in)){
                        finalList.add(in);
                    }
                }
            }
//            in = new ArrayList<>();
//            in.add(curr);
//            if(findCombination(new int[]{curr},i, diff, in, finalList)){
//                if(in.size() != 0){
//                    Collections.sort(in);
//                    if(!finalList.contains(in)){
//                        finalList.add(in);
//                    }
//                }
//            }
            System.out.println(finalList.toString());

        }
        return finalList;
    }


    private static boolean findCombination(int[] candidates, int index, int target, List<Integer> in, List<List<Integer>> finallist) {
        if(target == 0){
            return true;
        }
        if(target<0){
           return false;
        }

        if(candidates.length==0){
            return false;
        }

        List<Integer> originalList = new ArrayList<>(in);
        for (int i=index; i<candidates.length; i++){
            int curr = candidates[i];
            int diff = target - curr;
//            int[] newcandidates = new int[candidates.length-1];
//            for (int j = 0; j < candidates.length-1; j++) {
//                if(j>=i){
//                    newcandidates[j] = candidates[j+1];
//                }else{
//                    newcandidates[j] = candidates[j];
//                }
//            }
            in.add(curr);
            if(findCombination(candidates, i, diff, in, finallist)){
                if(in.size() != 0){
                    Collections.sort(in);
                    if(!finallist.contains(in)){
                        finallist.add(in);
                    }
                }
            }
//            in = new ArrayList<>(originalList);
//            in.add(curr);
//            if(findCombination(new int[] {curr}, diff, in, finallist)){
//                if(in.size() != 0){
//                    Collections.sort(in);
//                    if(!finallist.contains(in)){
//                        finallist.add(in);
//                    }
//                }
//            }
            in = new ArrayList<>(originalList);
        }

        return false;
    }


}
