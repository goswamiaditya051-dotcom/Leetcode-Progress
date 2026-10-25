/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    static ArrayList<TreeNode> a;
    static ArrayList<TreeNode> b;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> arr = new ArrayList<>();
        dfs(root,p,q,arr);
        
        int i = 0;
        while(i<a.size() && i<b.size() && a.get(i)==b.get(i))
        {
           i++;
        }

        return a.get(i-1);

    }
    public static void dfs(TreeNode root,TreeNode p,TreeNode q,ArrayList<TreeNode> arr)
    {
        if(root==null) return;
        arr.add(root);
        if(root.val==p.val)
        {
            a = new ArrayList<>(arr);
        }
        if(root.val==q.val)
        {
            b = new ArrayList<>(arr);
        }
        dfs(root.left,p,q,arr);
        dfs(root.right,p,q,arr);
        arr.remove(arr.size()-1);
        
    }
}