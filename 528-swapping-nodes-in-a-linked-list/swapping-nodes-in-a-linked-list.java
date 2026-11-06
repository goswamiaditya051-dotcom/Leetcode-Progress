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
    public ListNode swapNodes(ListNode head, int k) {
        
        // ListNode temp = head;
        ListNode fast = head;
        ListNode slow = head;
        int length = 0;

        for(int i = 1; i<=k; i++)
        {
            if(fast==null) break;
            fast = fast.next;
        }

        while(fast!=null)
        {
            slow = slow.next;
            fast = fast.next;
        }

        ListNode t1 = head;

        for(int i = 1; i<=k-1; i++)
        {
            t1 = t1.next;
        }

        int temp = t1.val;
        t1.val = slow.val;
        slow.val = temp;

        return head;
    }
}