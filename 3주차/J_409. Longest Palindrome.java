import java.util.HashMap;
import java.util.Map;
import java.util.Collections;

public class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> counts = new HashMap<>();
        for (char c : s.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }

        int length = 0;
        int oddMax = 0;
        for (int count : counts.values()) {
            if (count % 2 == 0) {
                length += count;
            } else {
                length += count - 1;
                oddMax = Math.max(oddMax, count);
            }
        }

        return length + (oddMax > 0 ? 1 : 0);
    }
}
