class Solution {
    public int minReorder(int n, int[][] connections) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++)
            list.add(new ArrayList<>());
        for (int[] con : connections) {
            list.get(con[0]).add(con[1]);
            list.get(con[1]).add(-con[0]); // the edge that doesn't exist make it as
            // negative so when iterating when you encounter a negative value
            // increase the value
        }
        return DFS(list, 0, n);
    }

    static int DFS(List<List<Integer>> list, int s, int n) {
        return DFSRecursion(list, s, new boolean[n]);
    }

    static int DFSRecursion(List<List<Integer>> list, int s, boolean[] visited) {
        int count = 0;
        visited[s] = true;
        for (int i : list.get(s)) {
            if (!visited[Math.abs(i)])
                count += DFSRecursion(list, Math.abs(i), visited) + (i > 0 ? 1 : 0);
            // check the negative value
        }
        return count;
    }
}