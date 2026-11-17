class Solution {
    public TreeNode sortedListToBST(ListNode head) {

        ListNode temp = head;
        int length = 0;
        while(temp!=null)
        {
            length++;
            temp = temp.next;
        }

        temp = head;
        int[]arr = new int[length];
        

        for(int i = 0; i<length; i++)
        {
            arr[i] = temp.val;
            temp = temp.next;
        }

        return helper(0,arr.length-1,arr);
        
    }
    public TreeNode helper(int i,int j ,int[]arr){
        if(i>j) return null;
        int mid = (i+j)/2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = helper(i,mid-1,arr);
        root.right = helper(mid+1,j,arr);
        return root;
    }
}