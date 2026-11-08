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
    static boolean flag;
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        flag = true;
        level(root);
        return flag;
    }
    public static int level(TreeNode root){
        if(root==null) return 0;

        int leftlevel = level(root.left);
        int rightlevel = level(root.right);
        int level1 = Math.abs(leftlevel-rightlevel);
        if( level1 > 1 ) flag = false;
        return 1 + Math.max(leftlevel,rightlevel);
    }
}