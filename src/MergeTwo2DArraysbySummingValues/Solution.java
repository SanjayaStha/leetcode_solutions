package MergeTwo2DArraysbySummingValues;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    

    // nums1 = [   [1,2],   [[1,4],     [1,6]
                // [2,3],   [3,2]       [2,3]
                // [4,5]    [4,1]       [4,6]
    // Output: [[1,6],[2,3],[3,2],[4,6]]
    //          [[1, 6], [2, 3], [3, 2], [4, 6]]


    public static void main(String[] args) {

        int[][] nums1 = new int[][] {{148,597},{165,623},{306,359},{349,566},{403,646},{420,381},{566,543},{730,209},{757,875},{788,208},{932,695}};

int[][] nums2 = new int[][] {{74,669},{87,399},{89,165},{99,749},{122,401},{138,16},{144,714},{148,206},{177,948},{211,653},{285,775},{309,289},{349,396},{386,831},{403,318},{405,119},{420,153},{468,433},{504,101},{566,128},{603,688},{618,628},{622,586},{641,46},{653,922},{672,772},{691,823},{693,900},{756,878},{757,952},{770,795},{806,118},{813,88},{919,501},{935,253},{982,385}};
        mergeArrays(nums1, nums2);
    }



    public static int[][] mergeArrays(int[][] nums1, int[][] nums2) {
       
        HashMap<Integer, Integer> map = new HashMap<>();
        int highIndex = Integer.MIN_VALUE;

        for (int[] is : nums2) {
            if(map.containsKey(is[0])){
                map.put(is[0], map.get(is[1])+is[1]);

            }else{
                map.put(is[0], is[1]);
            }

            if(is[0]>highIndex) highIndex = is[0];
        }

        for (int[] is : nums1) {
            if(map.containsKey(is[0])){
                map.put(is[0], map.get(is[0])+is[1]);


            }else{
                map.put(is[0], is[1]);
            }

            if(is[0]>highIndex) highIndex = is[0];

        
        
        }

        TreeMap<Integer,Integer> tm=new  TreeMap<Integer,Integer> (map);  


        int[][] values = new int[map.size()][2];
        int index = 0;
        for (Map.Entry<Integer, Integer> mapEntry : tm.entrySet()) {
            int[] value = new int[2];
            value[0] = (int) mapEntry.getKey();
            value[1] = (int) mapEntry.getValue();

            values[index] = value;
            index++;
        }

        System.out.println(Arrays.deepToString(values));

        return values;
    }
}



// ex: [[74,669],[87,399],[89,165],[99,749],[122,401],[138,16],[144,714],[148,803],[165,623],[177,948],[211,653],[285,775],[306,359],[309,289],[349,962],[386,831],[403,964],[405,119],[420,534],[468,433],[504,101],[566,671],[603,688],[618,628],[622,586],[641,46],[653,922],[672,772],[691,823],[693,900],[730,209],[756,878],[757,1827],[770,795],[788,208],[806,118],[813,88],[919,501],[932,695],[935,253],[982,385]]

// [[74, 669], [87, 399], [89, 165], [99, 749], [122, 401], [138, 16], [144, 714], [148, 803], [165, 623], [177, 948], [211, 653], [285, 775], [306, 359], [309, 289], [349, 
// 962], [386, 831], [403, 964], [405, 119], [420, 534], [468, 433], [504, 101], [566, 671], [603, 688], [618, 628], [622, 586], [641, 46], [653, 922], [672, 772], [691, 823], [693, 900], [730, 209], [756, 878], [757, 1827], [770, 795], [788, 208], [806, 118], [813, 88], [919, 501], [932, 695], [935, 253], [982, 385]]