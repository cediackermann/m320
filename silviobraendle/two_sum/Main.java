package silviobraendle.two_sum;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] nums = {
            2, 7, 11, 15
        };
        int target = 9;

        int[] indices = twoSum(nums, target);
        
        System.out.println(indices[0]);
        System.out.println(indices[1]);
    }

    public static int[] twoSum(int nums[], int target) {
        Map<Integer, Integer> foundIndices = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            int complement = target-value;
            Integer indexOfComplement = foundIndices.get(complement);
            if (indexOfComplement != null) {
                return new int[] {indexOfComplement, i};
            }
            foundIndices.put(value, i);
        }
        throw new Error();
    }
}