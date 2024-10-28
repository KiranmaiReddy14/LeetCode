class Solution {
    public int numberOfSteps(int num) {
        int count = 0;
        while (num > 0) {
            if (num % 2 != 0) {
                num = num - 1;
                count++;
            }
            if (num == 0)
                return count;
            num = num / 2;
            count++;
        }
        return count;
    }
}