class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        
        return helper(head,null);

    }
    public TreeNode helper(ListNode head,ListNode tail){
        if( head==tail ) return null;

        ListNode slow = head;
        ListNode fast = head;

        while(fast!=tail && fast.next!=tail ){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode a = slow;
        TreeNode root = new TreeNode(a.val);
        root.left = helper(head,slow);
        root.right = helper(slow.next,tail);
        return root;

    }
}