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
    public boolean isValidBST(TreeNode root) {
        if(root==null) return true;
        if(root.val <= max(root.left) || root.val >= min(root.right) ) return false;
        return isValidBST(root.left) && isValidBST(root.right);
    }
    public long max(TreeNode root){
        if(root==null) return Long.MIN_VALUE;
        long leftmax = max(root.left);
        long rightmax = max(root.right);
        long val = root.val;
        return Math.max(val,Math.max(leftmax,rightmax));
    }
    public long min(TreeNode root){
        if(root==null) return Long.MAX_VALUE;
        long leftmin = min(root.left);
        long rightmin = min(root.right);
        long val = root.val;
        return Math.min(val,Math.min(leftmin,rightmin));
    }
}