class Solution {
    public boolean isSubsequence(String s, String t) {
        int sIndex = 0;
        for (int tIndex=0; sIndex<s.length() && tIndex<t.length(); tIndex++)
            if (s.charAt(sIndex) == t.charAt(tIndex)) sIndex++;
        return sIndex == s.length();
    }
}
