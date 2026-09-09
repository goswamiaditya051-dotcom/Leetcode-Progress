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

        // while(t1!=null)
        // {
        //     length++;
        //     t1 = t1.next;
        // }

        // t1 = head;

        // if(length == 1 && t1.val!=val)
        // {
        //    return head; 
        // }
        // if(length == 2 && t1.val!=val)
        // {
        //     return head;
        // }
        
        

        while (temp!=null)
        {
            if (temp.val != val) 
            {
                c.next = temp;
                c = c.next;
            }
            temp = temp.next;
        }
        // if (c.val == val) {
        //     c.next = null;
        // }
        c.next = null;

        return d1.next;

    }
}