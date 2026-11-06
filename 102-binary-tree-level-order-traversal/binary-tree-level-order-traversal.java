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
    public class Pair{
    int level;
    TreeNode node;

    Pair(int level,TreeNode node){
        this.node = node;
        this.level = level;
    }
}
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        int l = level(root);

        for(int i =0; i<l; i++)
        {
            list.add(new ArrayList<>());
        }

        Queue<Pair> q = new LinkedList<>();
        if(root!=null) q.add(new Pair(0,root));
        while(q.size()>0)
        {
            Pair front = q.remove();
            TreeNode node = front.node;
            int level = front.level;
            list.get(level).add(node.val);
            if(node.left!=null) q.add(new Pair(level+1,node.left));
            if(node.right!=null) q.add(new Pair(level+1,node.right));
        }

        return list;
        
    }
    public static int level(TreeNode root){
        if(root==null) return 0;
        return 1 + Math.max( level(root.left) , level(root.right) );
    }
}