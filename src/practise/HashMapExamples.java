package practise;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapExamples {

	public static void main(String[] args) {

		HashMap<String,Integer> map = new HashMap<>();

		map.put("Maddy",1);
		map.put("Shantha",2);
		map.put("Pooja",3);
		map.put("Muruge",4);
		map.put("Shilpa",5);

		//		System.out.println(map);
		for(Entry<String, Integer> entry:map.entrySet())
		{
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}

		for(String s: map.keySet())
		{
			System.out.println(s);
		}

		for(int v : map.values())
		{
			System.out.println(v);
		}


	}

}
