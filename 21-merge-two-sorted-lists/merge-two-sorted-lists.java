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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode a = list1;
        ListNode b = list2;
        ListNode c = dummy;

        while(a!=null && b!=null)
        {
            if(a.val>b.val)
            {
                c.next = b;
                b = b.next;
            }
            else
            {
                c.next = a;
                a = a.next;
               
            }
            c = c.next;
            
        }
        if(a==null)
        {
            c.next = b;
        }
        else c.next = a;
        return dummy.next;
    }
}