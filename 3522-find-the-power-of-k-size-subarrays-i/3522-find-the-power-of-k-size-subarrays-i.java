class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        if (n == 0 || n == 1)
            return nums;
        int[] res = new int[n - k + 1];
        for (int i = 0; i < n - k + 1; i++) {
            int max = nums[i];
            int j = i + 1;
            int prev = nums[i];
            for (int c = 1; c < k; c++) {
                // System.out.println(i + " " + j + " " + max + " " + nums[j]);
                if (nums[j] != prev + 1) {
                    max = -1;
                    break;
                }
                prev = nums[j];
                max = nums[j] > max ? nums[j] : max;
                j++;
            }
            // System.out.println(i + " " + max);
            res[i] = max;
        }
        return res;
    }
}