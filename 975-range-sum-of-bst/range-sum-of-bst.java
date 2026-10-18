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
    public int rangeSumBST(TreeNode root, int p, int q) {

    List<Integer> list = new ArrayList<>();
    dfs(root,p,q,list);
    int sum = 0;
    
    for(int ele : list)
    {
        sum = sum + ele;
    }

    return sum;
        
    }
    public static void dfs(TreeNode root,int p,int q, List<Integer> list){
        if(root==null) return;
        if(root.val >= p && root.val <= q)
        {
            list.add(root.val);
        }
        dfs(root.left,p,q,list);
        dfs(root.right,p,q,list);
    }
}