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
        ArrayList<Integer> res = nodeArray(root, new ArrayList<>());
        return res.get(k - 1);
    }
    
    private ArrayList<Integer> nodeArray (TreeNode root, ArrayList<Integer> temp) {
       if (root == null) return temp;
        nodeArray(root.left, temp);
        temp.add(root.val);
        nodeArray(root.right, temp);
        
        return temp;
    }
}