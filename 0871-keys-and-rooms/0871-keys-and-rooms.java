class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        return DFS(rooms, 0);
    }

    static boolean DFS(List<List<Integer>> rooms, int start) {
        boolean[] visited = new boolean[rooms.size()];
        DFSRecursion(rooms, start, visited);
        for (boolean b : visited) {
            if (!b)
                return false;
        }
        return true;
    }

    static void DFSRecursion(List<List<Integer>> rooms, int start, boolean[] visited) {
        visited[start] = true;
        for (int i : rooms.get(start)) {
            if (!visited[i])
                DFSRecursion(rooms, i, visited);
        }
    }
}