class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode i = head;

        ListNode dummy = new ListNode(-1);
        ListNode c = dummy;

        while(i != null) {

            if(i.next == null || i.val != i.next.val) {

                c.next = i;
                c = i;
                i = i.next;

            } else {

                ListNode j = i.next;

                while(j != null && i.val == j.val) {
                    j = j.next;
                }

                i = j;
            }

            c.next = i;
        }

        return dummy.next;
    }
}