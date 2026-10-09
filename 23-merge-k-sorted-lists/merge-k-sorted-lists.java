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
    public ListNode mergeKLists(ListNode[] arr) {

        Queue<ListNode> q = new LinkedList<>();
        
        for(ListNode n : arr){
            q.add(n);
        }

        if(q.size()==1) return q.peek();
        
        while(q.size()>1){
            ListNode a = q.remove();
            ListNode b = q.remove();
            ListNode c = merge(a,b);
            q.add(c);
        }
        return q.peek();
    }
    public static ListNode merge(ListNode a,ListNode b){
        ListNode d1 = new ListNode(-1);
        ListNode c = d1; 
        
        while(a!=null && b!=null)
        {
            if(a.val<b.val)
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
        if(a!=null)
        {
            c.next = a;
        }
        else{
            c.next = b;
        }
        return d1.next;
    }
}