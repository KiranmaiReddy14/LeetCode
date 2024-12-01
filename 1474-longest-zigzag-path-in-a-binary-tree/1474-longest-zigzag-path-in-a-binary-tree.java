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
    int max = 0;

    public int longestZigZag(TreeNode root) {
        dfs(root.left, 1, true);
        dfs(root.right, 1, false);
        return max;
    }

    public void dfs(TreeNode root, int count, boolean left) {
        if (root == null)
            return;
        max = Math.max(max, count);
        if (left) {
            dfs(root.right, count + 1, false);
            dfs(root.left, 1, true);
        } else {
            dfs(root.left, count + 1, true);
            dfs(root.right, 1, false);
        }
    }
}