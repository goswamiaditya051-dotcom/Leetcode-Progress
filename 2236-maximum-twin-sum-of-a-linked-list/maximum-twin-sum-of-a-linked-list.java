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
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next!=null && fast.next.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode a = slow.next;
        slow.next = null;

        a = reverse(a);
        ListNode t1 = head;
        ListNode t2 = a;
        
        int sum = 0;
        int MaxSum = 0;
        while(t2!=null )
        {
            sum = t1.val+t2.val;
            // if(t2.next==null)return Math.max(MaxSum,sum);
            MaxSum = Math.max(sum,MaxSum);
            {
                t1 = t1.next;
                t2 = t2.next;   
            }  
        }
        return Math.max(sum,MaxSum);
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