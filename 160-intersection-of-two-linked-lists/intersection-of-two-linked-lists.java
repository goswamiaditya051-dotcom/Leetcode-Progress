public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    
    ListNode temp = headA;
    ListNode temp2 = headB;
    int length1 = 0;
    int length2 = 0;

    while(temp!=null) // Finding the length of the 1st list 
    {
        length1++;
        temp = temp.next;
    }

    temp = headB;
    

    while(temp2!=null) // finding length of the 2nd list
    {
        length2++;
        temp2 = temp2.next;
    }
    
    temp = headA;
    temp2 = headB;

    int n = Math.abs(length2-length1);

    if(length1>length2)
    {
        for(int i = 0; i<n; i++)
        {
            temp = temp.next;
        }
    }
    else{
        // temp = headB;
        for(int i = 0; i<n; i++)
        {
            temp2 = temp2.next;
        }
    }

    while(temp!=temp2)
    {
        temp = temp.next;
        temp2 = temp2.next;
    }
    return temp;
    }
}