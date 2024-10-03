class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int[] r : image) {
            for (int i = 0; i < (image[0].length + 1) / 2; i++) {
                int temp = r[i] ^ 1;
                r[i] = r[image[0].length - i - 1] ^ 1;
                r[image[0].length - i - 1] = temp;
            }
        }
        return image;
    }
}