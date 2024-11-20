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
    int pos = 0;

    public int kthSmallest(TreeNode root, int k) {
        TreeNode node = inorder(root, k);
        if (node == null)
            return -1;
        return node.val;
    }

    public TreeNode inorder(TreeNode root, int k) {
        if (root == null)
            return root;
        TreeNode node = inorder(root.left, k);
        if (node != null)
            return node;
        pos++;
        if (pos == k)
            return root;
        return inorder(root.right, k);
    }
}