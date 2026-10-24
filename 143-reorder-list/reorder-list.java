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
        if (head == null)
            return;
        ListNode slow = head;
        ListNode fast = head;

        ListNode d1 = new ListNode(-1);
        ListNode c = d1;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode n = slow.next;
        slow.next = null;

        ListNode t1 = head;
        ListNode t2 = reverse(n);
        while (t2 != null) {
            {
                c.next = t1;
                t1 = t1.next;
                c = c.next;
            }
            {
                c.next = t2;
                t2 = t2.next;
                c = c.next;
            }
        }
        if (t1 != null) {
            c.next = t1;
            t1 = t1.next;
            c = c.next;
        }
        if (t2 != null) {
            c.next = t2;
            t2 = t2.next;
            c = c.next;
        }

    }

    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode fwd = null;

        while (curr != null) {
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        return prev;
    }
}