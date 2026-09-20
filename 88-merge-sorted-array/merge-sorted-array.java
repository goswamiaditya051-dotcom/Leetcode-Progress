class Solution {
    public void merge(int[] arr, int m, int[] brr, int n) {
        
        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while(j>=0 && i>=0 && k>=0)
        {
            if( arr[i]<=brr[j] )
            {
                arr[k] = brr[j];
                j--;
            }
            else {
                arr[k] = arr[i];
                i--;
            }
            k--;
        }
        while(j>=0)
        {
            arr[k] = brr[j];
            j--;
            k--;
        } 
        
    }
}