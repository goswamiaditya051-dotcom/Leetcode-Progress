class Solution {
    public int[] nextGreaterElements(int[] arr) {

        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        for(int i = n-1; i>=0; i--)
        {
            st.push(arr[i]);
        }

        int nge[] = new int[n];

        for(int j = n-1; j>=0; j--)
        {
            while(st.size()>0 && st.peek() <= arr[j])
            {
                st.pop();
            }
            nge[j] = (st.size()==0) ? -1 : st.peek();
            st.push(arr[j]);
        }
        
        return nge;

    }
}