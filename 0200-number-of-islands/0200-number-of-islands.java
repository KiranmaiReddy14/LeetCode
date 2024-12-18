class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    dfs(grid, m, n, i, j, count);
                }
            }
        }
        return count;
    }

    private void dfs(char[][] grid, int m, int n, int i, int j, int count) {
        if (i < 0 || j < 0 || i >= m || j >= n || grid[i][j] == '0')
            return;
        grid[i][j] = '0';
        dfs(grid, m, n, i + 1, j, count);
        dfs(grid, m, n, i, j + 1, count);
        dfs(grid, m, n, i - 1, j, count);
        dfs(grid, m, n, i, j - 1, count);
    }
}