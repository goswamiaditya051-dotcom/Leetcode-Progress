class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        
        return dfs(root,low,high);

    }
    public int dfs(TreeNode root,int low,int high)
    {   int current = 0;
        int leftsum = 0;
        int rightsum = 0;
        if(root==null) return 0;
        if(root.val >= low && root.val <= high )
        {
            current = root.val;
        }
        if(root.val>low){
            leftsum = dfs(root.left,low,high);
        } 
        if(root.val<high){
            rightsum = dfs(root.right,low,high);} 
        return current + leftsum + rightsum;

    }
}