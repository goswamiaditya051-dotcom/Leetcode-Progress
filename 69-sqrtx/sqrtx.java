class Solution {
    public int mySqrt(int x) {
        long n = x;
        for(long i = 0; i<=x; i++)
        {
            if(i*i==n) return (int) i;
            if(i*i>n) return (int) i-1;
        }
        return -1;
    }
}