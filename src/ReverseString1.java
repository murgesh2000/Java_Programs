
public class ReverseString1 {

	public static void main(String[] args) {
		String s = "Hello Maddy";
		char[] sChar=s.toCharArray();
		int left = 0;
		int right = sChar.length-1;
		while(left<right) {
			char temp = sChar[left];
			sChar[left] = sChar[right];
			sChar[right] = temp;
			left++;
			right--;
		}
		
		System.out.println(sChar);
	}

}
