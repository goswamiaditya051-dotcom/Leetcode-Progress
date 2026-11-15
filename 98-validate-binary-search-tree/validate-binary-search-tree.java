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
    static long prev;
    boolean flag;
    public boolean isValidBST(TreeNode root) {
        flag = true;
        prev = Long.MIN_VALUE;
        dfs(root);
        return flag;

    }   
    public void dfs(TreeNode root){
        if(root==null) return;
        dfs(root.left);
        if(prev>=root.val) flag = false;
        prev = root.val;
        dfs(root.right);
    }
}