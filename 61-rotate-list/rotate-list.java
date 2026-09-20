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
    public ListNode rotateRight(ListNode head, int k) {

        if(head==null || head.next==null) return head;


        // Finding the Length Of the list 
        ListNode temp = head;
        int length = 0;
        while(temp!=null)
        {
            temp = temp.next;
            length++;
        }
       
        k = k%length;
        if(k==0) return head;

        ListNode slow = head;
        ListNode fast = head;
        // Move fast to k steps 
        for(int i = 0; i<k; i++)
        {
            fast = fast.next;
        }
        // Move slow and fast by one speed 
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next;
        }
        // Create another node connect it with slow.next
        ListNode a = slow.next;
        slow.next = null;
        fast.next = head;
        return a;

    }
}