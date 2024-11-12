class Solution {
    public boolean canFinish(int n, int[][] prerequisites) {
        boolean[] visited = new boolean[n];
        boolean[] helper = new boolean[n];
        ArrayList<ArrayList<Integer>> li = new ArrayList<>();
        for (int i = 0; i < n; i++)
            li.add(new ArrayList<>());
        for (int[] i : prerequisites) {
            li.get(i[1]).add(i[0]);
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                boolean res = DFSRecursion(li, i, visited, helper);
                if (res)
                    return false;
            }
        }
        return true;
    }

    static boolean DFSRecursion(ArrayList<ArrayList<Integer>> li, int s, boolean[] visited, boolean[] helper) {
        visited[s] = true;
        helper[s] = true;
        ArrayList<Integer> nums = li.get(s);
        for (int i = 0; i < nums.size(); i++) {
            int curr = nums.get(i);
            if (helper[curr] == true)
                return true;
            if (!visited[curr]) {
                boolean res = DFSRecursion(li, curr, visited, helper);
                if (res)
                    return true;
            }
        }
        helper[s] = false;
        return false;
    }
}