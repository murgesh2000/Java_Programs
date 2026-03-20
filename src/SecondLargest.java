
public class SecondLargest {

	public static void main(String[] args) {

		int arr[] = {0,1,4,11,5,10};

//		int largest = Integer.MIN_VALUE;
//		int secondLargest = Integer.MIN_VALUE;
		int largest = 0;
		int secondLargest = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				// The old largest becomes the second largest
				secondLargest = largest;
				largest = arr[i];
			} else if (arr[i] > secondLargest && arr[i] != largest) {
				// If it's not the biggest, but bigger than our current second
				secondLargest = arr[i];
			}
		}

		System.out.println(largest + "   ----  "+ secondLargest);

		if (secondLargest == Integer.MIN_VALUE) {
			System.out.println("There is no second largest element.");
		} else {
			System.out.println("The second largest element is: " + secondLargest);
		}
	}

}
