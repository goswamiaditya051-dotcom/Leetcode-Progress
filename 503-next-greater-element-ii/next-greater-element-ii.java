class Solution {
    public int[] nextGreaterElements(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();

        for(int i = n-1; i>=0; i--)
        {
            st.push(arr[i]);
        }

        // int max = Integer.MIN_VALUE;
        // for(int i = 0; i<n; i++)
        // {
        //     if(max<arr[i])
        //     {
        //         max = arr[i];
        //     }
        // }

        // st.push(max);

        int[] nge = new int[n];
        // nge[n-1] = -1;
        // st.push(arr[n-1]);

        for(int j = n-1; j>=0; j--)
        {
            while(st.size()>0 && st.peek()<=arr[j])
            {
                st.pop();
            }
            if(st.size()==0)
            {
                nge[j] = -1;
            }
            else{
                nge[j] = st.peek();
            }
            st.push(arr[j]);
        }
        

        return nge;

    }
}