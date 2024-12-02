package cediackermann.challenges.houseRobber;


class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }
        int[] loot = new int[n];
        loot[0] = nums[0];
        loot[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < n; i++) {
            loot[i] = Math.max(loot[i - 1], nums[i] + loot[i - 2]);
            System.out.println(loot[i]);
        }

        return loot[n - 1];        
    }
}
