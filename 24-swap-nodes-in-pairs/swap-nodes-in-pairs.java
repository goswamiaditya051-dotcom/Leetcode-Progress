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
    public ListNode swapPairs(ListNode head) {
    ListNode d1 = new ListNode(-1);
    ListNode d2 = new ListNode(-1);
    ListNode a = d1;
    ListNode b = d2;
    ListNode i = head;
    ListNode temp = head;
    int length = 0;
    while(temp!=null)
    {
        temp = temp.next;
        length++;
    }
    if(length==1) return head;

   

    int idx = 1;

    while(i!=null)
    {
        if(idx%2!=0)
        {
            a.next = i;
            a = a.next;
        }
        else{
            b.next = i;
            b = b.next;
        }
        i = i.next;
        idx++;
    }
    a.next=null;

    // Merging Lists
    ListNode d3 = new ListNode(-1);// Dummy Node for merging 
    ListNode c = d3;

    ListNode m = d1.next;
    ListNode n = d2.next;

        while(m!=null && n!=null)
        {
            // if(n.val>m.val)
            {
                c.next = n;
                c = c.next;
                n = n.next;
            }
            // else if(m.val<n.val)
            {
                c.next = m;
                c = c.next;
                m = m.next;
            }
           
        }

        c.next = null;
        return d3.next;
    }
}