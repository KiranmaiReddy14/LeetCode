class Solution {
    public int longestSquareStreak(int[] nums) {
        Arrays.sort(nums);
        int max = -1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            int sq = (int) Math.sqrt(n);
            if (sq * sq == n && map.containsKey(sq)) {
                map.put(n, map.get(sq) + 1);
                max = Math.max(max, map.get(sq) + 1);
            } else
                map.put(n, 1);
        }
        return max;
    }
}