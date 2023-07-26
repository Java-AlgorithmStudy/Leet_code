class Solution {
    public int longestPalindrome(String s) {
        int result = 0;
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                set.remove(c);
                result++;
            } else set.add(c);
        }
        if (!set.isEmpty()) return result*2+1;
        return result*2;
    }
}
