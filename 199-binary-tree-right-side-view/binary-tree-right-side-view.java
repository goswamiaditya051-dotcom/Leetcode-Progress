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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root==null) return list;
        int n = levels(root);
        int [] ans = new int[n];

        dfs(root,0,ans);
        
        for(int ele : ans)
        {
            list.add(ele);
        }
        return list;

    }
    public static int levels(TreeNode root){
        if(root==null) return 0;
        return 1 + Math.max( levels(root.left ), levels(root.right));
    }
    public static void dfs(TreeNode root,int levels,int []arr)
    {
        if( root==null ) return;
        arr[levels] = root.val;
        dfs(root.left,levels+1,arr);
        dfs(root.right,levels+1,arr);
    }
}