
public class RRLL {

	public static void main(String[] args) {
		
		String s = "LLRRLRLRLLLRRRLR";
		int temp = 0;
		int count = 0;
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'R') 
			{
				temp++;
			}
			else 
			{
				temp--;
			}
			
			if (temp == 0)
			{
				count++;
			}
		}
		
		System.out.println(count);

	}

}
