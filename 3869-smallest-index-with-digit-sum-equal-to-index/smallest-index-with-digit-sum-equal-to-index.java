class Solution {
    public int smallestIndex(int[] arr) {

        int lastDigit = 0;
        
        for(int i = 0; i<arr.length; i++)
        {   int sum = 0;
            int num = arr[i];
            while(num>0)
            {
                lastDigit = num%10;
                num = num/10;
                sum = sum + lastDigit;
            }
            if(sum==i) return i;
        }
        return -1;
        
    }
}