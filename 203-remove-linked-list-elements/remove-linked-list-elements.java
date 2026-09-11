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
    public ListNode removeElements(ListNode head, int val) {
        ListNode d1 = new ListNode(-1);
        ListNode c = d1;
        ListNode i = head;

        while(i!=null)
        {
            if(i.val!=val)
            {
                c.next = i;
                c = c.next;
            }
            i = i.next;
        }
        if(i==null)
        {
            c.next = i;
        }
        
        return d1.next;
    }
}