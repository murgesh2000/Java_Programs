
public class largeOddnoString {

	public static String oddnoString(String s)
	{
		int n = s.length()-1;

		while(n>=0)
		{
			if((s.charAt(n) - '0') % 2 == 1)
			{
				return s.substring(0,n+1);
			}
			n--;
		}
		return "";
	}

	public static void main(String[] args) {

		String s = "5423695001235486";
		System.out.println(oddnoString(s));

	}

}
