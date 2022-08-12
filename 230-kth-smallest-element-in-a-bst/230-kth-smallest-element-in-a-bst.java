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
    public int kthSmallest(TreeNode root, int k) {
        if (root == null || k <= 0) return -1;
        int[] res = new int[]{0, -1}; // two spaces: index and value to return
        nodeArray(root, k, res);
        return res[1];
    }
    
    private void nodeArray (TreeNode root, int k, int[] res) {
       if (root == null) return ;
        // keep going left becasue that's where min value is
        nodeArray(root.left, k, res);
        // since we traverse through a binary search tree, we will reach to the smallest val first, so when we reach the kth value, we stop the traverse
        res[0] += 1;
        if (res[0] == k) {
            res[1] = root.val;
            return;
        }
        nodeArray(root.right, k, res);
    }
}