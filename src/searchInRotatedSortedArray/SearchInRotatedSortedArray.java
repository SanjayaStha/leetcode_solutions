package searchInRotatedSortedArray;

import java.util.Arrays;

public class SearchInRotatedSortedArray {

    public static void main(String[] args) {

        int[] numbs = new int[] {4,5,6,7,0,1,2};
        int target = 0;
//[4,5,6,7,0,1,2]
//        0

        System.out.println(searchbinary(numbs, target));

    }

    public static int searchbinary(int[] numbs, int target) {
            int lastidx = numbs.length -1;
            for (int i = 0; i <=lastidx ; i++) {
                int midpoint = i + (lastidx-i)/2;
                int first = numbs[i];
                int last = numbs[midpoint];
                if (target >= first || target<=last) {
                if(target == first){
                    return i;
                }
                if(target == last){
                    return midpoint;
                }
                if(i > (midpoint)){
                    return -1;
                }
                lastidx = midpoint-1;
                continue;
            }
            first = numbs[midpoint+1];
            last = numbs[lastidx];
                if (target >= first || target<=last) {
                    if(target == first){
                        return i;
                    }
                    if(target == last){
                        return midpoint;
                    }
                    if(i > (midpoint)){
                        return -1;
                    }
                    i = midpoint+1;
                    lastidx--;
                    continue;
            }
        return -1;
        }


        return -1;
    }

    public static int search(int[] numbs, int target) {

        for (int i = 0; i <numbs.length ; i++) {
            int first = numbs[i];
            int last = numbs[numbs.length-1-i];
            if (target >= first || target<=last) {
                if(target == first){
                    return i;
                }
                if(target == last){
                    return numbs.length-1-i;
                }
                if(i > (numbs.length-1-i)){
                    return -1;
                }
            }else {
                return -1;
            }
        }


        return -1;
    }
}
