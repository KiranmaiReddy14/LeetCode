class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        int res1 = 0;
        int res2 = 0;
        if (n1 % 2 != 0) {
            for (int n : nums2)
                res1 ^= n;
        }
        if (n2 % 2 != 0) {
            for (int n : nums1)
                res2 ^= n;
        }

        return res1 ^ res2;
    }
}