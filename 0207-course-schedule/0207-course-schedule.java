class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < numCourses; i++)
            list.add(new ArrayList<>());
        for (int[] pre : prerequisites)
            list.get(pre[1]).add(pre[0]);

        boolean[] visited = new boolean[numCourses];
        boolean[] helper = new boolean[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (!visited[i]) {
                boolean res = DFSRescursion(list, visited, helper, i);
                if (res)
                    return false;
            }
        }
        return true;
    }

    public boolean DFSRescursion(ArrayList<ArrayList<Integer>> list, boolean[] visited, boolean[] helper, int i) {
        visited[i] = true;
        helper[i] = true;
        ArrayList<Integer> li = list.get(i);
        for (int j = 0; j < li.size(); j++) {
            int curr = li.get(j);
            if (helper[curr] == true)
                return true;
            if (!visited[curr]) {
                boolean res = DFSRescursion(list, visited, helper, curr);
                if (res)
                    return true;
            }
        }
        helper[i] = false;
        return false;
    }
}