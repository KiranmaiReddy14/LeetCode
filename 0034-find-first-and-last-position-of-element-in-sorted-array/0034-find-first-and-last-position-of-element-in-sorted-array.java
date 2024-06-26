class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = findEle(nums, target, true);
        int end = findEle(nums, target, false);
        return new int[] { start, end };
    }

    public int findEle(int[] nums, int target, boolean isFirst) {
        int start = 0;
        int end = nums.length - 1;
        int ind = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid])
                end = mid - 1;
            else if (target > nums[mid])
                start = mid + 1;
            else {
                ind = mid;
                if (isFirst)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return ind;
    }
}