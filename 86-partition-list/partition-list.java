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
        ListNode d1 = new ListNode(-1);
        ListNode d2 = new ListNode(-1);

        ListNode c = d1;
        ListNode d = d2;

        ListNode i = head;
        while(i!=null)
        {
            if(i.val<x)
            {
                c.next = i;
                c = c.next;
                i = i.next;
            }
            else if(i.val>=x)
            {
                d.next = i;
                d = d.next;
                i = i.next;
            }
            
        }
        d.next = null;
        c.next = d2.next;
        return d1.next;
    }
}