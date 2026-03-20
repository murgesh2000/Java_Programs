import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class vowelConsonents {

	public static void main(String[] args) {

		String s = "banana";
		HashMap <Character,Integer> freq = new HashMap<>();
		for ( Character ch: s.toCharArray()) {
			freq.put(ch, freq.getOrDefault(ch, 0)+1);
		}
		
		int maxV = 0;
		int maxC = 0;
		
		Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
		
		for ( Map.Entry<Character, Integer> entry: freq.entrySet()) {
			char cr = entry.getKey();
			int cnt = entry.getValue();
			
			if(vowels.contains(cr)) {
				 maxV = Math.max(maxV, cnt);
            } else {
                maxC = Math.max(maxC, cnt);
			}
			
			System.out.println(cr+"--->"+cnt);
			
		}
		System.out.println("Maximum Vowles ---->"+maxV);
		System.out.println("Maximum Consonents ---->"+maxC);
	}

}
