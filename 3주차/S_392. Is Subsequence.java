class Solution {
    public boolean isSubsequence1(String s, String t) {
        int sIndex = 0;
        for (int tIndex=0; sIndex<s.length() && tIndex<t.length(); tIndex++)
            if (s.charAt(sIndex) == t.charAt(tIndex)) sIndex++;
        return sIndex == s.length();
    }
    // runtime이 2ms / memory가 40.31mb

    public boolean isSubsequence2(String s, String t) {
        int sLeft = 0, tLeft = 0;
        int sRight = s.length(), tRight = t.length();
        char[] tArray = t.toCharArray();
        char[] sArray = s.toCharArray();

        if (sRight < 1) return true;

        while (tRight > tLeft) {
            if (tArray[tLeft] == sArray[sLeft]) sLeft++;
            tLeft++;
            if (sLeft == sRight) return true;
        }
        
        return false;
    }
    // runtime이 0ms / memory가 40.6mb
}
