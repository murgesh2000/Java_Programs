package practise;

public class removeDuplicateArray {
	
	public static void main(String args[]) {
		
		int[] nums = {0,1,1,2,3,4,4,5,6,6,7};
		int x=0;
		
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]>nums[x])
			{
				x++;
				nums[x] = nums[i];
			}
		}
		
		System.out.println("Total no of unique element ===>"+ (x+1));
		
		for(int i=0;i<=x;i++)
		{
			System.out.println(nums[i]);
		}
		
	}

}
