class Solution {
    public int search(int[] nums, int target) {
        int peak = findPeak(nums);
        System.out.println(peak + "    " + target + "   target");
        if (peak == -1)
            return binarySearch(nums, 0, nums.length - 1, target);
        if (target == nums[peak])
            return peak;
        if (target >= nums[0])
            return binarySearch(nums, 0, peak - 1, target);
        return binarySearch(nums, peak + 1, nums.length - 1, target);
    }

    public int binarySearch(int[] nums, int start, int end, int target) {
        System.out.println(start + "  " + end);
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == nums[mid])
                return mid;
            else if (target < nums[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }

    public int findPeak(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && nums[mid] > nums[mid + 1])
                return mid;
            if (mid > start && nums[mid] < nums[mid - 1])
                return mid - 1;
            if (nums[mid] <=nums[start])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }
}