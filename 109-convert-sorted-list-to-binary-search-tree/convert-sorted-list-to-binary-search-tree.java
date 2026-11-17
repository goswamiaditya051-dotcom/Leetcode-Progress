class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        
        ListNode temp = head;
        int length = 0;

        while(temp!=null){
            length++;
            temp = temp.next;
        }

        return helper(0,length-1,head);
    }
    public TreeNode helper(int i,int j,ListNode head){
        if(i>j) return null;
        int mid = (i+j)/2;
        ListNode temp = head;
        int k = 0;
        while(k!=mid){
            temp = temp.next;
            k++;
        }
        TreeNode root= new TreeNode(temp.val);
        root.left = helper(i,mid-1,head);
        root.right = helper(mid+1,j,head);
        return root;
    }

}