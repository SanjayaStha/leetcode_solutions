package trappingRainWater;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] height = new int[] {4,2,3};

        System.out.println(trap(height));
    }

    public static int trap(int[] height) {

        int trapped_water = 0;
        int low_limit = height[0];
        int high_limit = 0;
        int middle_height = 0;
        int gap_between_limit = 0;
        int idx = -1;
        for (int i = 0; i <height.length ; i++) {
            int limit = height[i];
            if(limit>=low_limit){
                trapped_water += low_limit * gap_between_limit;
                trapped_water = trapped_water - middle_height;
                low_limit = limit;
                middle_height = 0;
                gap_between_limit = 0;
                idx = i;
            }
            if(limit<low_limit){
                high_limit = limit;
                middle_height += limit;
                gap_between_limit++;
            }

            System.out.println("low_limit\t"+low_limit+"\t"+"high_limit\t"+limit);
            System.out.println("trapped_water\t"+trapped_water+"\t"+"middle_height\t"+middle_height+"gap_between_limit\t"+gap_between_limit);
        }

        System.out.println("Reverse");
         low_limit = height[height.length-1];
         high_limit = 0;
         middle_height = 0;
         gap_between_limit = 0;
        for (int i = height.length-1; i >=idx ; i--) {
            int limit = height[i];
            if(limit>=low_limit){
                trapped_water += low_limit * gap_between_limit;
                trapped_water = trapped_water - middle_height;
                low_limit = limit;
                middle_height = 0;
                gap_between_limit = 0;
            }
            if(limit<low_limit){
                high_limit = limit;
                middle_height += limit;
                gap_between_limit++;
            }
            System.out.println("low_limit\t"+low_limit+"\t"+"high_limit\t"+limit);
            System.out.println("trapped_water\t"+trapped_water+"\t"+"middle_height\t"+middle_height+"gap_between_limit\t"+gap_between_limit);

        }


        return trapped_water;
    }


}
