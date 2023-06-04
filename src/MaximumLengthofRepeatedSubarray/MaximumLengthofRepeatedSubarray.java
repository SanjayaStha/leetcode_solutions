package MaximumLengthofRepeatedSubarray;

public class MaximumLengthofRepeatedSubarray {

    public static void main(String[] args) {
        int[] num1 = new int[] {1,0,0,0,1,0,0,1,0,0};
        int[] num2 = new int[] {0,1,1,1,0,1,1,1,0,0};

//        [1,0,0,0,1,0,0,1,0,0]
//[0,1,1,1,0,1,1,1,0,0]

//        [0,1,1,1,1]
//        [1,0,1,0,1]


        System.out.println(findLength(num1, num2,0,0, false));
    }

    public static int findLength(int[] nums1, int[] nums2, int idx1, int idx2, boolean flag) {

        int max = 0;
        if(nums1.length == 0 || nums2.length == 0){
            return 0;
        }

        for (int i = idx1; i < nums1.length-1 ; i++) {
            for (int j = idx2; j < nums2.length; j++) {

                if(nums1[i] == nums2[j]){
                    System.out.println("num1: "+nums1[i]+"\tnum2:"+nums2[j]);
//                    System.out.println(true);
                    System.out.println(max);

                    max = Math.max(max,1+findLength(nums1, nums2, i+1,j+1, true));

                }else{
                    if (flag){
                        return max;
                    }
                }
            }
        }
        return max;
    }
}
