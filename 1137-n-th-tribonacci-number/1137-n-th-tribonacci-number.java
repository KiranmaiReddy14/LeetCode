class Solution {

    public int tribonacci(int n) {
        int[] sum = new int[n + 1];
        if (n == 0)
            return 0;
        else if (n == 1 || n == 2)
            return 1;
        else {
            sum[n - 1] = sum[n - 2] = 1;
            for (int i = n - 3; i >= 0; i--)
                sum[i] = sum[i + 1] + sum[i + 2] + sum[i + 3];
            return sum[0];
        }
    }
}