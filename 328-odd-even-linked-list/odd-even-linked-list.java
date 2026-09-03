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
        ListNode d2 = new ListNode(-1);
        ListNode a = d1;
        ListNode b = d2;
        ListNode i = head;
        int idx = 0;
        while (i != null) 
        {
            if(idx%2!=0)
            {
                a.next = i;
                a = a.next;
                idx++;
            }
            else{
                b.next = i;
                b = b.next;
                idx++;
            }
            i = i.next;

            
        }
        // b.next = null;
        // a.next = d2.next;
        // return d1.next;
        a.next=null;
        b.next = d1.next;
        return d2.next;
    }
}