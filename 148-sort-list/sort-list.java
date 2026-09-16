/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {

        if(head==null || head.next==null) return head;

        ListNode d1 = new ListNode(-1);
        ListNode c = d1;
        ListNode temp = head;
        
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next!=null && fast.next.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode a = slow.next;
        slow.next = null;

        ListNode left = head;
        ListNode right = a;

        ListNode l = sortList(left);
        ListNode r = sortList(right);
        ListNode combine = merge(l,r);

        return combine;   
    
    }
    public static ListNode merge(ListNode left, ListNode right)
    {
        ListNode d1 = new ListNode(-1);
        ListNode c = d1;
        while(left!=null && right!=null)
        {
            if(left.val<right.val)
            {
                c.next = left;
                left = left.next;
            }
            else{
                c.next = right;
                right = right.next;
            }
            c = c.next;
        }

        while(left!=null)
        {
            c.next = left;
            left = left.next;
            c = c.next;
        }
         while(right!=null)
        {
            c.next = right;
            right = right.next;
            c = c.next;
        }
        return d1.next;
    }
}