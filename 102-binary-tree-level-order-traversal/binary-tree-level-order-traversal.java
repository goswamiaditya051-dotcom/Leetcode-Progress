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
   public class pair{
        TreeNode node;
        int level;

        pair(TreeNode node,int level){
            this.node = node;
            this.level = level;
        }


}
public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();
        int l = levels(root);
        for(int i = 1; i<=l; i++)
        {
            ans.add(new ArrayList<>());
        }

        Queue<pair> q = new LinkedList<>();
        if(root!=null) q.add(new pair(root,0));
        while(q.size()>0){
            pair front = q.remove();
            TreeNode node = front.node;
            int level = front.level;
            ans.get(level).add(node.val); // ans[level] = node.data
            if(node.left!=null) q.add(new pair(node.left,level+1));
            if(node.right!=null)q.add(new pair(node.right,level+1));
        }
        return ans;
        
}
    private int levels(TreeNode root) {
        if(root==null) return 0;
        return 1 + Math.max(levels(root.left),(levels(root.right)));
    }
}
