class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<String>();
        if (nums.length > 0) {
            int count = 1;
            int start = nums[0];
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i + 1] - nums[i] == 1) {
                    count++;
                    continue;
                } else {
                    checkCount(count, res, nums[i], start);
                    start = nums[i + 1];
                    count = 1;
                }
            }
            checkCount(count, res, nums[nums.length - 1], start);
        }
        return res;
    }

    public List<String> checkCount(int count, List<String> res, int num, int start) {
        if (count == 1)
            res.add(num + "");
        else
            res.add(start + "->" + num);
        return res;
    }
}