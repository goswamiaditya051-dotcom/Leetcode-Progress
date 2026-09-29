class Solution {
    public boolean isPerfectSquare(int arr) {
        long i = 1;
        long j = arr;

        while(i<=j)
        {
            long mid = i+(j-i)/2;
            if(mid*mid==arr)
            {
                return true;
            }
            else if(mid*mid<arr)
            {
                i = mid+1;
            }
            else{
                j = mid-1;
            }
        }
        return false;
    }
}