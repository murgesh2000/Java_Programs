
public class ReverseString2 {

	public static void main(String[] args) {
		
		String s = "abcdefghi";
		int k = 2;
		char[] arr = s.toCharArray();
//		System.out.println(arr);
		for (int i = 0; i < arr.length; i=i+k*2) {
			int left = i;
			int right = Math.min(i+k-1,arr.length-1);
			while (left<right) 
			{
				char temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
			
		}
		System.out.println(arr);

	}

}
