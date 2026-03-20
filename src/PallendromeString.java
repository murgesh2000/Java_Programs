
public class PallendromeString {

	public static boolean ispallendrome(String s) {
		int i = 0;
		int j = s.length()-1;

		while(i<j)
		{
			char ci = s.charAt(i);
			//			System.out.println(ci);
			char cj = s.charAt(j);
			if (!Character.isLetterOrDigit(ci)) 
			{
				i++;
			}else if(!Character.isLetterOrDigit(cj)) 
			{
				j--;
			}else if(Character.toLowerCase(ci) == Character.toLowerCase(cj)) 
			{
				i++;
				j--;
			}else {
				return false;
			}

		}
		return true;
	}

	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		System.out.println(ispallendrome(s));
	}

}
