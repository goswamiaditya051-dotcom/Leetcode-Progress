class Solution {
    public int findPeakElement(int[] arr) {
        int n = arr.length;
        if(n==1) return 0;
        int i = 0;
        int j = n-1;

        while(i<=j)
        {
            int mid = (i+j)/2;
            if( mid<n-1 && arr[mid]<arr[mid+1])
            {
                i = mid+1;
            }
            else if( mid>0 && arr[mid-1] > arr[mid]){
                j = mid-1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}