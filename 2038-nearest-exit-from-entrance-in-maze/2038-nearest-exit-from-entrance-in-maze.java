class Solution {
    // create directions
    int[][] directions = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

    public int nearestExit(char[][] maze, int[] entrance) {
        int m = maze.length;
        int n = maze[0].length;
        Queue<int[]> q = new LinkedList<>();
        q.offer(entrance);
        int steps = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int[] node = q.poll();
                int row = node[0];
                int col = node[1];

                if ((row != entrance[0] || col != entrance[1]) &&
                        (row == 0 || row == m - 1 || col == 0 || col == n - 1)) {
                    return steps;
                }
                for (int[] dir : directions) {
                    int x = row + dir[0];
                    int y = col + dir[1];
                    if (x >= 0 && x < m && y >= 0 && y < n && maze[x][y] == '.') {
                        maze[x][y] = '+';
                        q.offer(new int[] { x, y });
                    }
                }
            }
            steps++;
        }
        return -1;
    }
}