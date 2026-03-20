
public class MaxConsecutive {

	public static void main(String[] args) {


		int[] nums = {0,1,0,0,1,2,3,0,0,0,1,1};
		int max = 0;
		int x = 0;		
		for (int i = 0; i < nums.length; i++) {
			
			if (nums[i]>0) {
				x++;
			}
			else {
				max = Math.max(max, x);
				x=0;
			}
			
		}
		
		System.out.println("No of Consuective = "+max);

}

}