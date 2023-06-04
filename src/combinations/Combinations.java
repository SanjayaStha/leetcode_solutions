package combinations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combinations {
    public static void main(String[] args) {
        List<List<Integer>> finalList = new ArrayList<>();
        List<Integer> nums = new ArrayList<>();
        combinations(4,2,1,nums, finalList);
        for(List<Integer> f: finalList)
            System.out.println(Arrays.toString(f.toArray()));
    }

    public static List<List<Integer>> combinations(int n, int k,int start, List<Integer> nums, List<List<Integer>> finalList) {
        List<Integer> local = new ArrayList<>(nums);

        for (int i = start; i <=n ; i++) {
            local.add(i);
            if(k==1){
                finalList.add(local);
            }else {
                combinations(n,k-1,i+1,local, finalList);
            }
            local = new ArrayList<>(nums);
        }
        return null;
    }


}
