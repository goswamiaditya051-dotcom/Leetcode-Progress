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

        ArrayList<TreeNode> list = new ArrayList<>();
        
        dfs(root,p,q,list);

        int i = 0;
        while(i<a.size() && i<b.size() && a.get(i) == b.get(i))
        {
            i++;
        }
        return a.get(i-1);
        
    }
    public static void dfs(TreeNode root,TreeNode p,TreeNode q,ArrayList<TreeNode> list){
        if(root==null) return;
        list.add(root);
        if(p==root) a = new ArrayList<>(list);
        if(q==root) b = new ArrayList<>(list);
        dfs(root.left,p,q,list);
        dfs(root.right,p,q,list);
        list.remove(list.size()-1);
    }
}