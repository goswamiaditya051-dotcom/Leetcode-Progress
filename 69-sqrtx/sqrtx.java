class Solution {
    public int mySqrt(int x) {
        long i = 0;
        long j = x;

        while(i<=j)
        {
            long mid = i+(j-i)/2;
            if(mid*mid<x){
                i = mid+1;
            }
            else if(mid*mid>x)
            {
                j = mid-1;
            }
            else{
                return (int)mid;
            }
        }
        return (int)j;

    }
}