
package practise;

public class ManualStringSorter {
	public static void main(String[] args) {
		String input = "$Java_RulesA! 101#";

		char[] arr = input.toCharArray();
		char[] result = new char[arr.length];
		int pos = 0;

		for (char c : arr) {
			if (isVowel(Character.toLowerCase(c))) 
				result[pos++] = c;

		}

		for (char c : arr) {
			if (isConsonant(Character.toLowerCase(c))) 
				result[pos++] = c;
		}

		for (char c : arr) {
			if(!Character.isLetter(c))
			{
				result[pos++] = c;
			}
		}

		System.out.println("Result: " + new String(result));
	}

	public static boolean isVowel(char c) {
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ;

	}

	public static boolean isConsonant(char c) {
		return  Character.isLetter(c) && !isVowel(c);
	}
}
