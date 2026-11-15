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
    public int findSecondMinimumValue(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        boolean flag = false;
        dfs(root,arr);
        long min = Long.MAX_VALUE;
        long smin = Long.MAX_VALUE;
        for(int i = 0; i<arr.size(); i++)
        {
            if(min>arr.get(i))
            {
                smin = min;
                min  = arr.get(i);
            }
            else if(smin > arr.get(i) && arr.get(i)!=min )
            {
                smin = arr.get(i);
            }
        }
        return smin == Long.MAX_VALUE ? -1 :(int)smin;
        
    }
    public void dfs(TreeNode root,ArrayList<Integer> arr){
        if(root==null) return;
        dfs(root.left,arr);
        arr.add(root.val);
        dfs(root.right,arr);
    }
}