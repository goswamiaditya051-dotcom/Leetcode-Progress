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
    class pair{
        TreeNode node;
        int level;

        pair(TreeNode node,int level){
            this.node = node;
            this.level = level;
        }
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> list = new ArrayList<>();

        int l = level(root);

        for(int i = 1; i<=l; i++)
        {
            list.add(new ArrayList<>());
        }

        Queue<pair> q = new LinkedList<>();

        if(root!=null) q.add(new pair(root,0));
        while(q.size()>0)
        {
            pair front = q.remove();
            TreeNode node = front.node;
            int level = front.level;
            list.get(level).add(node.val);
            if(node.left!=null) q.add(new pair(node.left,level+1));
            if(node.right!=null)q.add(new pair(node.right,level+1));
            
        }

        for(int i = 0; i<list.size(); i++)
        {
            if(i%2!=0) Collections.reverse(list.get(i));
        }
        return list;
        
    }
    private int level(TreeNode root)
    {
        if(root==null) return 0;
        return 1 + (Math.max(level(root.left),level(root.right)));
        
    }
}