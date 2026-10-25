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
        //List<TreeNode> list = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        Stack<TreeNode> helper = new Stack<>();
        TreeNode d1 = new TreeNode(-1);
        TreeNode c = d1;
        dfs(root,st);

        while(st.size()>0)
        {
           helper.push(st.pop());
        }
        int n = helper.size();
        for(int i = 0; i<n; i++)
        {
            c.right = helper.peek();
            helper.pop();
            c.left = null;
            c = c.right;
        }
        

    }
    public static void dfs(TreeNode root,Stack<TreeNode> st){
        if(root==null) return;
        st.push(root);
        dfs(root.left,st);
        dfs(root.right,st);
    }
}