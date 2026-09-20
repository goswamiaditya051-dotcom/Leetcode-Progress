class Solution {
    public int singleNonDuplicate(int[] arr) {

        int n = arr.length;
        if(n==1) return arr[0];
        if(arr[0]!=arr[1]) return arr[0];
        if(arr[n-1]!=arr[n-2]) return arr[n-1];   
        
        int i = 0;
        int j = n-1;
        int idx = -1;
        while(i<=j){
            int mid = i+(j-i)/2;
            int first = mid;
            int second = mid;

        if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]) return arr[mid];
        if(arr[mid]==arr[mid-1])
        {
           first = mid-1; 
        }
        else{
            second = mid+1;
        }
        int Leftlength = first-i;
        if(Leftlength%2!=0)
        {
            j = first-1;
        }
        else
        {
            i = second+1;
        }

    }
    return -1;
    }
}