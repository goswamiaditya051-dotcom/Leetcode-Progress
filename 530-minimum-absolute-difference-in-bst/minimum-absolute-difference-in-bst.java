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
    public int getMinimumDifference(TreeNode root) {
        
        ArrayList<Integer> list = new ArrayList<>();
        dfs(root,list);

        // int a = Math.abs(list.get(list.size()-1) - list.get(list.size()-2));
        // int b = Math.abs(list.get(0)-list.get(1));
        // return Math.min(a,b);

        int i = 0;
        int j = 1;
        int min = Integer.MAX_VALUE;
        while(i<list.size() && j<list.size())
        {
            int a = Math.abs( list.get(i) - list.get(j));
            if(min>a) min = a;
            i++;
            j++;
        }

        return min;

    }
    public void dfs(TreeNode root,ArrayList<Integer> list){
        if(root==null) return;
        dfs(root.left,list);
        list.add(root.val);
        dfs(root.right,list);
        
    }
}