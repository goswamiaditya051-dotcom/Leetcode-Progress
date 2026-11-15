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
        ArrayList<Integer> list = new ArrayList<>();
        dfs(root,list);
        boolean flag = false;
        int i = 0;
        int j = 1;
        if(list.size()==1) return true;
        while(i<list.size() && j<list.size())
        {
            if(list.get(i) < list.get(j))
            {
                flag = true;
            }
            else{
                flag = false;
                break;
            }
            i++;
            j++;
        }
        return flag;

    }   
    public void dfs(TreeNode root,ArrayList<Integer> list){
        if(root==null) return;
        dfs(root.left,list);
        list.add(root.val);
        dfs(root.right,list);
    }
}