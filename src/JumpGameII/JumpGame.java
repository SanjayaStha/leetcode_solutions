package JumpGameII;

public class JumpGame {
    public static void main(String[] args) {
        int[] nums = new int[] {2,3,1,1,4};
        System.out.println(jump(nums));
    }

    public static int jump(int[] nums) {
        int count = -1;
        for (int i = 1; i <=nums[0] ; i++) {
           int newcount = nextJump(nums,i,count+1);

           if(newcount > count){
               count = newcount;
           }
        }

        return count;
    }

    public static int nextJump(int[] nums, int index,int count){
    if(index>=nums.length){
        return 0;
    }
    if(index == nums.length -1){
        return count;
    }
//    int newcount = count;
        for (int i = 1; i <=nums[index] ; i++) {
            int newcount = nextJump(nums,i,count+1);

            if(newcount > count){
                count = newcount;
            }
        }

        return count;
    }

}
