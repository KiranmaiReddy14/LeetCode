class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int max = 0;
        while (start < end) {
            int diff = Math.min(height[start], height[end]);
            max = Math.max(((end - start) * diff), max);
            if (height[start] < height[end])
                start++;
            else
                end--;
        }
        return max;
    }
}