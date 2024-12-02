package cediackermann.challenges.twoSum;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = new int[] { 10, 20, 30, 17, 4 };
        int[] solution = sol.getSolution(nums, 14);
        for (int i : solution) {
            System.out.println(i);
        }
    }
}
