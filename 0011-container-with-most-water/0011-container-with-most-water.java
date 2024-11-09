class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int max = Integer.MIN_VALUE;
        while (i < j) {
            int diff = Math.abs(Math.min(height[i], height[j])) * (j - i);
            max = Math.max(max, diff);
            if (height[i] < height[j])
                i++;
            else
                j--;
        }
        return max;
    }
}