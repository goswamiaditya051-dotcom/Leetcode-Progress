
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
    int maxSum = 0;

    while(t2!=null){
        sum = t1.val + t2.val;
        maxSum = Math.max(sum,maxSum);
        t1 = t1.next;
        t2 = t2.next;
    }
    return maxSum;
    }
    public static ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode fwd = null;
        ListNode prev = null;

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