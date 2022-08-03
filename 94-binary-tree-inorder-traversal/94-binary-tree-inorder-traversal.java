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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        res = inorderHelper(root, res);
        return res;
        
    }
    private static List<Integer> inorderHelper(TreeNode root, List<Integer> temp) {
        if (root == null) {
            return temp;
        } 
        inorderHelper(root.left, temp);
        temp.add(root.val);
        inorderHelper(root.right, temp);
        return temp;
    }
        
}