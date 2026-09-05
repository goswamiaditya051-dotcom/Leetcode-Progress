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
        ListNode a = d1;
        ListNode b = d2;
        ListNode i = head;
        while (i != null) 
        {
            if(i.val<x)
            {
                a.next = i;
                a = a.next;
                i = i.next;
            }
            else if(i.val>=x)
            {
                b.next = i;
                b = b.next;
                i = i.next;
            }
        }
       
        b.next = null;
        a.next = d2.next;

        return d1.next;

    }
}