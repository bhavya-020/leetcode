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
    public boolean isSymmetric(TreeNode root) {
        if(root == null)return true;
        return isM(root.left , root.right);

    }

boolean isM(TreeNode rootl , TreeNode rootr){

        if(rootl == null && rootr == null)return true;
        if(rootl == null || rootr == null)return false;
        if(rootl.val != rootr.val)return false;

    return isM(rootl.left , rootr.right ) && isM(rootl.right , rootr.left);
    }
}