package practise;

import java.util.HashMap;

public class Check2ArraysSame {

	public static void main(String[] args) {

		int[] arr1 = {1,2,3,4,5,6};
		int[] arr2 = {1,2,3,4,5,6};

		System.out.println("Arrays are same:  "+ isArraySame(arr1,arr2));
	}

	public static boolean isArraySame(int[] arr1, int[] arr2)
	{
		if(arr1.length != arr2.length)
			return false;
		
		HashMap<Integer, Integer> map = new HashMap<>();

		for(int i=0;i<arr1.length;i++)
		{
			map.put(arr1[i], map.getOrDefault(arr1[i], 0)+1);
			map.put(arr2[i], map.getOrDefault(arr2[i], 0)-1);

		}

		for (int count : map.values()) {
			if (count != 0) {
				return false;
			}
		}
		return true;
	}
}