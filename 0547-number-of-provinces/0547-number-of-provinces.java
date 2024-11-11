class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && isConnected[i][j] == 1) {
                    adj.get(i).add(j);
                }
            }
        }
        return DFS(adj, 0, n);
    }

    static int DFS(List<List<Integer>> adj, int s, int n) {
        boolean[] visited = new boolean[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (visited[i])
                continue;
            count++;
            DFSRecursion(adj, i, n, visited);
        }
        return count;
    }

    static void DFSRecursion(List<List<Integer>> adj, int s, int n, boolean[] visited) {
        visited[s] = true;
        for (int i : adj.get(s)) {
            if (!visited[i])
                DFSRecursion(adj, i, n, visited);
        }
    }

}