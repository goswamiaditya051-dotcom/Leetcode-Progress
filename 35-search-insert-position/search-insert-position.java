class Solution {
    public int searchInsert(int[] arr, int target) {
        int n = arr.length;
        int i = 0;
        int j = n-1;

        int idx = 0;

        while(i<=j)
        {
            int mid = (i+j)/2;
            if(arr[mid]<target)
            {
                i = mid+1;
                idx = mid+1;  
            }
            else if(arr[mid]>target)
            {
                j = mid-1;   
            }
            else{
                idx = mid;
                break;
            }
        }
        return idx;
    }
}