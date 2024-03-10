class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        List<Integer> li = new ArrayList<Integer>();
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                if (!li.contains(nums1[i]))
                    li.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j])
                i++;
            else
                j++;
        }
        int[] res = new int[li.size()];
        for (int i1 = 0; i1 < li.size(); i1++)
            res[i1] = li.get(i1);
        return res;
    }
}