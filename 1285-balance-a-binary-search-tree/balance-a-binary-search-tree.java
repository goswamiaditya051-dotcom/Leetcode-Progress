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
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>(); 
        dfs(root,list);
        int[]arr = new int[list.size()];

        for(int i = 0; i<arr.length; i++)
        {
            arr[i] = list.get(i);
        }

        return helper(0,arr.length-1,arr);

    }
    public static void dfs(TreeNode root,ArrayList<Integer> list)
    {
        if(root==null) return;
        dfs(root.left,list);
        list.add(root.val);
        dfs(root.right,list);
    }
    public static TreeNode helper(int i,int j,int[]arr){
        if(i>j) return null;
        int mid = (i+j)/2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = helper(i,mid-1,arr);
        root.right = helper(mid+1,j,arr);
        return root;
    }
}