package practise;

public class vowelConsonents {

	public static void main(String[] args) {
		
		String s = "Automation Testing";
		
		int vowels = 0;
		int consonents = 0;
		
		s=s.toLowerCase();
		
		for(int i=0;i<= s.length()-1;i++)
		{
			char ch = s.charAt(i);
			
			if(Character.isLetter(ch))
			{
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
				{
					vowels++;
				}
				else {
					consonents++;
				}
				
			}
		}
		
		
		System.out.println("vowels === " + vowels);
		System.out.println("Consonents === " + consonents);

	}

}
