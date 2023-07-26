public class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        }

        int sIndex = 0;
        int tIndex = 0;

        while (tIndex < t.length()) {
            if (t.charAt(tIndex) == s.charAt(sIndex)) {
                sIndex++;
                if (sIndex == s.length()) {
                    return true;
                }
            }
            tIndex++;
        }

        return false;
    }
}
