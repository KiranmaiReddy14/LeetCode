class Solution {
    public int addDigits(int num) {
        if (num < 10)
            return num;
        while (num >= 10) {
            int temp = num;
            int sum = 0;
            while (temp > 0) {
                int t = temp % 10;
                temp = temp / 10;
                sum += t;
            }
            num = sum;
        }
        return num;
    }
}