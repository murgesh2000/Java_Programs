package practise;

public class EvenOddShifter {

	public static void main(String[] args) {
		int[] arr = {2, 5, 8, 7, 1, 3, 6, 4, 5, 9};

		rearrange(arr);

		// Print the result
		System.out.print("Rearranged Array: ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

	public static void rearrange(int[] arr) {
		int left = 0;
		int right = arr.length - 1;

		while (left < right) {
			//			 Move left pointer forward if the number is already even
			while (arr[left] % 2 == 0 && left < right) {
				left++;
			}

			// Move right pointer backward if the number is already odd
			while (arr[right] % 2 != 0 && left < right) {
				right--;
			}

			//			 Swap elements if pointers haven't crossed
			if (left < right) 
			{
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;

				// After swapping, move both pointers inward
				left++;
				right--;
			}
		}
	}
}
