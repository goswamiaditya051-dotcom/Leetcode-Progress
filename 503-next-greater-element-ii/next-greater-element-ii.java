class Solution {
    public int[] nextGreaterElements(int[] arr) {

        int n = arr.length;

        Stack<Integer> st = new Stack<>();

        int[] nge = new int[n];

        for(int i = n-1; i>=0; i--)
        {
            st.push(arr[i]);
        }

        for(int i = n-1; i>=0; i--)
        {
            while(st.size()>0 && arr[i]>=st.peek()) st.pop();
            nge[i] = (st.size()==0) ? -1 : st.peek();
            st.push(arr[i]);
        }

        return nge;

    }
}