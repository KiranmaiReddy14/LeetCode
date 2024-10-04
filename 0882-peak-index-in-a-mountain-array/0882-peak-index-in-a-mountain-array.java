class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int peak = 0;
        int index = -1;
        int i = 0;
        while (i < arr.length) {
            if (peak < arr[i]) {
                peak = Math.max(peak, arr[i]);
                index = i;
            }
            i++;
        }
        return index;
    }
}