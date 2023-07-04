package single_number_ii;

import java.util.HashMap;
import java.util.Map.Entry;

public class Solution {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[] {0,1,0,1,0,1,99}));
    }

    /**
     * @param nums
     * @return
     */
    public static int singleNumber(int[] nums) {

        HashMap<Integer, Integer> number_map = new HashMap<Integer, Integer>();
        
        for(int i: nums){
            if(number_map.keySet().contains(i)){
                number_map.put(i, number_map.get(i)+1);
                continue;
            }
            number_map.put(i,1);

        }
        System.out.println(number_map.toString());
        for(Entry<Integer, Integer> obj: number_map.entrySet()){
            if(obj.getValue()==1){
                return obj.getKey();
            }
        }

        return -1;
    }
}
