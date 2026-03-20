public class MergeSortedArr {
	public static void main(String[] args) {
		int[] nums1 = {1, 2, 3,0,0,0};
		int m = 3;
		int[] nums2 = {2, 5, 6};
		int n = 3;

		System.out.println("Initial nums1: ");
		printArray(nums1);
		System.out.println("nums2: ");
		printArray(nums2);

		new Solution().merge(nums1, m, nums2, n);

		System.out.println("Final nums1: ");
		printArray(nums1);
	}

	public static class Solution {
		public void merge(int[] nums1, int m, int[] nums2, int n) {
			int p1 = m - 1;
			int p2 = n - 1;
			

			for (int i = m + n - 1; i >= 0; i--) {
				if (p2 < 0) break;
				if (p1 >= 0 && nums1[p1] > nums2[p2]) {
					nums1[i] = nums1[p1--];
				} else {
					nums1[i] = nums2[p2--];
				}
			}
		}
	}

	private static void printArray(int[] arr) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
