class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int i = 0;
        int len = arr.length;
        while (i < len - 2) {
            if (arr[i] % 2 == 1 && arr[i + 1] % 2 == 1 && arr[i + 2] % 2 == 1)
                return true;
            i++;
        }
        return false;
    }
}