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
    public List<List<Integer>> pathSum(TreeNode root, int target) {

        ArrayList<Integer> arr = new ArrayList<>();
        int sum = 0;
        List<List<Integer>> list = new ArrayList<>();
        
        dfs(root,target,arr,sum,list);

        return list;

    }
    public static void dfs(TreeNode root,int target,ArrayList<Integer> arr,int sum,List<List<Integer>> list)
    {
        if(root==null) return;
        sum = sum + root.val;
        arr.add(root.val);
        if(root.left==null && root.right==null) // Leaf node found 
        {
            if(sum==target)
            {
                list.add(new ArrayList<>(arr));
            }
        }
        
        
        dfs(root.left,target,arr,sum,list);
        dfs(root.right,target,arr,sum,list);
        arr.remove(arr.size()-1);
    }
}