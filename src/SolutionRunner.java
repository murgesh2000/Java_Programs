public class SolutionRunner {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {1, 1, 1, 2, 2, 2,3};
        int k = sol.removeDuplicates(nums);

        System.out.println("k = " + k);
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
