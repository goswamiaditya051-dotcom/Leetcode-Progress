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
    public ListNode partition(ListNode head, int x) {
        ListNode dummy = new ListNode(-1);
        ListNode dummy2 = new ListNode(-1);
       
        if(head==null || head.next== null) return head;
        
       
        // if(length == 2 && x==1) return head;
        ListNode i = head;
        ListNode a = dummy;
        ListNode b = dummy2;
        while (i != null)
        {
            if (i.val >= x) 
            {
                a.next = i;
                a = a.next;
            } 
            else{
                b.next = i;
                b = b.next;
            }
            i = i.next;
        }
        a.next = null;
        b.next = dummy.next;

        return dummy2.next;
        
    }
}