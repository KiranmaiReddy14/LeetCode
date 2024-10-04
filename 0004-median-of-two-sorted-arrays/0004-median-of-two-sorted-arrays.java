class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		double med = 0;
		int len = nums1.length + nums2.length;
		int[] merged = new int[len];
		int i = 0;
		for (int n : nums1) {
			merged[i] = n;
			i++;
		}
		for (int n : nums2) {
			merged[i] = n;
			i++;
		}
        Arrays.sort(merged);
		int ind = len / 2;
        if (len % 2 == 0)
			return (merged[ind] + merged[ind - 1]) / 2.0;
		return merged[ind];
	}
}