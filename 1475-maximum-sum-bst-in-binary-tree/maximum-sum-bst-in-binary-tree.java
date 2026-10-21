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
    class quad{
        int max;
        int min;
        int sum;
        boolean isBST;
        quad(int max,int min ,int sum,boolean isBST)
        {
            this.max = max;
            this.min = min;
            this.sum = sum;
            this.isBST = isBST;
        }
    }
    int maxSum;
    public int maxSumBST(TreeNode root) {
        maxMinSizeIsBST(root);
        return maxSum;
    }
    private quad maxMinSizeIsBST(TreeNode root) {
		if (root == null)
			return new quad(Integer.MIN_VALUE, Integer.MAX_VALUE, 0, true);
		quad lst = maxMinSizeIsBST(root.left);
		quad rst = maxMinSizeIsBST(root.right);
		int max = Math.max(root.val, Math.max(lst.max, rst.max));
		int min = Math.min(root.val, Math.min(lst.min, rst.min));
		int sum = root.val + lst.sum  + rst.sum;
		boolean isBST = ((root.val > lst.max && root.val < rst.min) && lst.isBST && rst.isBST);
		if (isBST) maxSum = Math.max(maxSum, sum); // Extra Line
		return new quad(max, min, sum, isBST);
	}
}