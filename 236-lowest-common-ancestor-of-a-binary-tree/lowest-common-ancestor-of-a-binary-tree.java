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
        dfs(root,arr,p,q);

        int i = 0;
        while(i<a.size() && i<b.size() && a.get(i)==b.get(i))
        {
            i++;
        }
        return a.get(i-1);
    }
    public static void dfs(TreeNode root,ArrayList<TreeNode> arr,TreeNode p,TreeNode q){
        if(root==null ) return;
        arr.add(root);
        if(root==p) a = new ArrayList(arr);
        if(root==q) b = new ArrayList(arr);
        dfs(root.left,arr,p,q);
        dfs(root.right,arr,p,q);
        arr.remove(arr.size()-1);
    }
}