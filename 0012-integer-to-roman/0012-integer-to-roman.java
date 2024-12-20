class Solution {
    public String intToRoman(int num) {
        String[] str = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        int[] nums = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            if (num == 0)
                break;
            while (nums[i] <= num) {
                sb.append(str[i]);
                num = num - nums[i];
            }
        }
        return sb.toString();
    }
}