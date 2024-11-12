class Solution {
    public int[] findOrder(int n, int[][] prerequisites) {
        int[] nodes = new int[n];
        //if (prerequisites.length == 0)
          //  return nodes;
        boolean visited[] = new boolean[n];
        boolean helper[] = new boolean[n];
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }
        for (int[] pre : prerequisites) {
            list.get(pre[1]).add(pre[0]);
        }
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                if (DFSRecursion(list, visited, helper, stack, i))
                    return new int[0];
            }
        }
        int j = 0;
        while (!stack.isEmpty()) {
            nodes[j] = stack.pop();
            j++;
        }
        return nodes;
    }

    static boolean DFSRecursion(ArrayList<ArrayList<Integer>> list, boolean[] visited, boolean[] helper,
            Stack<Integer> stack, int s) {
        visited[s] = true;
        helper[s] = true;
        ArrayList<Integer> li = list.get(s);
        for (int i = 0; i < li.size(); i++) {
            int num = li.get(i);
            if (helper[num] == true) // cycle detected
                return true;
            if (visited[num] == false) {
                if (DFSRecursion(list, visited, helper, stack, num))
                    return true;
            }
        }
        helper[s] = false;
        stack.push(s);
        return false;
    }
}