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
    public void reorderList(ListNode head) {
        ListNode d1 = new ListNode(-1);
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode a = slow.next;
        slow.next = null;

        a = reverse(a);
        ListNode t1 = head;
        ListNode t2 = a;

        while(t1!=null && t2!=null)
        {
            {
                d1.next = t1;
                t1 = t1.next;
                d1 = d1.next;
            }

            {
                d1.next = t2;
                t2 = t2.next;
                d1 = d1.next;
            }
        }
        if(t1==null)
        {
            d1.next = t2;
        }
        else{
            d1.next = t1;
        }
    }
    public ListNode reverse(ListNode head)
    {
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