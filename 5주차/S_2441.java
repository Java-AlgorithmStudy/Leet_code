class Solution {
    public int findMaxK(int[] nums) {
        int result = -1;
        Set<Integer> set = new HashSet<>();
        for (int i : nums) set.add(i);
        for (int i : nums)
            if (i > 0 && set.contains(-i)) result = Math.max(result, i);
        return result;
    }
}
