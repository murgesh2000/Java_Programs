package AlgoShackInterview;

import java.util.HashMap;
import java.util.Map.Entry;

public class StringManupu {

	public static void main(String[] args) {
		//Print Duplicate characters "Algoshack Technologies"
		String str ="Algoshack Technologies";
		//		char[] ch = str.toCharArray();

		HashMap<Character,Integer> map = new HashMap<>();

		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(Character.isLetter(ch))
			{
				map.put(ch, map.getOrDefault(ch, 0)+1);
			}
		}

//		System.out.println(map);
		
		for(Character  m  : map.keySet())
		{
			if(map.get(m)>1)
			{
				System.out.println(m+"---->"+map.get(m));
			}
		}
		//https://www.cricbuzz.com/cricket-team/india/2/stats

	}

}
