class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int rowLen = matrix.length;
        int colLen = matrix[0].length;
        int[] arr = new int[rowLen * colLen];
        int k1 = 0;
        for (int i = 0; i < rowLen; i++) {
            for (int j = 0; j < colLen; j++) {
                arr[k1] = matrix[i][j];
                k1++;
            }
        }
        Arrays.sort(arr);
        return arr[k - 1];
    }
}