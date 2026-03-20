package practise;

import java.util.HashMap;

public class CharacterCount {

	public static void main(String[] args) {
		String str = "Hi Maddy How Are you MMMMM";
		HashMap<Character,Integer> map = new HashMap<>();
		char[] ch = str.toLowerCase().toCharArray();

		for(char c:ch)
		{	
			if(Character.isLetterOrDigit(c))
			{
				map.put(c, map.getOrDefault(c, 0)+1);
			}
		}

		for(Character key  :map.keySet())
		{

			System.out.println(key + " ----> " + map.get(key));

		}

		//		System.out.println(map);
	}

}
