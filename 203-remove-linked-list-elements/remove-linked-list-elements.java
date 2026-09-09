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

        ListNode temp = head;
        ListNode d1 = new ListNode(-1);
        ListNode c = d1;

        int length = 0;

        ListNode t1 = head;
        
        while (temp!=null)
        {
            if (temp.val != val) 
            {
                c.next = temp;
                c = c.next;
            }
            temp = temp.next;
        }
        c.next = null;

        return d1.next;

    }
}
