class Solution {
    public int[] countBits(int n) {
        int[] setBits = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            int number = i;
            int bits = 0;
            while (number > 0) {
                if ((number & 1) == 1)
                    bits++;
                number = number >> 1;
            }
            setBits[i] = bits;
        }
        return setBits;
    }
}