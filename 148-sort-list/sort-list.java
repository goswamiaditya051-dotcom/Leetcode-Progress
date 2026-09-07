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
    public ListNode sortList(ListNode head) {
    if(head==null||head.next==null) return head;
    ListNode slow = head;
    ListNode fast = head;

    while(fast.next!=null && fast.next.next!=null)
    {
        slow = slow.next;
        fast = fast.next.next;
    }
    ListNode a = slow.next;
    slow.next = null;

    ListNode t1 = head;
    ListNode t2 = a;

    ListNode left = sortList(t1);
    ListNode right = sortList(t2);
    ListNode combine = merge(left,right);
    return combine;
    }
    ListNode merge(ListNode head1,ListNode head2)
    {
        ListNode d1 = new ListNode(-1);
        ListNode a = head1;
        ListNode b = head2;

        ListNode c = d1;

        while(a!=null && b!=null)
        {
            if(a.val<=b.val)
            {
                c.next = a;
                a = a.next;
            }
            else{
                c.next = b;
                b = b.next;
            }
            c = c.next;
        }
        if(a==null)
        {
            c.next = b;
            
        }
        else
        {
            c.next = a;
           
        }
        


        return d1.next;
    }
}