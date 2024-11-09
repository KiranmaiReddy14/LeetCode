class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] forwardMax = new int[n];
        int[] backwardMax = new int[n];
        int maxHeight = 0;
        for (int i = 0; i < n; i++) {
            forwardMax[i] = maxHeight;
            maxHeight = Math.max(maxHeight, height[i]);
        }
        maxHeight = 0;
        for (int i = n - 1; i >= 0; i--) {
            backwardMax[i] = maxHeight;
            maxHeight = Math.max(maxHeight, height[i]);
        }
        int[] trappedWater = new int[n];
        for (int i = 0; i < n; i++) {
            int val = Math.min(forwardMax[i], backwardMax[i]) - height[i];
            trappedWater[i] = val < 0 ? 0 : val;
        }
        int water = 0;
        for (int i = 0; i < n; i++) {
            water += trappedWater[i];
        }
        return water;
    }
}