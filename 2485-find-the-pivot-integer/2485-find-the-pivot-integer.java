class Solution {
    public int pivotInteger(int n) {
        int i = 1, j = n;
        int lsum = 1, rsum = n;
        if (n == 1)
            return 1;
        while (i <= j) {
            if (lsum == rsum && i == j)
                return i;
            else if (lsum < rsum) {
                i++;
                lsum += i;
            } else {
                j--;
                rsum += j;
            }
        }
        return -1;
    }
}