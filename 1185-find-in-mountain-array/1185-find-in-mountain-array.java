/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 * public int get(int index) {}
 * public int length() {}
 * }
 */

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = findIndex(mountainArr);
        int firstHalf = binarySearch(mountainArr, 0, peak, target);
        if (firstHalf != -1)
            return firstHalf;
        return binarySearch(mountainArr, peak + 1, mountainArr.length() - 1, target);
    }

    public int binarySearch(MountainArray mountainArr, int start, int end, int target) {
        boolean isAsc = mountainArr.get(start) < mountainArr.get(end);
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == mountainArr.get(mid))
                return mid;
            if (isAsc) {
                if (target < mountainArr.get(mid))
                    end = mid - 1;
                else
                    start = mid + 1;
            } else {
                if (target > mountainArr.get(mid))
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return -1;

    }

    public int findIndex(MountainArray mountainArr) {
        int start = 0;
        int end = mountainArr.length() - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mountainArr.get(mid) > mountainArr.get(mid + 1))
                end = mid;
            else
                start = mid + 1;
        }
        return start;
    }
}