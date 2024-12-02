package cediackermann.challenges.romanToInt2;

import java.util.HashMap;
import java.util.Map;

class Solution {
    private final Map<Character, Integer> romanLetters = new HashMap<>();

    public Solution() {
        romanLetters.put('I', 1);
        romanLetters.put('V', 5);
        romanLetters.put('X', 10);
        romanLetters.put('L', 50);
        romanLetters.put('C', 100);
        romanLetters.put('D', 500);
        romanLetters.put('M', 1000);
    }

    public int romanToInt(String s) {
        int solution = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (this.romanLetters.get(s.charAt(i)) < this.romanLetters.get(s.charAt(i + 1))) {
                solution -= this.romanLetters.get(s.charAt(i));
            } else {
                solution += this.romanLetters.get(s.charAt(i));

            }
        }
        return solution + romanLetters.get(s.charAt(s.length() - 1));
    }
}