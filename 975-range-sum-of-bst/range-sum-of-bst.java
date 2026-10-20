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
    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum = 0;
        List<Integer> list = new ArrayList<>();

        sum(root,low,high,list);

        for(int i = 0; i<list.size(); i++)
        {
            sum = sum + list.get(i);
        }
        
        return sum;
    }
    public static void sum(TreeNode root,int low,int high,List<Integer> list){
        if(root==null )return;
        if(root.val<=high && root.val>=low)
        {
            list.add(root.val);
        }
        if(root.val<=high)  sum(root.right,low,high,list);
        if(root.val>=low)  sum(root.left,low,high,list);
    }
}