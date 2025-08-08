package learn.programs;

import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> seen = new HashMap<>();
        int ret = 0, slow = 0, n = s.length();
        for (int fast = 0; fast < n; ++fast) {
            if (seen.containsKey(s.charAt(fast))) {
                slow = Math.max(slow, seen.get(s.charAt(fast)) + 1);
            }
            seen.put(s.charAt(fast), fast);
            ret = Math.max(ret, fast - slow + 1);
        }
        return ret;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String input = "bbbbb";

        int result = solution.lengthOfLongestSubstring(input);

        System.out.println("Length of the longest substring without repeating characters: " + result);
    }
}

