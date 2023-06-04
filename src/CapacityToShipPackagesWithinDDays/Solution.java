package CapacityToShipPackagesWithinDDays;

public class Solution {
    
    public static void main(String[] args) {
        
        System.out.println(shipWithinDays(new int[] {1,2,3,4,5,6,7,8,9,10}, 5));
    }

    public static int shipWithinDays(int[] weights, int days) {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i: weights){
            sum+=i;
            max =Math.max(max, i);
        }
        int mid = 0;
        min = max;
        max = sum;
        System.out.println("Min\t"+min);
        System.out.println("Max\t"+max);

        while(min < max){
            mid = min + (max-min)/2;
            System.out.println("Mid\t"+mid);
            if(checkForCapacity(weights, days, mid)){
                max = mid;
            }else {
                min = mid;
            }

        }

        return (int) mid;
    }

    public static boolean checkForCapacity(int[] weights, int days, int cap){

        int dayCount = 0;
        int cSum = 0;
        int maxCap = cap;
        for(int i : weights){
            if((maxCap - i) < 0){
                maxCap = cap;
                dayCount++;
            }
            if(dayCount > days){
                return false;
            }
            maxCap -= i;
        }

        if(dayCount<= days){
            return true;
        }
        return false;
    }
}

//1963992370 Honda Amfam Variable - TestCases