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
    public boolean findTarget(TreeNode root, int k) {
        
        ArrayList<Integer> arr = new ArrayList<>();
        dfs(root,arr);
        // int i = 0;
        // int j = 1;

        // while(i<arr.size() && j<arr.size())
        // {
        //     if(arr.get(i) + arr.get(j) == k) return true;
        //     i++;
        //     j++;
        // }
        // if(arr.get(i) + arr.get(j) == k) return true;
        // for(int i = 0; i<arr.size()-1; i++)
        // {
        //     if(arr.get(i) + arr.get(i+1) == k) return true;
        // }

        int i = 0;
        int j = arr.size()-1;

        while(i<j)
        {
            if(arr.get(i)+arr.get(j) == k) return true;
            if(arr.get(i) + arr.get(j) < k) i++;
            else j--;
        }

        return false;
    }
    public void dfs(TreeNode root,ArrayList<Integer> arr){
        if(root==null) return;
        dfs(root.left,arr);
        arr.add(root.val);
        dfs(root.right,arr);
    }
}