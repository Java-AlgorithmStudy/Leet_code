class Solution {
    public int maxRepeating(String sequence, String word) {
        int rst = 0;
        for (int i=0; i<sequence.length(); i++) {
            int sCnt = 0, wCnt = 0;
            for (int j=i; j<sequence.length(); j++) {
                if (sequence.charAt(j) == word.charAt(wCnt)) wCnt++;
                else break;
                if (wCnt == word.length()) {
                    wCnt = 0;
                    sCnt++;
                }
            }
            rst = Math.max(rst, sCnt);
        }
        return rst;
    }
}
