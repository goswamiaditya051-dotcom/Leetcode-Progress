class Solution {
    public int[] nextGreaterElement(int[] arr, int[] brr) {

        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int m = brr.length;
        int[]nge = new int[m];
        int[]ans = new int[n];
        
    
        for(int i = m-1; i>=0; i--)
        {
            while( st.size()>0 && st.peek() <= brr[i])
            {
                st.pop();
            }
            if(st.size()==0)
            {
                nge[i] = -1;
            }
            else{
                nge[i] = st.peek();
            }
            st.push(brr[i]);
        }

        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<m; j++)
            {
                if(brr[j]==arr[i])
                {
                    ans[i] = nge[j];
                    break;
                }
            }
        }

        return ans;

    }
}