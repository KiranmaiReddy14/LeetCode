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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1 = getLeafNodes(root1, list1);
        list2 = getLeafNodes(root2, list2);
        System.out.println(list1.equals(list2));
        return list1.equals(list2);
    }

    static ArrayList<Integer> getLeafNodes(TreeNode node, ArrayList<Integer> list) {
        if (node == null)
            return list;
        if (node.left == null && node.right == null)
            list.add(node.val);
        list = getLeafNodes(node.left, list);
        list = getLeafNodes(node.right, list);
        return list;
    }
}