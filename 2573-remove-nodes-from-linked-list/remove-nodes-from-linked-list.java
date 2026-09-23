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
    Stack<ListNode>st = new Stack<>();
    ListNode temp = head;
    while (temp!=null){

        while(st.size()>0 && st.peek().val < temp.val )
        {
            st.pop();
        }
        st.push(temp);
        temp = temp.next;
    }
    ListNode newHead = st.pop();
    temp = newHead;
    ListNode top = null;
    while (st.size()>0){
         top = st.pop();
        temp.next = top;
        temp = top;
    }
    // Now we will reverse the linkedList
        temp.next = null;
        return reverse(newHead);


    }

    private ListNode reverse(ListNode newHead) {
        ListNode prev = null;
        ListNode fwd = null;
        ListNode curr = newHead;

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