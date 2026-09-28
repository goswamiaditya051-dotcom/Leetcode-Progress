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
    public ListNode oddEvenList(ListNode head) {
        ListNode d1 = new ListNode(-1);
        ListNode c = d1;
        ListNode d2 = new ListNode(-1);
        ListNode d = d2;
        int idx = 0;

        ListNode a = head;

        while(a!=null)
        {
            if(idx%2==0)
            {
                c.next = a;
                a = a.next;
                c = c.next;
            }
            else{
                d.next = a;
                a = a.next;
                d = d.next;
            }
            idx++;
        }
        c.next = d2.next;
        d.next = null;
        return d1.next;
    }
}