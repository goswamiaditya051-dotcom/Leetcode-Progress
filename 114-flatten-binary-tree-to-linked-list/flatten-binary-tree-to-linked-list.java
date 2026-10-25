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
    public void flatten(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        TreeNode d1 = new TreeNode(-1);
        TreeNode c = d1;
        dfs(root,list);

        for(int i = 0; i<list.size(); i++)
        {
            c.right = list.get(i);
            c=c.right;
            c.left = null;
        }
        

    }
    public static void dfs(TreeNode root,List<TreeNode> list){
        if(root==null) return;
        
        list.add(root);
        dfs(root.left,list);
        dfs(root.right,list);
    }
}