/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        res = preorderHelper(root, res);
        return res;
    }
    private static List<Integer> preorderHelper(TreeNode root, List<Integer> temp) {
        if (root == null) {
            return temp;
        }
        temp.add(root.val);
        preorderHelper(root.left, temp);
        preorderHelper(root.right, temp);
        return temp;
    }
}