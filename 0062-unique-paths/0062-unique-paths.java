class Solution {
    public int uniquePaths(int m, int n) {
        int[] arr = new int[n];
        Arrays.fill(arr, 1);
        for (int i = 1; i < m; i++) {
            int[] arr1 = new int[n];
            Arrays.fill(arr1, 1);
            for (int j = 1; j < n; j++)
                arr1[j] = arr1[j - 1] + arr[j];
            arr = arr1;
        }
        return arr[n - 1];
    }
}