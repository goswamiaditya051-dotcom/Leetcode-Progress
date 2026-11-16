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
    static int idx;
    public TreeNode convertBST(TreeNode root) {
        if(root==null) return null;
        idx = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        dfs(root,arr);
        int[] pre = new int[arr.size()];
        
        pre[pre.length-1] = arr.get(arr.size()-1);
        
        for(int i = pre.length-2; i>=0; i--)
        {
            pre[i] = pre[i+1] + arr.get(i);
        }

        return create(root,pre);
        
    }
    public void dfs(TreeNode root,ArrayList<Integer> arr){
        if(root==null) return;
        dfs(root.left,arr);
        arr.add(root.val);
        dfs(root.right,arr);
    }
    public TreeNode create( TreeNode orig ,int[] pre)
    {
       if(orig==null) return null;
       TreeNode root = new TreeNode();
       root.left = create(orig.left,pre);
       root.val = pre[idx++];
       root.right = create(orig.right,pre);
       return root;
    }
}