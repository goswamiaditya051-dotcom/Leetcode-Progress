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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        ListNode d1 = new ListNode(-1);
        d1.next = head;

        ListNode a = d1;
        ListNode c = d1;

        for(int i = 1; i<=left-1; i++)
        {
            a = a.next;
        }
        ListNode b = a.next;
        for(int j = 1; j<=right; j++)
        {
            c = c.next;
        }
        ListNode d = c.next;
        a.next = null;
        c.next = null;

        reverse(b);

        a.next = c;
        b.next = d;

        return d1.next;

    }
    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode fwd = null;
        while(curr!=null)
        {
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        return prev;
    }
}