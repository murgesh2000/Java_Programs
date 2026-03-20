
public class DuplictesArray {

	public static void main(String[] args) {
		
		int []nums = {0,1,1,2,2,2,3,5,9,10,10};
		int x = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]>nums[x]) {
				x++;
				nums[x]=nums[i];
			}
		}
		
		for (int i = 0; i < x+1; i++) {
			System.out.print("|"+nums[i]+"|");
		}
		System.out.println("");
		System.out.println(x+1);
		
		
		
		
		
	}

}
