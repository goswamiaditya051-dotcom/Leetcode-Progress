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
    public boolean isValidBST(TreeNode root) {
        
        List<Integer> list = new ArrayList<>();
        dfs(root,list);

        // int[] arr = new int[list.size()];

        // for(int i = 0; i<arr.length; i++)
        // {
        //     arr[i] = list.get(i);
        // }

        // int i = 0;
        // int j = 1;
        // while(i<arr.length && j<arr.length)
        // {
        //     if(arr[i]>=arr[j]) return false;
        //     i++;
        //     j++;
        // }

        for(int i = 0; i<list.size()-1; i++)
        {
            if(list.get(i)>=list.get(i+1)) return false;
        }
        return true;
        

    }
    public static void dfs(TreeNode root ,List<Integer> list){
        if(root==null) return;
        dfs(root.left,list);
        list.add(root.val);
        dfs(root.right,list);
    }
}