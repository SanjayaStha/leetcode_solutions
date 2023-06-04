package containerWithMostWater;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] heights = new int[] {1,8,6,2,5,4,8,3,7};
			System.out.println(maxArea(heights));
			System.out.println(49);
			System.out.println(maxArea2(heights));

	}

	public static int maxArea(int[] height) {
	        
		int length = height.length;
		int left = 0;
		int right = length-1;
		int maxarea = 0;
		int i = 0;
		while(left<right) {
			System.out.println("i:"+i+"\tleft:"+left+"\tright:"+right);
			System.out.println("i:"+i+"\theight[right]:"+height[right]+"\theight[left]:"+height[left]);
			maxarea = Math.max(maxarea, (Math.min(height[right],  height[left])*(right - left)));
			System.out.println("Maxarea\t"+maxarea);
			if(height[right] >= height[left]) {
				left++;
			}else {
				right--;
			}
		}
		i++;
		return maxarea;
	    }
	
	
	 public static int maxArea2(int[] height) {
	        int maxarea = 0;
	        int left = 0; 
	        int right = height.length - 1;
	        while (left < right) {
	            int width = right - left;
	            maxarea = Math.max(maxarea, Math.min(height[left], height[right]) * width);
	            if (height[left] <= height[right]) {
	                left++;
	            } else {
	                right--;
	            }
	        }
	        return maxarea;
	    }
}
