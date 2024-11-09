class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] forwardMax = new int[n];
        int[] backwardMax = new int[n];
        int maxHeight = 0;

        // to get the water store we have to calculate what is the max height on the
        // left
        // and the right side, along with height we have

        // so by taking two arrays calculating the max height from L to R
        // and R to L and then subreacting from the min value from both arrays

        // if the value is negative make it 0, other wise add to the array
        // sum all the water that is trapped

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
        for (int i = 0; i < n; i++)
            water += trappedWater[i];
        return water;
    }
}