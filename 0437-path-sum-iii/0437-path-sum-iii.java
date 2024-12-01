/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    HashMap<Long, Integer> map;
    int count = 0;

    public int pathSum(TreeNode root, int targetSum) {
        map = new HashMap<>();
        dfs(root, targetSum, 0);
        return count;
    }

    public void dfs(TreeNode root, int targetSum, long sum) {
        if (root == null)
            return;
        sum += root.val;
        if (map.containsKey(sum - targetSum))
            count += map.get(sum - targetSum);
        if (sum == targetSum)
            count++;
        map.put(sum, map.getOrDefault(sum, 0) + 1);
        dfs(root.left, targetSum, sum);
        dfs(root.right, targetSum, sum);
        map.put(sum, map.get(sum) - 1);
    }
}