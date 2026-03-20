package practise;

import java.util.HashMap;

public class Anagram {

	public static void main(String[] args) {
		String s1="anagram";
		String s2="nagaram";

		System.out.println("Given Strings  " +s1 +" and "+s2 +" is "+ isAnagram(s1,s2));

	}

	public static boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) 
			return false;

		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char charS = s.charAt(i);
			char charT = t.charAt(i);

			// Increment for string s
			map.put(charS, map.getOrDefault(charS, 0) + 1);

			// Decrement for string t
			map.put(charT, map.getOrDefault(charT, 0) - 1);
		}

		for (int count : map.values()) {
			if (count != 0) 
				return false;
		}

		return true;
	}

}
