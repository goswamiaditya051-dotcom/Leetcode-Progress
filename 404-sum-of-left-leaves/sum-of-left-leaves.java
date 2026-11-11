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
    public int sumOfLeftLeaves(TreeNode root) {
        int l = level(root);
        int []arr = new int[l];

        dfs(root,0,arr);

        int sum = 0;

        for(int i = 0; i<arr.length; i++)
        {
            sum = sum + arr[i];
        }
        return sum;
    }
    public int level(TreeNode root){
        if(root==null) return 0;
        int leftlevel = level(root.left);
        int rightlevel = level(root.right);
        return 1 + Math.max(leftlevel,rightlevel);
    }
    public void dfs(TreeNode root,int level,int[]arr){
        if(root==null) return;
        if(root.left!=null && root.left.left==null && root.left.right==null ) arr[level] += root.left.val;
        dfs(root.right,level+1,arr);
        dfs(root.left,level+1,arr);
    }
}