class Solution {
    public int hammingDistance(int x, int y) {
        int result = x^y;
        int count = 0;
        while (result != 0) {
            int temp = result&-result;
            result -= temp;
            count++;
        }
        return count;
    }
}
