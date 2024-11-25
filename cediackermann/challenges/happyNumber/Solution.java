package cediackermann.challenges.happyNumber;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getNextGen(n);
        }
        
        return n == 1;
    }

    private int getNextGen(int n) {
        int nextGen = 0;
        while (n > 0) {
            int digit = n % 10;
            nextGen += digit * digit;
            n /= 10;
        }
        return nextGen;
    }
}