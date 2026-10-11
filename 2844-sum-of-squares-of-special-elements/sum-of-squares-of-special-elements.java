class Solution {
    public int sumOfSquares(int[] arr) {
        int n = arr.length;
        int sum = 0;
        int square = 0;
        int idx = 1; 
        for(int i = 0; i<n; i++){
            
            if( n % idx==0)
            {
                square = arr[i] * arr[i];
                sum = sum + square;
            }
            idx++;
        }
        return sum;
    }
}