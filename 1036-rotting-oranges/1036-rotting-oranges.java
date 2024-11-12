class Solution {
    public int orangesRotting(int[][] grid) {
        int[][] dir = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
        Queue<int[]> q = new LinkedList<>();
        int steps = -1;
        int m = grid.length;
        int n = grid[0].length;
        int[][] visited = grid;

        int oranges = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (visited[i][j] == 2)
                    q.offer(new int[] { i, j });
                if (visited[i][j] == 1)
                    oranges++;
            }
        }
        if (oranges == 0)
            return 0;
        if (q.size() == 0)
            return -1;

        while (!q.isEmpty()) {
            int s = q.size();
            while (s-- > 0) {
                int[] pos = q.poll();
                for (int[] d : dir) {
                    int x = pos[0] + d[0];
                    int y = pos[1] + d[1];
                    if (x >= 0 && x < m && y >= 0 && y < n && visited[x][y] == 1) {
                        visited[x][y] = 2;
                        q.offer(new int[] { x, y });
                        oranges--;
                    }
                }
            }
            steps++;
        }
        //System.out.println(steps);
        if (oranges == 0)
            return steps;
        return -1;
    }
}