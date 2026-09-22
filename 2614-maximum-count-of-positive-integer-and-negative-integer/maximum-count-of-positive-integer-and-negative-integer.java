class Solution {
    public int maximumCount(int[] arr) {
        
        int n = arr.length;
        int i = 0;
        int j = n-1;

        int pos = -1;
        int neg = -1;

        while(i<=j)// Finding the Numbers of positive 
        {
            int mid = i+(j-i)/2;
            if(arr[mid]<=0)
            {
                i = mid+1;
            }
            else{
                j = mid-1;
                pos = n - mid;
            }
        }
        i = 0;
        j = n-1;

        while(i<=j)// Finding the numbers of negative 
        {
            int mid = i+(j-i)/2;
            if(arr[mid]<0)
            {
                i = mid+1;
            }
            else{
                j = mid-1;
            }
        }
        neg = i;

        return Math.max(pos,neg);

    }
}