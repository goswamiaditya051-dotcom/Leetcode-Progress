class Solution {
    public int[] searchRange(int[] arr, int target) {
        
        int n = arr.length;
        int i = 0;
        int j = n-1;

        int first  = -1;
        int last =  -1;

        while(i<=j){// Finding the first Ocurrences 
            int mid = (i+j)/2;
            if(arr[mid]<target)
            {
                i = mid+1;
            }
            else if(arr[mid]>target)
            {
                j = mid-1;
            }
            else{
                j = mid-1;
                first = mid;
            }   
        }
        i = 0;
        j = n-1;

        while(i<=j){
            int mid = (i+j)/2;
            if(arr[mid]<target)
            {
                i = mid+1;
            }
            else if(arr[mid]>target)
            {
                j = mid-1;
            }
            else{
                i = mid+1;
                last = mid;
            }
        }

        int []brr = new int[]{first,last};
        return brr;

    }
}