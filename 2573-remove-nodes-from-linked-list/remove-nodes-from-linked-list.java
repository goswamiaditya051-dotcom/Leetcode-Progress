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
    public ListNode removeNodes(ListNode head) {
       ListNode temp = head;
       Stack<ListNode> st = new Stack<>();

       while(temp!=null)
       {
            while(st.size()>0 && st.peek().val < temp.val)
            {
                st.pop();
            }
            st.push(temp);
            temp = temp.next;
       }

        ListNode newHead = st.pop();
        temp = newHead;
        while(st.size()>0)
        {
            ListNode top = st.pop();
            temp.next = top;
            temp = top;
        }
        temp.next = null;

        return reverse(newHead);
        
    }
    public static ListNode reverse(ListNode head)
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