class Solution {
    public int maximumCount(int[] arr) {
        
        int n = arr.length;
        int i = 0;
        int j = n-1;

        int pos = 0;
        int neg = 0;

        while(i<=j)
        {
            int mid = (i+j)/2;
            if(arr[mid]<=0)
            {
                i = mid+1;
            }
            else{
                j = mid-1;
            }
        }
        
        pos = n-i; 

        i = 0;
        j = n-1;
        while(i<=j)
        {
            int mid = (i+j)/2;
            if(arr[mid]<0)
            {
                i = mid+1;
            }
            else{
                j = mid-1;
            }
           
        }
        neg = i ;

        return Math.max(pos,neg);

    }
}