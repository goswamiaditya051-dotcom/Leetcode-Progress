class Solution {
    public int[] searchRange(int[] arr, int target) {

        int n = arr.length;
        int i = 0;
        int j = n-1;

        int idx1 = -1;
        int idx2 = -1;
        
        while(i<=j)
        {
            int mid = (i+j)/2;
            if(arr[mid]<target){
                i = mid+1;
            }
            else if(arr[mid]>target){
                j = mid-1;
            }
            else{
                j = mid-1;
                idx1 = mid;
            }
        }

        i = 0; 
        j = n-1;

        while(i<=j)
        {
            int mid = (i+j)/2;
            if(arr[mid]<target){
                i = mid+1;
            }
            else if(arr[mid]>target){
                j = mid-1;
            }
            else{
                i = mid+1;
                idx2 = mid;
            }
        }

        int[]brr = new int[]{idx1,idx2};

        return brr;
    }
}