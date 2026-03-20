
public class ReverseString3 {
	public static void main(String[] args) {
		String s = "Lets Write the Code";
		char[] arr = s.toCharArray();
		System.out.println(arr);
		int start = 0;

        for (int i = 0; i <= arr.length; i++) {
            // end of a word
            if (i == arr.length || arr[i] == ' ') {
                reverse(arr, start, i - 1);
                start = i + 1;
            }
        }
//        return new String(arr);
        System.out.println(arr);
}

    private static void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
	}
}
